package es.cursojava.POO.herencia.concesionario;

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

    //Método
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Ejes: " + numeroEjes);
        System.out.println("Capacidad de Carga: " + capacidadCarga + " Toneladas.");
    }

    //Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    
}
