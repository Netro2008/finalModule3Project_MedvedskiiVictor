package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="easyMode", value="/easyMode")
public class EasyModeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int lives = 3;
        String mode = "easy";
        req.getSession().setAttribute("lives", lives);
        req.getSession().setAttribute("gameMode", mode);

        resp.sendRedirect("easyMode.jsp");
    }
}
