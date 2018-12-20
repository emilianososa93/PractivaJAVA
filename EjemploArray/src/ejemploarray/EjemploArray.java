/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray;

/**
 *
 * @author Emiliano
 */
public class EjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edades[] = new int[3];
        edades[0] = 20;
        edades[1] = 21;
        System.out.println("Arreglo enteros indice 0 : "+ edades[0]);
        System.out.println("Arreglo enteros indice 1 : "+ edades[1]);
        System.out.println("");
        Persona personas[] = new Persona[4];
        personas[0]= new Persona();
        personas[1] = new Persona("Emiliano","Sosa");
        System.out.println("Arreglo Object Persona indice 0 : "+ personas[0]);
        System.out.println("Arreglo Object Persona indice 1 : "+ personas[1]);
        System.out.println("");
        
        Persona personas2[] = {new Persona("Emiliano","Sosa"),new Persona("JUAN","Sosa"),new Persona("PEDRON","Sosa")};
        
        for (int i=0; i < personas2.length; i++){
            System.out.println("Arreglo Object Personas2 indice "+i+" : "+ personas2[i]);
        }
        
        System.out.println("");
        int numeros[][] = new int[3][2];
        numeros[0][0] = 10;
        numeros[0][1] = 20;
        numeros[1][0] = 30;
        numeros[1][1] = 40;
        numeros[2][0] = 50;
        numeros[2][1] = 60;
        
        System.out.println("La matriz en la posicion [0][0]: "+numeros[0][0]);
        System.out.println("La matriz en la posicion [0][1]: "+numeros[0][1]);
        System.out.println("La matriz en la posicion [1][0]: "+numeros[1][0]);
        System.out.println("La matriz en la posicion [1][1]: "+numeros[1][1]);
        System.out.println("La matriz en la posicion [2][0]: "+numeros[2][0]);
        System.out.println("La matriz en la posicion [2][1]: "+numeros[2][1]);
        
        System.out.println("");
        System.out.println("Ahora lo recorro con un for");
        for (int j=0;j < numeros.length; j++){
            for (int k=0; k < numeros[j].length; k++){
                /* numeros[j] es para indicarle el nuermo de renglon seleccionado- */
                System.out.println("La matriz en la posicion " + j + "-" + k + "es: "+numeros[j][k]);
            }
        }

        
    }
    
}
