package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    
    public Connection getConnection() {
        try {
            // 1. Añadimos &prepareThreshold=0 al final (Obligatorio para Java + Supabase Pooler)
            String myBD = "jdbc:postgresql://aws-0-us-east-2.pooler.supabase.com:6543/postgres?sslmode=require&prepareThreshold=0";
            
            // 2. Tu usuario del pooler y contraseña
            con = DriverManager.getConnection(myBD, "postgres.fugslbwvkpvjhtxirnmn", "Milimetro23$");
            
            return con;
        } catch (SQLException e) {
            // 3. Imprimimos el error profundo para ver qué está fallando realmente en la red
            System.out.println("Error de conexión principal: " + e.getMessage());
            e.printStackTrace(); 
        }
        return null;
    }
}