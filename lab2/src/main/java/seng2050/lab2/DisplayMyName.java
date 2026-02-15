package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayMyName extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        PrintWriter out = resp.getWriter();
        String fname = req.getParameter("firstName");
        String lname = req.getParameter("lastName");
        out.println(HtmlGen.h1(fname + " " + lname));
    }
}
