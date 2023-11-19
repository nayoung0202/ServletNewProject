package com.example.servletnum;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "servletnum", value = "/num")
public class ServletNum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");
        PrintWriter out = resp.getWriter();

        String inputStr = req.getParameter("inputStr");

        String result = inputStr.replaceAll("[^0-9]", "");
        out.println(result);
    }
}