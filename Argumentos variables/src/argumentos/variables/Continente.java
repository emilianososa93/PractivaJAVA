/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentos.variables;

/**
 *
 * @author Emiliano
 */
public enum Continente {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int cantidadPaises;
    
    Continente(int cantidadPaises){
        this.cantidadPaises =  cantidadPaises;
    }

    public int getCantidadPaises() {
        return cantidadPaises;
    }
}
