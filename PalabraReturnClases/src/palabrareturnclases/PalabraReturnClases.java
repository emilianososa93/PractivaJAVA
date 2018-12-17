/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturnclases;

/**
 *
 * @author Emiliano
 */
public class PalabraReturnClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma s = CrearObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("El resultado es: " + resultado);
    }
    
    public static Suma CrearObjetoSuma(){
        Suma s = new Suma(12,4);
        return s;
    }
    
}

class Suma{
    int a;
    int b;
    
    Suma(int a, int b){
        this.a = a;
        this.b = b;
    }
}
