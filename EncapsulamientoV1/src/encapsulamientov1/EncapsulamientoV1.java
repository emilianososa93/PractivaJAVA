/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamientov1;

/**
 *
 * @author Emiliano
 */
public class EncapsulamientoV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona person1 =  new Persona();
        person1.setNombre("Emiliano");
        System.out.println("El nombre asignado es: " +person1.getNombre());
    }
    
}


class Persona{
    /* El objhetivo es que no sea posible acceder al estado del objeto y modificarlo es decir que los set permiten cambiar el
    estado el objeto y el get permite leer el estado del objeto.
    Donde se aplico el encapsulamiento es en la clase persona 
    Es para evitar que clases externa a la clase persona puedan acceder a los atributos persona */
    private String nombre;
    
    /* atributos de la clase en privado  y los metodos para encapsula en publico */
    public String getNombre(){ /* accedos, exceto si son del tipo boolean que el perfijo es is */
        return nombre;
    }
    
    public void setNombre(String nombre){ /* muteitor */
        this.nombre = nombre;
    }
}
