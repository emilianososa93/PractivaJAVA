/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emiliano
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class RedireccionamientoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Ya no utilizamos el objeto printWriter para enviar la respuesta sino que lo hacemos con el direct
        String url = null;
        String tipoNavegador = request.getHeader("User-Agent");
        System.out.println("Tipo navegador : " + tipoNavegador);
        if (tipoNavegador != null && tipoNavegador.contains("Trident")){
            url = "http://www.microsoft.com";
        }else if (tipoNavegador != null && tipoNavegador.contains("Firefox")){
            url = "http://www.firefox.com";
        }else if (tipoNavegador != null && tipoNavegador.contains("Chrome")){
            url = "http://www.google.com";
        }
        response.sendRedirect(url);            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
