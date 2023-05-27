/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class ConnectionMySql {
    
    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    private String url = "jdbc:mysql://localhost:3306/sports_venue";
    private String username = "root";
    private String password = "";

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Realizamos un casting, es como convertir forzadamente a lo que necesitamos
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
