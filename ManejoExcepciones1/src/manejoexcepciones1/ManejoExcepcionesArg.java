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
public class ManejoExcepcionesArg {
    public static void main(String[] args) throws OperationException{
        try{
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division division = new Division(op1,op2);
            division.VisualizarOperacion();
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("A ocurrido un error");
            System.out.println("Hubo un error al acceder a un elemento fuera de rango");
            aie.printStackTrace();
        }catch(NumberFormatException nfe){
            System.out.println("A ocurrido un error");
            System.out.println("Uno de los argumentos no es entero");
            nfe.printStackTrace();
        }catch(OperationException oe){
            System.out.println("A ocurrido un error");
            System.out.println("Se trato de realizar un operacion erronea");
            oe.printStackTrace();
        }finally{
            System.out.println("Se termino de realizar las excepciones");
        }
    }
}
