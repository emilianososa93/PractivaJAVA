/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejointerfaces;
import datos.*;

/**
 *
 * @author Emiliano
 */
public class ManejoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccesoDatos datos =  new ImplementacionOracle();
        Ejecutar(datos,"listar");
        
        datos = new ImplementacionMySql();
        Ejecutar(datos,"insertar");
    }
    
    private static void Ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals(accion)){
            datos.Listar();
        }else{
            datos.Insertar();
        }
    }    
}
