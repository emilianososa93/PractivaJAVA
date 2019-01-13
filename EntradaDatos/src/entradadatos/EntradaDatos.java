/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;
import java.io.*;
/**
 *
 * @author Emiliano
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        try{
            System.out.println("Ingrese datos:");
            captura = bInput.readLine();
            while (captura != null){
                System.out.println("El datos ingresado fue: "+ captura);
                captura = bInput.readLine();    
            }
        }catch(IOException t) {
            t.printStackTrace();
        }
    }
    
}
