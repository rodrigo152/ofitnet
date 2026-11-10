

package Modelo;

import Modelo.Licencia;


public class NodoHash {
    String key;         
    Licencia value;     
    NodoHash siguiente; 

   
    public NodoHash(String key, Licencia value) {
        this.key = key;
        this.value = value;
        this.siguiente = null; 
    }

    
    public String getKey() {
        return key;
    }

    public Licencia getValue() {
        return value;
    }
}
