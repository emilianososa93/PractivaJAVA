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
public class EjemploConversionDatos {
    public static void main(String [] args ){
        // esto es upcasting es decir conversion hacia arriba
        Empleado empleado1;        
        empleado1 = new Escritor("Emiliano",32000,TipoEscritura.CLASICO);
       
        imprimirDetalle(empleado1);
        
        empleado1 = new Gerente("Juan",50000,"Sistemas");
     
        imprimirDetalle(empleado1);
        
    }
    
    private static void imprimirDetalle(Empleado empleado){
        String resultado = null;
        
        System.out.println("\nDetalle:"+empleado.obtenerDetalle());
        
        if (empleado instanceof Escritor ){
            //down casting, es decir, conversion hacia abajo.
            // convertimos empleado al tipo Escritor. 
            resultado = ((Escritor)empleado).tipoescritura.getDescripcion();
            System.out.println("resultado tipo escritura: "+resultado);
           
        }else if (empleado instanceof Gerente){
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println("resultado departamento: "+resultado);
     
        }
    }
        
    
}
