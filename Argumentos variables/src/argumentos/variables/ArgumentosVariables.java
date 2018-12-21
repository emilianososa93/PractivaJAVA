/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentos.variables;

/**
 *
 * @author Emiliano
 */
public class ArgumentosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirForEach(1,2,3,5,4,8,45);
        System.out.println("");
        imprimirVarios("EMiliano","SOSA",12,514,584,545,1);
        System.out.println("");
        imprimirNumero(10,212,212,558);
    }
    
    public static void imprimirNumero(int... numeros){
        for(int i=0;i < numeros.length;i++){
            System.out.println("El numero es: "+numeros[i]);
        }
    }
    
    public static void imprimirForEach(int... numeros){
        for(int numero : numeros){
            System.out.println("El numero es: "+numero);
        }
    }
    
    public static void imprimirVarios(String nombre, String Apellido,int... numeros){
        System.out.println("El nombre es: "+nombre);
        System.out.println("El apellido es: "+Apellido);

        for(int numero : numeros){
            System.out.println("El numero es: "+numero);
        }
    }
}
