/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones2;
import datos.*;
import excepciones.*;
/**
 *
 * @author Emiliano
 */
public class ManejoExcepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Porqyue ImplementacionMySql aplico la interface AccesoDatos
        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(true);
        ejecutar(datos,"listar");
        
        
        datos.simularError(true);
        ejecutar(datos,"insertar");

                
        
    }
    
    private static void ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals(accion)){
            try{
               datos.listar();
            }catch(LecturaDatosEx ex){
                System.out.println("Error de lectura: Procesa la excepcion mas especifica de lectura de datos");
            }catch (AccesoDatosEx ex){
                System.out.println("Error de acceso datos: Procesa la excepcion mas generica de acceso de datos");                
            }catch (Exception ex){
                System.out.println("Error general");                
            } finally{
                System.out.println("Procesar finally es opcional");   
            }
        }else if ("insertar".equals(accion)){
            try{
               datos.insertar();
            }catch (AccesoDatosEx ex){
                System.out.println("Error de acceso datos: Procesa la excepcion mas generica de acceso de datos");                
            }  finally{
                System.out.println("Procesar finally es opcional");   
            }          
        }else{
            System.out.println("No se proporciono ninguna accion");    
        }
    }
    
    
}
