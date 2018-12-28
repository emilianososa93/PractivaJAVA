/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

import java.util.Objects;

/**
 *
 * @author Emiliano
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{ nombre = " + nombre + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int hashCode() {
        // Double.valueOf porque el sueldo es double y es un tipo primitivo
        int hash = 7;
        hash = 31 * hash + (this.nombre).hashCode();
        hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Empleado){
            Empleado emp = (Empleado) obj;
            // Double.valueOf porque el sueldo es double y es un tipo primitivo
            if (nombre.equals(emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    
}
