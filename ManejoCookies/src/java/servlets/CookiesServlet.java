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
@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //suponemos que el user esta visitando por primera ves el sitio.
        boolean nuevoUsuario = true;
        //obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();
        
        //buscamos si ya existe una cookie creada con anterioridad llamada vistanteRecurrente
        if(cookies != null){
            for (Cookie c: cookies){
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario = false;
                }
            }
        }
        
        //revisamos si el usuario es un nuevo visitante
        String mensaje = null;
        if (nuevoUsuario){
            //en caso de nuevo usuario creamos el objeto cookies
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio";
        }else{
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        //escribimos la salida
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Mensaje: " + mensaje);
        
        
    }
}
