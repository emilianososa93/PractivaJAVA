/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propierdadessistema;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class PropierdadesSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties propiedades = System.getProperties();
        Enumeration nombrePropiesdades = propiedades.propertyNames();
        
        // pregunto si todavia contienen elementos, al momento de no tener mas no entra.
        while (nombrePropiesdades.hasMoreElements()){
            String nombrePropiedad =  (String) nombrePropiesdades.nextElement();
            String valorPropiedad =  propiedades.getProperty(nombrePropiedad);
            System.out.println("Llave: "+nombrePropiedad +" = "+valorPropiedad);
           
        }
    }
    
}
