/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class clsDoWhile {
    public static void main (String[] args){
        int valorIterar;
        System.out.println("Ingrese un numero para iterar: ");
        Scanner entradaScanner = new Scanner(System.in);
        valorIterar = entradaScanner.nextInt();
        int contador = 0;
        do{
            System.out.println("El contador es: " +contador);
            contador ++;
        }while (contador > valorIterar);
        
    }
}
