package es.cursojava.POO.herencia.concesionario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Garaje {
    private String nombre;
    private int maximoCoches;
    private int maximoMotos;
    private int maximoCamiones;
    private Vehiculo[] plazas;  //Array de vehículos.

    //Constructor
    public Garaje(String nombre, int maximoCoches, int maximoMotos, int maximoCamiones){
        this.nombre = nombre;
        this.maximoCoches = maximoCoches;
        this.maximoMotos = maximoMotos;
        this.maximoCamiones = maximoCamiones;
        plazas = new Vehiculo[maximoCoches + maximoMotos + maximoCamiones]; //Tamaño total del garaje.
    }

    //Método
    public void aparcarVehiculo(Vehiculo vehiculo){
        
    }

    //toString
    @Override
    public String toString() {
        return "Garaje [Nombre: " + nombre + ", Plazas para Coches: " + maximoCoches + ", Plazas para Motos: " + maximoMotos
                + ", Plazas para Camiones " + maximoCamiones + "]";
    }
    
}
