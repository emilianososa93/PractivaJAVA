/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Emiliano
 */
public class OperationException extends Exception{
    public OperationException(String mensaje){
        //inicializamos el mensaje de error de la clase padre
        super(mensaje);
    }
    
}
