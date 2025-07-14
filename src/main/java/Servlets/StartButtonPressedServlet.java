package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="startingGame", value="/startingGame")
public class StartButtonPressedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("index", 1);

        if(req.getAttribute("attempt") == null) {
            req.getSession().setAttribute("attempt", 1);
        }

        resp.sendRedirect("question-1.jsp");
    }
}
