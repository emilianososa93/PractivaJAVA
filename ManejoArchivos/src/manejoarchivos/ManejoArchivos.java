/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;
import static Utileria.Archivos.*;
/**
 *
 * @author Emiliano
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\Emiliano\\Desktop\\Curso Java Udemy\\pruebaJava.txt";
    
    public static void main(String[] args) {
        crearArchivo(NOMBRE_ARCHIVO);
        escribirArchivo(NOMBRE_ARCHIVO);
        leerArchivo(NOMBRE_ARCHIVO);
        anexarArchivo(NOMBRE_ARCHIVO);
        leerArchivo(NOMBRE_ARCHIVO);
    }
    
}
