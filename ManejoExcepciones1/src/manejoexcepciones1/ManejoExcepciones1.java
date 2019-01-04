/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;
import domain.*;
/**
 *
 * @author Emiliano
 */
public class ManejoExcepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           Division division = new Division(20,0);
           division.VisualizarOperacion();
        }catch(OperationException oe){
            System.out.println("A ocurrido un error");
            // stacktrace es la pila de errores
            oe.printStackTrace();
        }
    }
    
}
