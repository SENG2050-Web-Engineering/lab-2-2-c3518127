package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class generateValidHTML extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head> <title> generateValidHTML </title> </head>");
        out.println("<body>");
        out.println("<h1>generateValidHTML</h1>");
        out.println("<p>Welcome to generateValidHTML</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
