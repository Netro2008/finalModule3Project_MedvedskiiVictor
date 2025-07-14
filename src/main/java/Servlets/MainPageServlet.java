package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="MainServlet", value="/mainPage")
public class MainPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("mistakesDone", 0);
        session.setAttribute("index", 1);
        session.setAttribute("attempt", 1);
        session.setAttribute("gameMode", null);
        session.setAttribute("lives", 0);

        resp.sendRedirect("index.jsp");
    }
}
