/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;

/**
 *
 * @author Emiliano
 */
public class TestPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaDao personaDao = new PersonaDaoJDBC();
        
        PersonaDTO personaDto = new PersonaDTO();
        // LOGICA INSERT
        //        personaDto.setNombre("Emiliano123");
        //        personaDto.setApellido("Sosa");
        //        try{
        //            personaDao.insert(personaDto);
        //        }catch (SQLException e){
        //            System.out.println("Excepcion en la capa de prueba");
        //            e.printStackTrace();
        //        }
        
        // LOGICA DELETE
        //        personaDto.setId_persona(17);
        //        try{
        //            personaDao.delete(personaDto);
        //        }catch (SQLException e){
        //            System.out.println("Excepcion en la capa de prueba");
        //            e.printStackTrace();
        //        }
        
        // LOGICA UPDATE
        //        personaDto.setNombre("Emiliano Nuevo");
        //        personaDto.setApellido("Sosa nuevo");
        //        personaDto.setId_persona(17);
        //        
        //        try{
        //            personaDao.update(personaDto);
        //        }catch (SQLException e){
        //            System.out.println("Excepcion en la capa de prueba");
        //            e.printStackTrace();
        //        }
        // 
        
        // LOGICA SELECT
        try{
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO _personaDto :personas){
                //OPCION 1
                //System.out.print("id_persona: "+ personaDto.getId_persona() + " ");
                //System.out.print("nombre: "+ personaDto.getNombre()+ " ");
                //System.out.print("apellido: "+ personaDto.getApellido()+ " ");
                //System.out.println();
                
                //OPCION 2
                System.out.println(_personaDto.toString());
            }
        }catch (SQLException e){
                    System.out.println("Excepcion en la capa de prueba");
                    e.printStackTrace();
              }
        
        }
    
}
