/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabranull;

/**
 *
 * @author Emiliano
 */
public class PalabraNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona person1 = new Persona("Emiliano");
        System.out.println("El nombre en p1 es: " + person1.ObtenerNombre());
        
        Persona person2 = person1;
        System.out.println("El nombre en p2 es: " + person2.ObtenerNombre());
        
        person1 = null;
        System.out.println("El nombre en p2 es: " + person2.ObtenerNombre()); 
        
        if (person1 != null){
            System.out.println("El nombre en p1 es: " + person1.ObtenerNombre());     
        }else{
            System.out.println("Queriendo imprimir p1 pero se perdio la referencia al objeto");                 
        }
    }
    
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String ObtenerNombre(){
        return this.nombre;
    }
    
}
