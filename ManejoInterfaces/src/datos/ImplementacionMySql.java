/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Emiliano
 */
public class ImplementacionMySql implements AccesoDatos{
    @Override
    public void Insertar(){
        System.out.println("Se esta insertando desde MySql");
    }
    
    @Override
    public void Listar(){
        System.out.println("Se esta listando desde MySql");
    }
}
