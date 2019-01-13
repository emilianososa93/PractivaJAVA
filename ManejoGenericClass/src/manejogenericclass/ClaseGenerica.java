/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericclass;

/**
 *
 * @author Emiliano
 */
public class ClaseGenerica<T> {
    Object objeto;
    
    public ClaseGenerica(Object objeto)
    {
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es de tipo: "+objeto.getClass().getName());
    }

    
    
    
}
