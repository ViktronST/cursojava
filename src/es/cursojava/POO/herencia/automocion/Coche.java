package es.cursojava.POO.herencia.automocion;

public class Coche extends Vehiculo{
    private int numPuertas;
    private boolean tieneAireAcondicionado;
    
    //Constructor
    public Coche(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numPuertas,
            boolean tieneAireAcondicionado) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.numPuertas = numPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    //Método
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Puertas: " + numPuertas);
        System.out.println("Aire Acondicionado: " + tieneAireAcondicionado);
    }

    //Getters y Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    
}
