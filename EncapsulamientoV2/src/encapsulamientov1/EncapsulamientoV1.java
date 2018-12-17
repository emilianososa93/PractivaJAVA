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
        Persona person1 =  new Persona("Juan","Perez",false);
        System.out.println("El nombre asignado es: " +person1.getNombre());
        
        Persona person2 =  new Persona("Emiliano","Sosa",false);
        /* el metodo println hace una llamada directa el metodo toString para que podamos imprimir una cadena que representa 
        al tipo persona */
        System.out.println("El estado objeto person2 es: " +person2);
        
        person2.setBorrado(true);
        System.out.println("El estado objeto person2 es: " +person2);
        
        Persona person3 =  new Persona();
        System.out.println("El estado objeto person3 es: " +person3);      
    }   
}

class Persona{
    public Persona(){}
    
    public Persona(String nombre, String apellido, boolean borrado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }
    
    private String nombre;
    private String apellido;
    private Boolean borrado;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Boolean IsBorrado() {
        return borrado;
    }
    
    @Override
    public String toString(){
        return("Persona{"+ "nombre="+ nombre +", apellido = "+ apellido + ", borrado = "+ borrado +"}");
    }
    
    
}
