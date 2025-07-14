package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="hardcoreMode", value="/hardcoreMode")
public class HardcoreModeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int lives = 1;
        String mode = "hardcore";
        req.getSession().setAttribute("lives", lives);
        req.getSession().setAttribute("gameMode", mode);

        resp.sendRedirect("hardcoreMode.jsp");
    }
}
