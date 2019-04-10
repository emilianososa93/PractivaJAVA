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
@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //Pedimos el atributo y verificamos si existe.
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        // si es igual a null quiere decir que es la primera vez que entra.
        if (contadorVisitas == null){
            contadorVisitas = new Integer(1);
            titulo = "Bienvenido por primera vez";
        }else{ // si es distinto de null quiere decir que no es la primera vez que ingresa.
            contadorVisitas += 1;
            titulo = "Bienvenido nuevamente";
        }
        // agregamos el atributo a la session.
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        PrintWriter out = response.getWriter();
        out.println("Titulo : " + titulo);
        out.println("<br>");
        out.println("No. Accesos al recurso: "+ contadorVisitas);
        out.println("<br>");
        out.println("ID Session : "+ sesion.getId());
        
    }

   

    

}
