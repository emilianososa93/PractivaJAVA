/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;

import Datos.Conexion;
import Datos.PersonaJDBC;
import java.sql.*;
import domain.Persona;
import java.util.List; 

/**
 *
 * @author Emiliano
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PersonaJDBC personajdbc = new PersonaJDBC();
        Connection conn = null;
        try{
            conn = Conexion.getConection();
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            PersonaJDBC personas = new PersonaJDBC(conn);
            personas.update(12, "Regreso2", "Regreso");
            personas.insert("Miguel2", "Ayala");
            conn.commit();
        }catch (SQLException e){
            try{
                System.out.println("Entramos en rollback");
                e.printStackTrace(System.out);
                conn.rollback();
            } catch (SQLException e1){
                e1.printStackTrace(System.out);
            }           
        }   
         
    }
    
}
