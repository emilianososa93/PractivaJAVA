/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author Emiliano
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    Caja(){}
    
    Caja(int ancho,int alto,int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    int FormulaCubo(){
        return (ancho * alto *profundo);
    }
}
