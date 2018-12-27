/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author Emiliano
 */
public enum TipoEscritura {
    CLASICO("ESCRITURA A MANO"),
    MODERNO("ESCRITURA DIGITAL");
    
    private final String descripcion; 
    
    //definimos un constructor privado
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
