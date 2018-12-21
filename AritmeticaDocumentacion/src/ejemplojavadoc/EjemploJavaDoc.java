/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc;
import com.gm.javadoc.*;

/**
 *
 * @author Emiliano
 * @version 1.0
 */
public class EjemploJavaDoc {
    public static void main(String args[]){
        int resultado = new Aritmetica(3,2).Suma();
        System.out.println("EL resultado de la suma es: " + resultado);
    }
}
