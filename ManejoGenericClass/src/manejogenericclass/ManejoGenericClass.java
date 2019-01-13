/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericclass;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class ManejoGenericClass {

    /**
     * @param args the command line arguments
     */ 
             
    public static void main(String[] args) {
        
        ClaseGenerica<String> ejemplo = new ClaseGenerica<String>("1");
        ejemplo.obtenerTipo();
        
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(new Integer(100));
        Integer i = lista.get(0);
       
        System.out.print(i);
    }
    
}
