/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray;

/**
 *
 * @author Emiliano
 */
public class EjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edades[] = new int[3];
        edades[0] = 20;
        edades[1] = 21;
        System.out.println("Arreglo enteros indice 0 : "+ edades[0]);
        System.out.println("Arreglo enteros indice 1 : "+ edades[1]);
        System.out.println("");
        Persona personas[] = new Persona[4];
        personas[0]= new Persona();
        personas[1] = new Persona("Emiliano","Sosa");
        System.out.println("Arreglo Object Persona indice 0 : "+ personas[0]);
        System.out.println("Arreglo Object Persona indice 1 : "+ personas[1]);
        System.out.println("");
        
        Persona personas2[] = {new Persona("Emiliano","Sosa"),new Persona("JUAN","Sosa"),new Persona("PEDRON","Sosa")};
        
        for (int i=0; i < personas2.length; i++){
            System.out.println("Arreglo Object Personas2 indice "+i+" : "+ personas2[i]);
        }
        
    }
    
}
