/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Emiliano
 */
public class Conexion {
    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static Driver driver = null;
    private static String JDBC_FILE_NAME = "jdbc";
    
    public static Properties loadPropierties(String file){
        Properties prop = new Properties();
        // lee el archivo pasado
        ResourceBundle bundle = ResourceBundle.getBundle(file);
        // obtenemos las clave y la asignamos a una enumeracion
        Enumeration e = bundle.getKeys();
        //
        String key = null;
        while (e.hasMoreElements()){
            key = (String) e.nextElement();
            prop.put(key, bundle.getObject(key));            
        }
        JDBC_DRIVER = prop.getProperty("driver");
        JDBC_URL = prop.getProperty("url");
        JDBC_USER = prop.getProperty("user");
        JDBC_PASS = prop.getProperty("pass");
        return prop;
    }
    
    public static synchronized Connection getConnection() throws SQLException{
        if (driver == null){
            try{
                //cargamos las propierdades de la conexion de la BD
                loadPropierties(JDBC_FILE_NAME);
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }catch (Exception e){
                System.out.println("Fallo al cargar el driver");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    } 
    
    public static void close (ResultSet rs){
        try{
            if (rs != null){
                rs.close();
            }
        } catch (SQLException e){
            System.out.println("No se pudo cerrar el Resultset");
            e.printStackTrace();
        }
    }
    
    
    public static void close (PreparedStatement stmt){
        try{
            if (stmt != null){
                stmt.close();
            }
        } catch (SQLException e){
            System.out.println("No se pudo cerrar el PreparedStatement");
            e.printStackTrace();
        }
    }
    
    public static void close (Connection conn){
        try{
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e){
            System.out.println("No se pudo cerrar la Connection");
            e.printStackTrace();
        }
    }
            
}
