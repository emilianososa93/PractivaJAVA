/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

import java.sql.*;
import Datos.Conexion;
/**
 *
 * @author Emiliano
 */
public class TestProcedimientos {
    public static void main(String[] args) {
        int empleadoId = 101;
        double incrementoSalario = 1.1;
        Connection conn ;
        try{
            conn = Conexion.getConnection();
            Statement stmt = null;
            CallableStatement cstmt = null;
            ResultSet rs = null;
            
            stmt = conn.createStatement();
            System.out.println("Aumento del 10% al empleado "+ empleadoId);
            
            cstmt =  conn.prepareCall("{ call set_employee_salary(?,?)}");            
            cstmt.setInt(1, empleadoId);
            cstmt.setDouble(2, incrementoSalario);
            cstmt.execute();
            cstmt.close();
            
            String query = "SELECT first_name, salary FROM employees WHERE employee_id  = " + empleadoId; 
            rs = stmt.executeQuery(query);
            rs.next();
            
            
            System.out.println("Nombre : " + rs.getString(1));
            System.out.println("Salario nuevo : " + rs.getFloat(2));
        }catch (SQLException e){
            
            e.printStackTrace();
        }
    }
}
