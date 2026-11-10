package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // Método para guardar un nuevo usuario
    public boolean registrar(Usuario u) {
        String sql = "INSERT INTO usuarios (usuario, correo, password) VALUES (?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getCorreo());
            ps.setString(3, u.getContraseña());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al registrar: " + e.toString());
            return false;
        }
    }

    // Método para validar el Login
    public boolean validarLogin(String identificador, String pass) {
        String sql = "SELECT * FROM usuarios WHERE (usuario = ? OR correo = ?) AND password = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, identificador);
            ps.setString(2, identificador);
            ps.setString(3, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true; // Si encontró los datos, devuelve verdadero
            }
        } catch (Exception e) {
            System.out.println("Error en login: " + e.toString());
        }
        return false; // Si falla, devuelve falso
    }
}