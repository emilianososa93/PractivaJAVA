/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;
import com.gm.ventas.*;
/**
 *
 * @author Emiliano
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Heladera",12000);
        Producto producto2 = new Producto("Televisor",11500);
        Producto producto3 = new Producto("Lavarropas",7800);
        Orden orden1 = new Orden();
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        
        orden1.calcularTotal();
        
        Orden orden2 = new Orden();
        Producto producto4 = new Producto("Horno",6500);
        Producto producto5 = new Producto("Microondas",5000);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.mostrarOrden();
        
        
        
        
    }
    
}
