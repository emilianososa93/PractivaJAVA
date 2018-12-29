/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto.domain;

/**
 *
 * @author Emiliano
 */
public class Circulo extends FiguraGeometrica {
    
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void Dibujar(){
        System.out.println("Aqui se deberia dibujar un: "+this.getClass().getSimpleName());
    }
}
