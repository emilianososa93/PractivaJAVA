/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatoscalculadora;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class EntradaDatosCalculadora extends Operaciones{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un valor:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Ingrese otro valor:");
        int b = input.nextInt();
        sumar(a,b);
        restar(a,b);
        
    }
    
}
