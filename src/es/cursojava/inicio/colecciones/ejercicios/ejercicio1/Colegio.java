package es.cursojava.inicio.colecciones.ejercicios.ejercicio1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Colegio {
    private String nombre;
    private String direccion;
    
    public Colegio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Colegio [Nombre: " + nombre + ", Direccion: " + direccion + "]";
    }

}
