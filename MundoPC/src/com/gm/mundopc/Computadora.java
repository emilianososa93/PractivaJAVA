/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author Emiliano
 */
public class Computadora {
    private static int contadorComputadora;
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    
    public Computadora(){
        this.idComputadora =++contadorComputadora;
    }
    
    public Computadora(String nombre,Monitor monitor,Raton raton, Teclado teclado){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    public static int getContadorComputadora() {
        return contadorComputadora;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public static void setContadorComputadora(int contadorComputadora) {
        Computadora.contadorComputadora = contadorComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ",\n monitor=" + monitor + ",\n raton=" + raton + ",\n teclado=" + teclado + '}';
    }
    
}
