package com.example.session;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Login extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String name = request.getParameter("username");
            String password = request.getParameter("password");
            if(password.equals("javatest")){

                RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
                rd.forward(request,response);
                out.println(" welcome\n " + name);

                HttpSession session = request.getSession();
                session.setAttribute("username", name);
                session.setAttribute("password", password);
                out.print("<a href = 'welcomes'> Welcome </a>");

            }else {
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.include(request, response);
                out.println(" Wrong Password for \n "+ name);
            }

        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }

    }

    public void destroy() {
    }
}