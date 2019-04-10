/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Emiliano
 */
@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");
        //creamos o recuperamos la session
        HttpSession sesion = request.getSession();
        //recuperamos la lista de articulos para esa session si es que habia
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        
        if (articulos == null){
            // si no existe inicializamos la lista y la agregamos a una sesion
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        // ya tenemos la lista ahora agregamos articulos
        if(articuloNuevo != null && !articuloNuevo.trim().equals("") ){
            if (articulos.contains(articuloNuevo) == false){
                articulos.add(articuloNuevo);
            }
            
        }
        try(PrintWriter out = response.getWriter()){
            out.println("<h1>Lista de Articulos</h1>");
            out.println("<br>");
            for (String articulo : articulos){
                out.print("<LI>" + articulo + "</LI>");
            }
            out.println("<br>");
            out.println("<a href='/EjemploCarritoCompras'>Regresar</a>");
        }
        
    }

    

}
