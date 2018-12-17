/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrastaticv1;

/**
 *
 * @author Emiliano
 */
public class PalabraStaticV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona person1 = new Persona("Emiliano");
        System.out.println("El objeto es: "+person1);
        
        Persona person2 = new Persona("Juan");
        System.out.println("El objeto es: "+person2);
        /* como es un metodo static tengo que anteponer a la clase, no al objeto*/
        System.out.println("El numero de personas es: " + Persona.getObtenerPersona());

    }
    
}


class Persona{
    private String nombre;
    private int idPersona;
    private static int contadorPersona;
    
    public Persona(String nombre){
        contadorPersona++;
        idPersona = contadorPersona;
        this.nombre = nombre;
    }
    
    public static int getObtenerPersona(){
        return contadorPersona;
    }
    
    @Override
    public String toString(){
        return ("Persona{idPersona:" +idPersona+ ", nombre = "+ nombre+"}");
    }
}