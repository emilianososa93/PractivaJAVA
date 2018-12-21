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
public class Teclado extends DispositivoEntrada{
    private static int contadorTeclado;
    private int idTeclado;
    
    public Teclado(){
    }
    
    public Teclado(String tipoEntrada,String marca){
        super(tipoEntrada,marca);
        this.idTeclado = ++contadorTeclado;

    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }

   

    public int getIdTeclado() {
        return idTeclado;
    }

   

    public static void setContadorTeclado(int contadorTeclado) {
        Teclado.contadorTeclado = contadorTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

   
    
}
