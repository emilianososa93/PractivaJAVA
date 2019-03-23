/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Emiliano
 */
@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String metodoHttp = request.getMethod();
            String uri = request.getRequestURI();
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Headers HTTP</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Header</h1>");
            out.println("Metodo HTTP:" + metodoHttp);
            out.println("<br>");
            out.println("URI solicitado:" + uri);
            out.println("<br>");
            out.println("Host:" + request.getHeader("Host"));
            out.println("<br>");
            out.println("Navegador:" + request.getHeader("User-Agent"));
            out.println("<br>");
            out.println("<br>");
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                String nombreCabecero =  (String) cabeceros.nextElement();
                out.println("<b>" + nombreCabecero + "</b> : ");
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }           
            out.println("</body>");
            out.println("</html>");
            
        }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
    }
}

