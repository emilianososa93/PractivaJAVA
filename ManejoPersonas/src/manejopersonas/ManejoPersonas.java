/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;

import Datos.PersonaJDBC;
import domain.Persona;
import java.util.List; 

/**
 *
 * @author Emiliano
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaJDBC personajdbc = new PersonaJDBC();
        //personajdbc.insert("Victoria", "Sosa");
        //personajdbc.update(7, "Victoria2", "Sosa2");
        //personajdbc.delete(6);
        List<Persona> personas = personajdbc.select();
        for (Persona persona : personas){
            System.out.println(persona.toString());
            System.out.println("hello!");
        } 
    }
    
}
