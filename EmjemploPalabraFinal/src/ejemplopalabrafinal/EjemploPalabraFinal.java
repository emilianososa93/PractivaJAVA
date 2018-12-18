/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopalabrafinal;

/**
 *
 * @author Emiliano
 */
public class EjemploPalabraFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nombre persona: "+ClaseFinal.persona1.getNombre());
        ClaseFinal.persona1.setNombre("Emiliano");
        System.out.println("Nombre persona: "+ClaseFinal.persona1.getNombre());
        
        /* el valor puede cambiar pero la referencia al objeto no, es decir si yo creo una nueva instancia de persona apuntado a
        clase final me da error: Ejemplo ClaseFinal.persona1 = new Persona() */
       
        int numeros[]= new int[10];
        numeros[0]=1;
        numeros[numeros.length - 1] = 10;
        
        int numero = numeros[numeros.length - 1];
        for (int i=0;i < numeros.length;i++){
            System.out.println("Arreglo: "+numeros[i]); 
        }
        System.out.println("El numero extraido es: "+numero); 

              

    }
    
}
