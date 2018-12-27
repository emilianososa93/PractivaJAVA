/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosobreescritura;

/**
 *
 * @author Emiliano
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String ObtenerDetalles(){
        // puedo acceder a nombre y sueldo ya que estan definidad como protected por lo tanto en las clases hijas son validas
        return (super.ObtenerDetalles() +"Departamento: "+departamento);
    }
    
}
