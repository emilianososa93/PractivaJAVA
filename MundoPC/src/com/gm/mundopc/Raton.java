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
public class Raton extends DispositivoEntrada {
    private static int contadorRaton;
    private int idRaton;
    
   
    
    public Raton(String tipoEntrada,String marca ){
        super(tipoEntrada,marca);
        this.idRaton = ++contadorRaton;
    }

    public static int getContadorRaton() {
        return contadorRaton;
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        return super.toString() + " Raton{" + "idRaton=" + idRaton + '}';
    }

   

    public static void setContadorRaton(int contadorRaton) {
        Raton.contadorRaton = contadorRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

   

    
    
    
}
