/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolconexiones;
import java.sql.*;
import capadatos.pool.PoolConexionesMySql;
import capadatos.pool.PoolConexionesOracle;
/**
 *
 * @author Emiliano
 */
public class TestPoolConexiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs  = null;
        try{
            conn = PoolConexionesMySql.getConexion();
            System.out.println("Utilizamos el pool de conexiones de MySQL");
            stmt = conn.prepareStatement("SELECT * FROM persona");
            rs = stmt.executeQuery();
            while (rs.next()){
                System.out.print(" " + rs.getInt(1));
                System.out.print(" " + rs.getString(2));
                System.out.print(" " + rs.getString(3));
                System.out.println(" ");
            }
            conn.close();
            
            conn = PoolConexionesOracle.getConexion();
            System.out.println("Utilizamos el pool de conexiones de Oracle");
            stmt = conn.prepareStatement("SELECT * FROM employees WHERE employee_id in (100,101,102)");
            rs = stmt.executeQuery();
            while (rs.next()){
                System.out.print(" " + rs.getInt(1));
                System.out.print(" " + rs.getString(2));
                System.out.print(" " + rs.getString(3));
                System.out.println(" ");
            }
            conn.close();
            
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
