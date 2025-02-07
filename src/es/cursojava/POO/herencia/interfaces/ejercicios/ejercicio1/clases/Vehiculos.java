package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.clases;

public class Vehiculos {
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;
    private String tipo;    //Gasolina, Diesel, Hibrido o Electrico.

    //Constructor
    public Vehiculos(String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    //Métodos
    public void mostrarInformacion() {
        System.out.println(toString());
        // System.out.println("\n- Mostrando información del vehículo -");
        // System.out.println("Categoría: " + categoria);
        // System.out.println("Marca: " + marca);
        // System.out.println("Modelo: " + modelo);
        // System.out.println("Año: " + anio);
        // System.out.println("Velocidad Máxima: " + velocidadMaxima + " KM.");
        // System.out.println("Tipo: " + tipo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Marca: ").append(marca);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Año: ").append(anio);
        sb.append(", Velocidad Máxima: ").append(velocidadMaxima).append(" Km.");
        sb.append(", Tipo: ").append(tipo);
        return sb.toString();
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
