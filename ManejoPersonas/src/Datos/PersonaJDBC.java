/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class PersonaJDBC {
    private final String SQL_INSERT = "INSERT INTO persona (nombre,apellido) VALUES(?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre = ? , apellido = ? WHERE id_persona = ? ";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    private final String SQL_SELECT = "SELECT * FROM persona";
    
    public int insert(String nombre, String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0; //registros afectados        
        try{
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            System.out.println("Ejecutando la siguiente Query: " + SQL_INSERT);
            rows = stmt.executeUpdate(); // indica el numero de registros afectados
            System.out.println("La cantidad de registros afectados fueron: "+rows);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rows;
    }
    
    
    public int update(int id_persona, String nombre, String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0; //registros afectados        
        try{
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index++, id_persona);
            System.out.println("Ejecutando la siguiente Query: " + SQL_UPDATE);
            rows = stmt.executeUpdate(); // indica el numero de registros afectados
            System.out.println("La cantidad de registros actualizados: "+rows);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rows;
    }
    
    public int delete(int id_persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0; //registros afectados        
        try{ 
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_persona); // como es uno solo le indicamos el numero
            System.out.println("\033[30mEjecutando la siguiente Query: " + SQL_DELETE);
            rows = stmt.executeUpdate(); // indica el numero de registros afectados
            System.out.println("La cantidad de registros eliminados: "+rows);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
        } 
        return rows;
    }
    
    public List<Persona> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs =null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<Persona>();
        try{ 
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            System.out.println("Ejecutando la siguiente Query: " + SQL_SELECT);
            while (rs.next()){
                int id_persona = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                persona = new Persona();
                persona.setId_persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personas.add(persona);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        } 
        return personas;
    }
   
}
