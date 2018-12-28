/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author Emiliano
 */
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Emiliano",1000);
        Empleado emp2 = new Empleado("Emiliano",1000);
        comprarObjetos(emp1,emp2);
    }
    
    private static void comprarObjetos(Empleado emp1, Empleado emp2){
        // por defecto llama al metod toString
        System.out.println("El contenido del objeto es: "+emp1);
        if (emp1 == emp2){
            System.out.println("Los objetos tiene la misma posicion de memoria");
        }else{
            System.out.println("Los objetos tienen distinta posicion de memoria");
        }
        
        if (emp1.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido");
        }else{
            System.out.println("Los objetos tienen distinto contenido");
        }
        
        if (emp1.hashCode() == emp2.hashCode()){
            System.out.println("Los objetos tienen el mismo hashcode");
        }else{
            System.out.println("Los objetos tienen distinto hashcode");
        }
    }
}
