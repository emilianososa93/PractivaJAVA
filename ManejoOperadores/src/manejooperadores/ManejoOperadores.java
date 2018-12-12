/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejooperadores;

/**
 *
 * @author Emiliano
 */
public class ManejoOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1 + 2;
        int b = a + 4;
        double c = b / 2.0;
        double d = c - a;
        double e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("El modulo es:" + a % 2 );
        
        boolean bol = a > b;
        System.out.println("EL valor a menos que b: " +bol);
        
        int min = a > b ? a : b;
        /* si es true devuelve a sino b */
        System.out.println("EL valor min es: " +min);
        
    }
    
}
