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
public class Producto {
    private static int contadorProducto;
    private int idProducto;
    private String nombre;
    private double precio;
    
    public Producto(){
        this.idProducto = ++contadorProducto;
    }
    
    public Producto(String nombre,double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    
}
