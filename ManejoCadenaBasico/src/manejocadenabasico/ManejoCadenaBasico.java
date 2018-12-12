/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenabasico;

/**
 *
 * @author Emiliano
 */
public class ManejoCadenaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Emiliano";
        String apellido = "Sosa";
        
        System.out.println("Contatenacion:" + nombre + " "+ apellido);
        System.out.println("Nueva Linea: \n" + nombre + " "+ apellido);
        System.out.println("Tabulado: \t" + nombre + " " + apellido);
        System.out.println("Retroceso: \b" + nombre + " " + apellido);
        System.out.println("Retorno de carro: \r" + nombre + " " + apellido);
        System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
        System.out.println("Comilla doble: \"" + nombre + " " + apellido+ "\"");
    }
    
}
