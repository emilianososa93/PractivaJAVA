/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class ManejoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // al no especificarle el tipo de que que a contener miLista por defecto tomar los tipo Object
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("10");
        miSet.add("20");
        miSet.add("30");
        miSet.add("40");
        miSet.add("40"); 
        imprimir(miSet);
                
        Map miMap = new HashMap();
        miMap.put("1","Juan");
        miMap.put("2","Pedro");
        miMap.put("3","Carlos");
        imprimir(miMap.keySet());
        imprimir(miMap.values());
        

        
    }
    
    
    public static void imprimir(Collection coleccion ){
        for (Object elemento :  coleccion){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
    }
    
}
