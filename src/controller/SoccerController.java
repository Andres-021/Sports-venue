/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.ConnectionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Soccer;
import utils.Response;

/**
 *
 * @author andre
 */
public class SoccerController {
    // Instanciamos la conexion
    private ConnectionMySql sql = new ConnectionMySql();
    // Creamos un objeto connection y le asignamos la conexion
    private Connection conn = sql.conectarMySQL();
    private String query = "";
    
    
    public Response insert(Soccer soccer){
        // Logica de inser a la base de datos
        Response res = null;
        int success = 0;
        // Asignamos la consulta
        String query_validate_cod = "SELECT cod FROM SOCCER WHERE cod = ?";
        
        query = "INSERT INTO SOCCER("
                + "cod, name1, name2, lastName1, lastName2, age, speed, positionn, goals_score, assists, pass"
              + ") "
              + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt;
            // Consultamos si el codigo existe
//            res = this.getById(soccer.getCod());
//            if(res.isSuccess()){
            pstmt = conn.prepareStatement(query_validate_cod);
            pstmt.setInt(1, soccer.getCod());
            
            ResultSet resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                res = new Response(false, "Ya se encuentra el codigo que intenta agregar");
                return res;
            }
            
            // Pasamos el query
            pstmt = conn.prepareStatement(query);
            
            // ASignamos los valores de los signos eje: VALUES(?,?)
            pstmt.setInt(1, soccer.getCod());
            pstmt.setString(2, soccer.getName1());
            pstmt.setString(3, soccer.getName2());
            pstmt.setString(4, soccer.getLastName1());
            pstmt.setString(5, soccer.getLastName2());
            pstmt.setInt(6, soccer.getAge());
            pstmt.setInt(7, soccer.getSpeed());
            pstmt.setString(8, soccer.getPosition());
            pstmt.setInt(9, soccer.getGoals_score());
            pstmt.setInt(10, soccer.getAssists());
            pstmt.setInt(11, soccer.getPass());
            // Ejecutamos el query
            success = pstmt.executeUpdate(); // Este metodo se usa cuando son consultas de INSERT 
            if(success <= 0){
                pstmt.close();
                
                res = new Response(true, "El futbolista no pudo ser creado");
                return res;
            }
            pstmt.close();
            resultSet.close();
        
            // Esto para mostrar informacion al usuario
            res = new Response(true, "El futbolista se ha creado exitosamente");
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        res = new Response(false, "Hubo un error en la ejecucion del metodo");
        return res; // Retornamos el mensaje
    }
    
    
    public Response getById(int id){
        // Logica de select a la base de datos
        // Creamos una lista de objeto soccer
        List<Object> data = new ArrayList<>();
        Response res = null;
        // Creamos una consulta con el id para filtrar en la tabla
        query = "SELECT * FROM SOCCER WHERE cod = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            // Ejecutamos el query y obtenemos los datos
            ResultSet resultSet = pstmt.executeQuery(); // Este metodo se usa cuando son consultas de SELECT
            if(resultSet == null){
                pstmt.close();
                resultSet.close();
                
                res = new Response(true, "No se encontro el futbolista");
                return res;
            }
            
            while(resultSet.next()){
                //"name1, name2, lastName1, lastName2, age, speed, position, goals_score, assists, pass"
                // Creamos el modelo para guardarlo en una lista y retornarlo
                Soccer soccer = new Soccer(
                    resultSet.getInt("cod"),
                    resultSet.getString("name1"),
                    resultSet.getString("name2"),
                    resultSet.getString("lastName1"),
                    resultSet.getString("lastName2"),
                    resultSet.getInt("age"),
                    resultSet.getInt("speed"),
                    resultSet.getString("positionn"),
                    resultSet.getInt("goals_score"),
                    resultSet.getInt("assists"),
                    resultSet.getInt("pass")
                );
                
                // Guardamos las columna por fila iterada
                data.add(soccer);
            }
            
            // Cerramos
            pstmt.close();
            resultSet.close();
            
            res = new Response(true, "Se ha encontrado el futbolista", data);
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Esto para mostrar informacion al usuario
        res = new Response(true, "Hubo un error en la ejecucion del metodo");
        return res; // Retornamos el mensaje
    }
    
    
    public Response getAll(){
        // Logica de select a la base de datos
        // Creamos una lista de objeto soccer
        List<Object> data = new ArrayList<>();
        Response res = null;
        // Creamos una consulta con el id para filtrar en la tabla
        query = "SELECT * FROM SOCCER";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            // Ejecutamos el query y obtenemos los datos
            ResultSet resultSet = pstmt.executeQuery(); // Este metodo se usa cuando son consultas de SELECT
            if(resultSet == null){
                pstmt.close();
                resultSet.close();
                
                res = new Response(true, "No se encontraron futbolistas");
                return res;
            }
            
            while(resultSet.next()){
                //"name1, name2, lastName1, lastName2, age, speed, position, goals_score, assists, pass"
                // Creamos el modelo para guardarlo en una lista y retornarlo
                Soccer soccer = new Soccer(
                    resultSet.getInt("cod"),
                    resultSet.getString("name1"),
                    resultSet.getString("name2"),
                    resultSet.getString("lastName1"),
                    resultSet.getString("lastName2"),
                    resultSet.getInt("age"),
                    resultSet.getInt("speed"),
                    resultSet.getString("positionn"),
                    resultSet.getInt("goals_score"),
                    resultSet.getInt("assists"),
                    resultSet.getInt("pass")
                );
                
                // Guardamos las columna por fila iterada
                data.add(soccer);
            }
            
            // Cerramos
            pstmt.close();
            resultSet.close();
            // Falta retornar el array de los datos en Response +++++++++++++++++++++++++
            
            res = new Response(true, "Carga de futbolistas exitosa", data);
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Esto para mostrar informacion al usuario
        res = new Response(true, "Hubo un error en la ejecucion del metodo");
        return res; // Retornamos el mensaje
    }
    
    
    public Response delete(int id){
        // Logica de select a la base de datos
        Response res = null;
        int success = 0;
        query = "DELETE FROM SOCCER WHERE cod = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            
            success = pstmt.executeUpdate();
            if(success <= 0){
                pstmt.close();
            
                res = new Response(true, "No se pudo eliminar el futbolista");
                return res;
            }
            
            res = new Response(true, "Se ha eliminado el futbolista exitosamente");
            return res;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Esto para mostrar informacion al usuario
        res = new Response(true, "Hubo un error en la ejecucion del metodo");
        return res; // Retornamos el mensaje
    }
}
