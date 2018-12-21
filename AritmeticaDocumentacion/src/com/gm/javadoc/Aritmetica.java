/**
 * Esta clase permite ver los operandos y sumar dos numertos.
 * @author emiliano
 */
package com.gm.javadoc;

/**
 *
 * @author Emiliano
 */
public class Aritmetica {
    /** 
     * Operandos 
     */
    int OperandoA;
    int OperandoB;
    /** 
     * Constructor 
     */
    public Aritmetica(int OperandoA,int OperandoB){
        this.OperandoA = OperandoA;
        this.OperandoB = OperandoB;
        
    }
    
    /** 
     * metodos 
     * @return int reusltado de la suma
     */
    
    public int Suma(){
        return OperandoA + OperandoB;
    }
}
