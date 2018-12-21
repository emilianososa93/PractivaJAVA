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
public class Orden {
    private final int idOrden;
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 10;
    private final Computadora computadoras[];
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[maxComputadoras];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras < maxComputadoras){
            computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("Se ha llegado al tope maximo"+maxComputadoras);
        }
    }
    
    public double calcularTotal(){
        int total = 0;
        for (int i=0; i< contadorComputadoras;i++){
            total += computadoras[i].getIdComputadora();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("El ID de la orden es"+idOrden);
        System.out.println("El total de la orden es"+calcularTotal());
        System.out.println("Lascomputadoras cargadas a la orden "+idOrden+ " son:");
        for (int j=0;j < computadoras.length;j++){
            System.out.println(computadoras[j]);
         }
    }
    
}
