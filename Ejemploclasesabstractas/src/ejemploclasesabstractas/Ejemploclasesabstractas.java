/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;
import abstracto.domain.*;
/**
 *
 * @author Emiliano
 */
public class Ejemploclasesabstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FiguraGeometrica no se puede instanciar porques es del tipo abstract
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica rectangulo = new Triangulo("Rectangulo");
        FiguraGeometrica circulo = new Triangulo("Circulo");
        
        System.out.println("Triangulo");
        triangulo.Dibujar();
        
        System.out.println("\nRectangulo");
        rectangulo.Dibujar();
        
        System.out.println("\nCirculo");
        circulo.Dibujar();
    }
    
}
