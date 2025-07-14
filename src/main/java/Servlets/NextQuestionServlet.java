package Servlets;

import QuestionsInfo.QuestionBank;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="nextQuestionServlet", value="/nextQuestion")
public class NextQuestionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if(session.getAttribute("mistakesDone") == null) {
            session.setAttribute("mistakesDone", 0);
        }

        int nextQuestion = gettingNextQuestionIndex(req, resp);

        if (nextQuestion == -1 && session.getAttribute("lives") != "DEAD") {
            resp.sendRedirect("quest-completed.jsp");
            return;
        }

        boolean isWrongAnswer = Boolean.parseBoolean(req.getParameter("isWrong"));

        if (isWrongAnswer && session.getAttribute("mistakesDone") != null) {
            int mistakesDone = (int) session.getAttribute("mistakesDone");
            session.setAttribute("mistakesDone", mistakesDone + 1);
        }

        if (session.getAttribute("lives").equals("❤️❤️❤️") && isWrongAnswer) {
            session.setAttribute("lives", "❤️❤️");
        } else if (session.getAttribute("lives").equals("❤️❤️") && isWrongAnswer) {
            session.setAttribute("lives", "❤️");
        } else if(session.getAttribute("lives").equals("❤️") && isWrongAnswer) {
            session.setAttribute("lives", "DEAD");
            resp.sendRedirect("game-over.jsp");
            return;
        }

        if(!isWrongAnswer || !session.getAttribute("lives").equals("DEAD")) {
            session.setAttribute("isWrong", false);
            resp.sendRedirect("question-" + nextQuestion + ".jsp");
        }

        if (session.getAttribute("attempt") == null) {
            session.setAttribute("attempt", 1);
        }
    }

    public int gettingNextQuestionIndex(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        int maxQuestions = QuestionBank.getTotalQuestions();

        int currentIndex = (Integer) session.getAttribute("index");
        int nextIndex = currentIndex + 1;

        if (nextIndex > maxQuestions) {
            return -1;
        }

        session.setAttribute("index", nextIndex);

        return nextIndex;
    }
}
