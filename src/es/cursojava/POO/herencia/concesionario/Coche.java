package es.cursojava.POO.herencia.concesionario;

public class Coche extends Vehiculo{
    private int numPuertas;
    private boolean tieneAireAcondicionado;
    
    //Constructor
    public Coche(String categoria, String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numPuertas,
            boolean tieneAireAcondicionado) {
        super(categoria, marca, modelo, anio, velocidadMaxima, tipo);
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

    public void llamarCoche() {
        System.out.println();
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

    //toString
    @Override
    public String toString() {
        String padre = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("\nCoche { ");
        sb.append(padre);
        sb.append(", Número de Puertas: ").append(numPuertas);
        sb.append(", Tiene Aire Acondicionado: ").append(tieneAireAcondicionado);
        sb.append(" }");
        return sb.toString();
    }
    
}
