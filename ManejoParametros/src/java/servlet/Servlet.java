/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Emiliano
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Metodo doGet no soportado por servlet");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("Usuario : "+ usuario);
        System.out.println("Password : "+ password);
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro usuario es: " + usuario);
        out.println("<br>");
        out.println("El parametro password es: " + password);
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
