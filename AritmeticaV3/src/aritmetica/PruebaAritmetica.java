/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author Emiliano
 */
public class PruebaAritmetica {
    public static void main(String args[]){
        int operandoA = 6;
        int operandoB = 2;       
        
        Aritmetica obj1 = new Aritmetica(operandoA,operandoB);
        
        /* imprimir operando */
        System.out.println("operandoA: "+ operandoA + " operandoB: " +operandoB);
        
        System.out.println("El resultado de la suma atributos obj1 es: "+obj1.sumar());
      
        System.out.println("El resultado de la resta atributos obj1 es: "+obj1.restar());
       
        System.out.println("El resultado de la multiplicacion atributos obj1 es: "+obj1.multiplicar());

        System.out.println("El resultado de la division atributos obj1 es: "+obj1.dividir());
        /* si creo otro metodo y llamo a estas variables locales dara error ya que las variables locales se destruyen
        al momento que finaliza el metodo que la creo */
       
    }
}
