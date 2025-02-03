package es.cursojava.POO.herencia.concesionario;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;
    private String tipo;    //Gasolina, Diesel, Hibrido o Electrico.
    
    //Constructor
    public Vehiculo(String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    //Métodos
    public void llamarHijas() {

    }
    
    public void mostrarInformacion() {
        System.out.println("\n- Mostrando información del vehículo -");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " KM.");
        System.out.println("Tipo: " + tipo);
    }

    // public int calcularImpuesto() {
    //     anio = 2025;
    //     int sumar = 0;
    //     int impuesto5 = (5/100) * 200;
    //     int impuesto10 = (10/100) * 200;
    //     int impuestoTotal;
        
    //     if(anio < anio-10) {
    //         sumar = impuesto5 + 200;
    //     }else {
    //         sumar = impuesto10 + 200;
    //     }

    //     if(tipo == "Gasolina" || tipo == "Diesel") {
    //         sumar = impuesto10 + 200;
    //     }else if(tipo == "Hibrido") {
    //         sumar = impuesto10 - 200;
    //     }else{
    //         sumar = impuesto5 - 200;
    //     }

    //     if()
    // }

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
