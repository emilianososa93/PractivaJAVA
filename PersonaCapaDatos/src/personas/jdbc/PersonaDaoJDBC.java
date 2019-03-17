/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 *
 * @author Emiliano
 * Esta clase implementa la clase PersonaDAO es una implementacion con la tecnologia JDBC  
 * podria haber otro tipo de implementacion con tecnologia como Hibernate, ibatis, SpringJDBC, etc
 * 
 */
public class PersonaDaoJDBC implements PersonaDao {
    private Connection userConn;
    
    private final String SQL_INSERT = "INSERT INTO persona (nombre, apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ? WHERE id_persona = ?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona";
    
    public PersonaDaoJDBC(){}
    
    public PersonaDaoJDBC(Connection conn){
        this.userConn = conn;
    }
    
    @Override
    public int insert (PersonaDTO persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt  = null;
        int rows = 0;
        try{
            conn = (this.userConn != null ) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, persona.getNombre());
            stmt.setString(index, persona.getApellido());
            System.out.println("Ejecutando el qry" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("La cantidad de lineas agregadas son:" + rows);
            
        }finally{
            Conexion.close(stmt);
            if (this.userConn == null){
                Conexion.close(conn);                
            }            
        }
        return rows;
    }
    
    @Override
    public int update (PersonaDTO persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt  = null;
        int rows = 0;
        try{
            conn = (this.userConn != null ) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, persona.getNombre());
            stmt.setString(index++, persona.getApellido());
            stmt.setInt(index++, persona.getId_persona());
            System.out.println("Ejecutando el qry" + SQL_UPDATE);
            rows = stmt.executeUpdate();
            System.out.println("La cantidad de lineas actualizadas son:" + rows);
            
        }finally{
            Conexion.close(stmt);
            if (this.userConn == null){
                Conexion.close(conn);                
            }            
        }
        return rows;
    }
    
    @Override
    public int delete (PersonaDTO persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt  = null;
        int rows = 0;
        try{
            conn = (this.userConn != null ) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE); 
            stmt.setInt(1, persona.getId_persona());
            System.out.println("Ejecutando el qry" + SQL_DELETE);
            rows = stmt.executeUpdate();
            System.out.println("La cantidad de lineas borradas son:" + rows);
            
        }finally{
            Conexion.close(stmt);
            if (this.userConn == null){
                Conexion.close(conn);                
            }            
        }
        return rows;
    }
    
    @Override
    public List<PersonaDTO> select () throws SQLException{
        Connection conn = null;
        PreparedStatement stmt  = null;
        ResultSet rs = null;
        PersonaDTO personaDTO =null;
        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
        
        try{
            conn = (this.userConn != null ) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT); 
            rs = stmt.executeQuery();
            while (rs.next()){
                int idPersonaTemp = rs.getInt(1);
                String nombreTemp = rs.getString(2);
                String apellidoTemp = rs.getString(3);
                personaDTO = new PersonaDTO();
                personaDTO.setId_persona(idPersonaTemp);
                personaDTO.setNombre(nombreTemp);
                personaDTO.setApellido(apellidoTemp);
                personas.add(personaDTO);                
            }            
        }finally{
            Conexion.close(stmt);
            Conexion.close(rs);
            if (this.userConn == null){
                Conexion.close(conn);                
            }            
        }
        return personas;
    }
    
    
}
