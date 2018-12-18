/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author Emiliano
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        Empleado empleado1 = new Empleado("Emiliano",32000);
        System.out.println("Imprimimos el objeto empleado 1:");
        System.out.println(empleado1);
        System.out.println("------------------------------------------------------------------------");
        Empleado empleado2 = new Empleado("Juan",33000);
        empleado2.setEdad(25);
        empleado2.setGenero('F');
        empleado2.setDireccion("Aguado 682");
        System.out.println("Imprimimos el objeto empleado 2:");
        System.out.println(empleado2);
        System.out.println("------------------------------------------------------------------------");
        Cliente cliente1 = new Cliente(new java.util.Date(),true);
        System.out.println("Imprimimos el objeto cliente 1:");
        System.out.println(cliente1);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Imprimimos el objeto cliente 1 modificado:");
        cliente1.setNombre("Victoria");
        cliente1.setEdad(22);
        cliente1.setGenero('F');
        cliente1.setDireccion("Aguado 686");
        System.out.println(cliente1);
        
        
    }
    
}
