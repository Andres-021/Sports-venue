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
import models.Softball;
import utils.Response;

/**
 *
 * @author andre
 */
public class SoftballController {
    // Instanciamos la conexion
    private ConnectionMySql sql = new ConnectionMySql();
    // Creamos un objeto connection y le asignamos la conexion
    private Connection conn = sql.conectarMySQL();
    private String query = "";
    
    
    public Response insert(Softball softball){
        // Logica de inser a la base de datos
        Response res = null;
        int success = 0;
        // Asignamos la consulta
        query = "INSERT INTO SOFTBALL("
                + "cod, name1, name2, lastName1, lastName2, age, speed, positionn, batting, pitching"
              + ") "
              + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try {
            // Pasamos el query
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            // ASignamos los valores de los signos eje: VALUES(?,?)
            pstmt.setInt(1, softball.getCod());
            pstmt.setString(2, softball.getName1());
            pstmt.setString(3, softball.getName2());
            pstmt.setString(4, softball.getLastName1());
            pstmt.setString(5, softball.getLastName2());
            pstmt.setInt(6, softball.getAge());
            pstmt.setInt(7, softball.getSpeed());
            pstmt.setString(8, softball.getPosition());
            pstmt.setInt(9, softball.getBatting());
            pstmt.setInt(10, softball.getPitching());
            // Ejecutamos el query
            success = pstmt.executeUpdate(); // Este metodo se usa cuando son consultas de INSERT 
            if(success <= 0){
                pstmt.close();
                
                res = new Response(true, "El softbolista no pudo ser creado");
                return res;
            }
            pstmt.close();
        
            // Esto para mostrar informacion al usuario
            res = new Response(true, "El softbolista se ha creado exitosamente");
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
        query = "SELECT * FROM SOFTBALL WHERE cod = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            // Ejecutamos el query y obtenemos los datos
            ResultSet resultSet = pstmt.executeQuery(); // Este metodo se usa cuando son consultas de SELECT
            if(resultSet == null){
                pstmt.close();
                resultSet.close();
                
                res = new Response(true, "No se encontro el softbolista");
                return res;
            }
            
            while(resultSet.next()){
                //"name1, name2, lastName1, lastName2, age, speed, position, goals_score, assists, pass"
                // Creamos el modelo para guardarlo en una lista y retornarlo
                Softball softball = new Softball(
                    resultSet.getInt("cod"),
                    resultSet.getString("name1"),
                    resultSet.getString("name2"),
                    resultSet.getString("lastName1"),
                    resultSet.getString("lastName2"),
                    resultSet.getInt("age"),
                    resultSet.getInt("speed"),
                    resultSet.getString("positionn"),
                    resultSet.getInt("batting"),
                    resultSet.getInt("pitching")
                );
                
                // Guardamos las columna por fila iterada
                data.add(softball);
            }
            
            // Cerramos
            pstmt.close();
            resultSet.close();
            
            res = new Response(true, "Se ha encontrado el softbolista", data);
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
        query = "SELECT * FROM SOFTBALL";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            // Ejecutamos el query y obtenemos los datos
            ResultSet resultSet = pstmt.executeQuery(); // Este metodo se usa cuando son consultas de SELECT
            if(resultSet == null){
                pstmt.close();
                resultSet.close();
                
                res = new Response(true, "No se encontraron softbolistas");
                return res;
            }
            
            while(resultSet.next()){
                //"name1, name2, lastName1, lastName2, age, speed, position, goals_score, assists, pass"
                // Creamos el modelo para guardarlo en una lista y retornarlo
                Softball softball = new Softball(
                    resultSet.getInt("cod"),
                    resultSet.getString("name1"),
                    resultSet.getString("name2"),
                    resultSet.getString("lastName1"),
                    resultSet.getString("lastName2"),
                    resultSet.getInt("age"),
                    resultSet.getInt("speed"),
                    resultSet.getString("positionn"),
                    resultSet.getInt("batting"),
                    resultSet.getInt("pitching")
                );
                
                // Guardamos las columna por fila iterada
                data.add(softball);
            }
            
            // Cerramos
            pstmt.close();
            resultSet.close();
            // Falta retornar el array de los datos en Response +++++++++++++++++++++++++
            
            res = new Response(true, "Carga de softbolistas exitosa", data);
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
        query = "DELETE FROM SOFTBALL WHERE cod = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            
            success = pstmt.executeUpdate();
            if(success <= 0){
                pstmt.close();
            
                res = new Response(true, "No se pudo eliminar el softbolista");
                return res;
            }
            
            res = new Response(true, "Se ha eliminado el softbolista exitosamente");
            return res;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Esto para mostrar informacion al usuario
        res = new Response(true, "Hubo un error en la ejecucion del metodo");
        return res; // Retornamos el mensaje
    }
}
