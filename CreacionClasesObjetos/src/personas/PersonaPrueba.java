/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Emiliano
 */
public class PersonaPrueba {
    public static void main(String[] args){
        Persona person1 = new Persona();
        
        System.out.println("Los valores por defectos son: ");
        person1.desplegarNombre();
        System.out.println("----------------------------------------");
        
        System.out.println("\nLos nuevo valores asignado son: ");
        person1.nombre = "Emiliano";
        person1.apellidoMaterno = "Rodriguez";
        person1.apellidoPaterno = "Sosa";
        person1.desplegarNombre();
        
        System.out.println("----------------------------------------");
        Persona person2 =  new Persona();
        person2.nombre = "Victoria";
        person2.apellidoMaterno = "Eugenia";
        person2.apellidoPaterno = "Sosa";
        person2.desplegarNombre();
        
        
    }
}
