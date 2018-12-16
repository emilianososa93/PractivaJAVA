/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Emiliano
 */
public class ManejoVariablesTest {
    public static void main(String[] args) {
       int valorMes = 1;       
       String estacion = null;
       
       switch(valorMes){
            case 12: case 1: case 2:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;                
       }
       System.out.println("La estacion a la que pertenece el mes " + valorMes + " corresponde a: " + estacion);  
    }
      
}
