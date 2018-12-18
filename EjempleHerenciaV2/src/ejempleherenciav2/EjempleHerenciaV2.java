/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempleherenciav2;

/**
 *
 * @author Emiliano
 */
public class EjempleHerenciaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona person1 = new Persona("Emiliano",25);
        System.out.println("El objeto persona 1 es" );
        System.out.println(person1);
        
        Persona person2 = new Persona("Juan",23);
        System.out.println("El objeto persona 2 es" );
        System.out.println(person2);
        
        Empleado empleado1 = new Empleado("Pedro",30,35000);
        System.out.println("El objeto empleado 1 es" );
        System.out.println(empleado1);
                
        
    }
    
}
