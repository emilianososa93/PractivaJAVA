/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorIterar;
        System.out.println("Ingrese un valor a iterar");
        Scanner entradaScanner = new Scanner(System.in);
        valorIterar = entradaScanner.nextInt();
        for (int i=0; i < valorIterar;i++){
            System.out.println("El contador es: "+ i);
        }
    }
    
}
