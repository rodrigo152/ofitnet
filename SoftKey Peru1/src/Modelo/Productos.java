
package Modelo;


public class Productos {
    // Atributos
   protected String codigo;
   protected String soportetecnico;
   
   protected String actualizaciones;
// Costructor

    public Productos(String codigo, String soportetecnico, String actualizaciones) {
        this.codigo = codigo;
        this.soportetecnico = soportetecnico;
        this.actualizaciones = actualizaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSoportetecnico() {
        return soportetecnico;
    }

    public void setSoportetecnico(String soportetecnico) {
        this.soportetecnico = soportetecnico;
    }

    public String getActualizaciones() {
        return actualizaciones;
    }

    public void setActualizaciones(String actualizaciones) {
        this.actualizaciones = actualizaciones;
    }

   
   // Metodos
    public String Info(){
    return "Codigo Producto:"+codigo+"\n"+
            "      Soporte Tecnico:"+soportetecnico+"\n"+
            "      Atualizaciones:"+actualizaciones+"\n";
    
    }
   
    
}
