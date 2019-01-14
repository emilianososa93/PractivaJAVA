/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatosscanner;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class EntradaDatosScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String captura;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un dato: ");
        captura = input.nextLine();
        while (captura != null){
            System.out.println("El valor ingresado es: "+captura);
            captura = input.nextLine();
        }
    }
    
}
