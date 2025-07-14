package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="startNewGameServlet", value="/startNewGame")
public class StartAgainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        session.setAttribute("mistakesDone", 0);

        if (session.getAttribute("gameMode") == "hardcore") {
            session.setAttribute("lives", 1);
        } else {
            session.setAttribute("lives", 3);
        }

        Integer currentAttempt = (Integer) session.getAttribute("attempt");
        if (currentAttempt == null) {
            currentAttempt = 1;
        }
        session.setAttribute("attempt", currentAttempt + 1);

        session.setAttribute("index", 1);
        resp.sendRedirect("startingGame");
    }
}
