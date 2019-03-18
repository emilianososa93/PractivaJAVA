/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

import java.sql.CallableStatement;
import java.sql.*;
import Datos.Conexion;
import oracle.jdbc.OracleResultSetMetaData;

/**
 *
 * @author Emiliano
 */
public class TestMetadatos {
    public static void main(String[] args) {
        Connection conn = null ;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexion.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from employees";
            rs = stmt.executeQuery(sql);
            OracleResultSetMetaData rsOracle = (OracleResultSetMetaData) rs.getMetaData();
            
            if (rsOracle == null){
                System.out.println("MetaDatos es nulo");
            }else {
                int columnCount = rsOracle.getColumnCount();
                System.out.println("El numero de columnas de las tablas employees es: " + columnCount);
                
                for (int i=1 ; i< columnCount; i++){
                    System.out.print("Nombre Columna: " + rsOracle.getColumnName(i));
                    System.out.print(", Tipo Columna: " + rsOracle.getColumnTypeName(i));
                    
                    switch (rsOracle.isNullable(i)){
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.print(", No acepta null");
                            break;
                        case OracleResultSetMetaData.columnNullable:
                            System.out.print(", Si acepta null");
                            break;
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.print(", Valor null desconocido");                        
                    }
                    System.out.println("");                        
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(conn);
        }
            
    }
}
