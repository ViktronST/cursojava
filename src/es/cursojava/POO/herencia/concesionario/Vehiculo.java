package es.cursojava.POO.herencia.concesionario;

import java.time.LocalDate;

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
        sb.append("MARCA: ").append(marca);
        sb.append(" | MODELO: ").append(modelo);
        sb.append(" | AÑO: ").append(anio);
        sb.append(" | VELOCIDAD MÁXIMA: ").append(velocidadMaxima).append(" Km.");
        sb.append(" | TIPO: ").append(tipo);
        return sb.toString();
    }

    public int calcularImpuesto() {
        int anioActual = LocalDate.now().getYear();     //Se obtiene la fecha y el año actual.
        int antiguedad = anioActual - anio;
        int impuestoBase = 200;
        int impuestoTotal;

        //Cálculo del impuesto según la antigüedad.
        if (antiguedad > 10) {
            impuestoTotal = impuestoBase + ((5 / 100) * impuestoBase); //5% más
        } else {
            impuestoTotal = impuestoBase + ((10 / 100) * impuestoBase); //10% más
        }

        //Cálculo del impuesto según el tipo de combustible.
        if (tipo.equals("Gasolina") || tipo.equals("Diesel")) {
            impuestoTotal += (10 / 100) * impuestoBase; //10% más
        } else if (tipo.equals("Eléctrico")) {
            impuestoTotal -= (10 / 100) * impuestoBase; //10% menos
        } else if (tipo.equals("Híbrido")) {
            impuestoTotal -= (5 / 100) * impuestoBase; //5% menos
        }

        //Cálculo del impuesto según la categoría de vehículo.
        if (this instanceof Camion) {
            impuestoTotal += ((10 / 100) * impuestoTotal); //+10% más
        } else if (this instanceof Coche) {
            impuestoTotal += ((5 / 100) * impuestoTotal); //+5% más
        } else if (this instanceof Motocicleta) {
            impuestoTotal -= ((5 / 100) * impuestoTotal); //-5% menos
        }

        return impuestoTotal;
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
