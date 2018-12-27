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
public class EjemploSobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Emiliano",32000);
        System.out.println("El resultado es: "+empleado1.ObtenerDetalles());
        
        Gerente gerente1 = new Gerente(empleado1.getNombre(),empleado1.getSueldo(),"Sistemas");
        System.out.println("El resultado es: "+gerente1.ObtenerDetalles());
        
        
        System.out.println("Polimorfimo");
        // se ejecuta el metodo al que apuntaen el tiempo de ejcucion
        // aca la variable del tipo empleado apunta a empleado
        Empleado empleado2 = new Empleado("Juan",38000);
        Imprimir(empleado2);
        // pero ahora la variable va a apuntar a gerente por lo tanto el polimorfimo se queda con gerente.
        // esto se puede porque son clases padre e hijas, si no tiene nanda que ver arroja error
        Gerente gerente2  = new Gerente("Pedron",40000,"Finanzas");
        Imprimir(gerente2);

        System.out.println("Instance of");
        if (gerente2 instanceof Gerente){
            System.out.println("Es un gerente");
        }else {
            System.out.println("Es un empleado");
        }
        

    }
    //El tipo que recibe el metodo es de la clase padre (Empleado=
    //Sin embargo al momemto de ejecutar el metodo, se ejecuta el del hijo (Gerente)
    //eso es el polimorfismo, multiples formas pero es distintos tiempos de ejecucion
    public static void Imprimir(Empleado emp){
        System.out.println("El resultado es: "+emp.ObtenerDetalles());
    }
    
}
