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
public class Escritor extends Empleado{
    final TipoEscritura tipoescritura;
    
    public Escritor(String nombre,double sueldo,TipoEscritura tipoescritura){
        super(nombre, sueldo);
        this.tipoescritura = tipoescritura;
    }

    public TipoEscritura getTipoescritura() {
        return tipoescritura;
    }
    
    public String obtenerDetalle(){
        return super.obtenerDetalle() + ", Tipo Escritura: "+ tipoescritura.getDescripcion();
    }
    
    public String getTipoEscrituraEnTexto() {
        return tipoescritura.getDescripcion();
    }
    
}
