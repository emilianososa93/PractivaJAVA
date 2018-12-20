/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.ventas;

/**
 *
 * @author Emiliano
 */
public class Orden {
    private static int contadorOrdenes;
    private final int idOrden;
    private final Producto productos[];
    private int contadorProductos;
    private static final int maximosProductos = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[maximosProductos];        
    }
    
    
    public void agregarProducto(Producto producto){
        if (contadorProductos < maximosProductos ){
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("Se supero el limite de productos"+maximosProductos);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (int i=0; i < contadorProductos; i++){
            total += productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("El ID de la orden es"+idOrden);
        System.out.println("El total de la orden es"+calcularTotal());
        System.out.println("Los productos cargados a la orden "+idOrden+ " son:");
        for (int j=0;j < productos.length;j++){
            System.out.println(productos[j]);
         }
        
        
    }    
}
