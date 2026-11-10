
package Modelo;


public class Usuario {
    private String usuario;
    private String correo;
    private String contraseña;
    
    public Usuario(String usuario, String correo, String contraseña) {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
    
}
