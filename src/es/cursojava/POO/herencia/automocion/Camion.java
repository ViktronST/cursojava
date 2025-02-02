package es.cursojava.POO.herencia.automocion;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;
    
    //Constructor
    public Camion(String marca, String modelo, int anio, double velocidadMaxima, String tipo, double capacidadCarga,
            int numeroEjes) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    
}
