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
public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    
    public void desplegarNombre(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido paterno es: " + apellidoPaterno);
        System.out.println("El apellido materno es: " + apellidoMaterno);
    }
    
   
}
