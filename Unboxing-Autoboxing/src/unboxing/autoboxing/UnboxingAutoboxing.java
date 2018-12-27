/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unboxing.autoboxing;

/**
 *
 * @author Emiliano
 */
public class UnboxingAutoboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Autoboxing
        Integer numero = 10;
        System.out.println("El numero es: " + numero);
        System.out.println("El tipo del numero es: " + numero.getClass());
        
        
        
        //unboxing
        int numero1 = numero;
        System.out.println("El numero es: " + numero1);

        
    }
    
}
