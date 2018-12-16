/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author Emiliano
 */
public class PruebaAritmetica {
    public static void main(String args[]){
        Aritmetica obj1 = new Aritmetica();
        int resultado = obj1.sumar(5,4);
        System.out.println("El resultado de la suma directa obj1 es: "+resultado);
        
        System.out.println("El resultado de la suma atributos obj1 es: "+obj1.sumar());
        
        Aritmetica obj2 = new Aritmetica(2,1);
        System.out.println("El resultado de la suma atributos obj2 es: "+obj2.sumar());
       
        
    }
}
