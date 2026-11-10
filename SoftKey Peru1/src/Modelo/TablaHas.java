package Modelo;
import java.util.ArrayList; 

public class TablaHas {
    
    // Tus variables de instancia 
    private NodoHash[] tabla; 
    private int tamanio;      
    private int cantidad;     

    // Tus variables de lógica de negocio 
    public static double porcentaje1 = 0.01; 
    public static double porcentaje2 = 0.02; 
    public static double porcentaje3 = 0.04; 
    public static double porcentaje4 = 0.05;
    
    public static String obsequio1 = "Sticker Exclusivo";    
    public static String obsequio2 = "Mousepad Gamer";        
    public static String obsequio3 = "Teclado Mecánico"; 
    
    public static int contadorDeVentas = 0;
    public static double importeTotalAcumulado = 0.0;
    public static final double CUOTA_DIARIA = 7500.0;

    // constructor 
    public TablaHas(int tamanio) {
        this.tamanio = tamanio;
        this.tabla = new NodoHash[tamanio]; 
        this.cantidad = 0;
        
        // 1. Limpiamos la tabla
        for (int i = 0; i < tamanio; i++) {
            this.tabla[i] = null;
        }


        insertar("OFF365-001", new Licencia("Microsoft Office 365", 249.99, 1, 1, "OFF365-001", "Incluye", "Actualizaciones automáticas"));
        insertar("WIN11-002", new Licencia("Windows 11 Pro", 299.99, 1, 1, "WIN11-002", "Incluye", "Actualizaciones automáticas"));
        insertar("KASP-003", new Licencia("Kaspersky Premium", 119.90, 1, 3, "KASP-003", "Incluye", "Actualizaciones en tiempo real"));
        insertar("ADOBE-004", new Licencia("Adobe Photoshop CC", 359.88, 1, 1, "ADOBE-004", "Incluye", "Mensuales vía Creative Cloud"));
        insertar("AUTOCAD-005", new Licencia("AutoCAD 2025 Estudiantil", 0.00, 1, 1, "AUTOCAD-005", "No incluye", "Licencia gratuita para estudiantes"));
        insertar("NORTON-006", new Licencia("Norton 360 Deluxe", 134.99, 1, 5, "NORTON-006", "Incluye", "Actualizaciones inteligentes"));
        insertar("VSPRO-007", new Licencia("Visual Studio Professional 2022", 499.00, 1, 1, "VSPRO-007", "Incluye", "Actualizaciones automáticas vía MSDN"));
        insertar("COREL-008", new Licencia("CorelDRAW Graphics Suite 2024", 269.00, 1, 1, "COREL-008", "Incluye", "Actualizaciones regulares"));
        insertar("MSPROJ-009", new Licencia("Microsoft Project Professional", 325.00, 1, 1, "MSPROJ-009", "Incluye", "Actualizaciones de seguridad")); 
        insertar("VMWARE-010", new Licencia("VMware Workstation Pro 17", 199.99, 1, 1, "VMWARE-010", "Incluye", "Parcheo y mejoras técnicas"));
    }
    private int funcionHash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31 * hash + key.charAt(i)) % this.tamanio;
        }
        return Math.abs(hash); 
    }
    public void insertar(String key, Licencia value) {
        
        int indice = funcionHash(key); 
        NodoHash nuevoNodo = new NodoHash(key, value);
        if (tabla[indice] == null) {
            tabla[indice] = nuevoNodo;
        } else {
            NodoHash temporal = tabla[indice];
            nuevoNodo.siguiente = temporal;
            tabla[indice] = nuevoNodo;
        }
        cantidad++;
    }
    public Licencia buscar(String key) {
        
        int indice = funcionHash(key);
        NodoHash temporal = tabla[indice]; 
        while (temporal != null) {
            if (temporal.key.equals(key)) {
                return temporal.value; 
            }
            temporal = temporal.siguiente; 
        }
        return null; 
    }

    public void eliminar(String key) {
        
        int indice = funcionHash(key);
        NodoHash temporal = tabla[indice];
        NodoHash previo = null;
        while (temporal != null) {
            if (temporal.key.equals(key)) {
                if (previo == null) {
                    tabla[indice] = temporal.siguiente;
                } else {
                    previo.siguiente = temporal.siguiente;
                }
                cantidad--;
                return; 
            }
            previo = temporal;
            temporal = temporal.siguiente;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    

    /**
     * Actualiza una licencia existente en la tabla.
     */
    public void actualizar(String key, Licencia licenciaActualizada) {
        int indice = funcionHash(key);
        NodoHash temporal = tabla[indice];
        while (temporal != null) {
            if (temporal.key.equals(key)) {
                // ¡Encontrado! Reemplaza el valor
                temporal.value = licenciaActualizada;
                return;
            }
            temporal = temporal.siguiente;
        }
    }

    /**
     * Borra todas las licencias de la tabla.
     */
    public void eliminarTodo() {
        this.tabla = new NodoHash[this.tamanio];
        this.cantidad = 0;
    }
    /**
     * Devuelve todas las licencias en un ArrayList (para la JTable).
     */
    public ArrayList<Licencia> getTodasLasLicencias() {
        ArrayList<Licencia> listaDeLicencias = new ArrayList<>();
        for (int i = 0; i < tamanio; i++) {
            NodoHash temporal = tabla[i];
            while (temporal != null) {
                listaDeLicencias.add(temporal.value); 
                temporal = temporal.siguiente; 
            }
        }
        return listaDeLicencias;
    }
    public double calcularImporteDescuento(int cantidad, double importeCompra) {
        double porcentajeAplicado = 0;

        if (cantidad >= 1 && cantidad <= 5) {
            porcentajeAplicado = porcentaje1;
        } else if (cantidad >= 6 && cantidad <= 10) {
            porcentajeAplicado = porcentaje2;
        } else if (cantidad >= 11 && cantidad <= 15) {
            porcentajeAplicado = porcentaje3;
        } else if (cantidad > 15) {
            porcentajeAplicado = porcentaje4;
        }
        
        return importeCompra * porcentajeAplicado;
    }
    public String determinarObsequio(int cantidad) {
        if (cantidad == 1) {
            return obsequio1;
        } else if (cantidad >= 2 && cantidad <= 5) {
            return obsequio2;
        } else if (cantidad >= 6) {
            return obsequio3;
        } else {
            return "Ninguno"; 
        }
    }
}