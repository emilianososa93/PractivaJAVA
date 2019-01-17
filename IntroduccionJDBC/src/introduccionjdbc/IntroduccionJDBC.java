/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjdbc;
import java.sql.*;
/**
 *
 * @author Emiliano
 */
public class IntroduccionJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primero cadena de conexion de Mysql o lo que fuere , el parametro useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
        //Cargamos el driver de mysql 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //creamos la conexion
            Connection conexion = (Connection) DriverManager.getConnection(url,"root","admin");
            //creamos el objeto statement
            Statement instruccion = conexion.createStatement();
            //creamos el qry
            String sql = "Select id_persona,nombre,apellido from persona";
            // ejecutamos el qry
            ResultSet result = instruccion.executeQuery(sql);
            while (result.next()){
                System.out.print("Id: "+result.getInt(1));
                System.out.print(" Nombre: "+result.getString(2));
                System.out.print(" Apellido: "+result.getString(3)+"\n");                
            }
            //cerramos los objetos
            result.close();
            instruccion.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();            
        }
            
    }
    
}
