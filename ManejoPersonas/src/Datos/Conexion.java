/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;
/**
 *
 * @author Emiliano
 */
public class Conexion {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "admin";
    private static Driver driver;
    
    public static synchronized Connection getConection () throws SQLException{
        if (driver == null){
            try{
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }catch (Exception e){
                System.out.print("Fallo la conexion del driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }
    
    public static void close (ResultSet rs){
        try{
            if (rs == null){
                rs.close();
            }             
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void close (PreparedStatement ps){
        try{
            if (ps == null){
                ps.close();
            }             
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void close (Connection cx){
        try{
            if (cx == null){
                cx.close();
            }             
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
