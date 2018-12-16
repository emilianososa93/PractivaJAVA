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
public class CicloWhileV2 {
    public static void main(String[] args) {
       System.out.println("Ingrese un numero de elementos a iterar:");
       int maxElement;
       Scanner entradaScanner = new Scanner(System.in); /*Creo el objecto scanner para leer datos */
       maxElement = entradaScanner.nextInt(); /* leo el dato ingresado y lo guardo en una variable */
       int contador = 0;
       while (contador < maxElement){
           System.out.println("contador = "+ contador);
           contador++;
       }
       
    }
}
