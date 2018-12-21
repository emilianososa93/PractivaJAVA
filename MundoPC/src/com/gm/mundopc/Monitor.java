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
public class Monitor extends DispositivoEntrada{
    private static int contadorMonitor;
    private int idMonitor;
    private String marca;
    private double tamaño;
    
    public Monitor(){
        
    }
    
    public Monitor(String tipoEntrada,String marca, double tamaño){
        super(tipoEntrada,marca);
        this.tamaño = tamaño;
        this.idMonitor = ++contadorMonitor;
    }

    @Override
    public String toString() {
        return super.toString() + " Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
}
