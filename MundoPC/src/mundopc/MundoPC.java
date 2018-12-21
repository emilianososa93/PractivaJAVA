/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;
import com.gm.mundopc.*;

/**
 *
 * @author Emiliano
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DispositivoEntrada dispositivo1 = new DispositivoEntrada("Input","Genius");
              
        Teclado teclado1 = new Teclado(dispositivo1.getTipoEntrada(),dispositivo1.getMarca());
        Raton raton1 = new Raton(dispositivo1.getTipoEntrada(),dispositivo1.getMarca());
        Monitor monitor1 = new Monitor(dispositivo1.getTipoEntrada(),dispositivo1.getMarca(),15);
        Computadora computadora1 = new Computadora("Notebook1",monitor1,raton1,teclado1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.calcularTotal();
        orden1.mostrarOrden();
        

 
        
    }
        
  
}
