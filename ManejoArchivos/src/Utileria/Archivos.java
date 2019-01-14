/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utileria;
import java.io.*;
/**
 *
 * @author Emiliano
 */
public class Archivos {
    public static void crearArchivo(String nombreArchivo){
        // eñ objeto creado se llama 'archivo'
        // la ruta especificada se va a llamar 'nombreArchivo'
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente el archivo \n");
        }catch(IOException e){
            e.printStackTrace();
        }       
    } 
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null){
                System.out.println("lectura: "+lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
    
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            String contenido = "Anexando informacion en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexo");
            salida.close();
            System.out.println("Se ha anxado correctamente el archivo \n");
        }catch(IOException e){
            e.printStackTrace();
        }       
    } 
}
