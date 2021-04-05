package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        if (username == null || password == null ){
            RequestDispatcher dispatcher = req.getRequestDispatcher("login/login.jsp");
            dispatcher.forward(req,resp);
        }else if (username.equals("admin") && username.equals("admin")){
            session.setAttribute("logged",true);
            resp.sendRedirect("/student");
        }else{
            req.setAttribute("message", "wrong input");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login/login.jsp");
            dispatcher.forward(req,resp);
        }

    }
}
