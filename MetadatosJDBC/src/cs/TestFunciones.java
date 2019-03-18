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
public class TestFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        int empleadoId = 101;
        try{
            Connection conn = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salarioMensual;
            cstmt =  conn.prepareCall("{ ? = call get_employee_salary(?)}");
            //registramos los parametros
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual = cstmt.getDouble(1);
            System.out.println("Empleado con Id = " + empleadoId);
            System.out.println("El salario mensual es = " + salarioMensual);
        }catch (SQLException e){
            
            e.printStackTrace();
        }
    }
    
}
