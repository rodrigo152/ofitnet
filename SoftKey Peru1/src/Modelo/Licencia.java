
package Modelo;
public class Licencia extends Productos{
    private String nombre;
   private double precio;
   private int duracion;
   private int nusuarios;
   
// Costructor

    public Licencia(String nombre, double precio, int duracion, int nusuarios, String codigo, String soportetecnico, String actualizaciones) {
        super(codigo, soportetecnico, actualizaciones);
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.nusuarios = nusuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNusuarios() {
        return nusuarios;
    }

    public void setNusuarios(int nusuarios) {
        this.nusuarios = nusuarios;
    }
    
    
    // Metodos
    public double PrecioTotal(){
    return precio*duracion;
    }
}
