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
public class PruebaCaja {
    public static void main(String args[]){
        Caja caja1 = new Caja(3,2,6);
        System.out.println("El ancho es : "+caja1.ancho);
        System.out.println("El alto es:"+caja1.alto);
        System.out.println("La profundidad es : "+caja1.profundo);
        System.out.println("El calculo de la foruma es : " +caja1.FormulaCubo());
       
    }
}
