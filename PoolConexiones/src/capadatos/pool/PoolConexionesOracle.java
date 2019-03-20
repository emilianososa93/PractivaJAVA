/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
/**
 *
 * @author Emiliano
 */
public class PoolConexionesOracle {
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("hr");
        ds.setPassword("hr");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        //definimos el tamaño del pool de conexines
        ds.setInitialSize(5); //definimos 5 conexiones iniciales
        return ds;
    }
    
    public static Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
    }
}
