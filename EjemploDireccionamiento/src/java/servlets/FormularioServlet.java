/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Emiliano
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
        PrintWriter out = response.getWriter();
        
        String usuarioCorrecto  = "Juan";
        String passCorrecto = "123";
         
        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");
         
        if (usuarioCorrecto.equals(pUsuario) && pPassword.equals(passCorrecto)){
            out.println("<h1>");
            out.println("Datos Correctos");
            out.println("<br>Usuario: " + pUsuario);
            out.println("<br>Password: " + pPassword);
            out.println("</h1>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "La credenciales son incorrectas");
        }
        out.close();
    }

}
