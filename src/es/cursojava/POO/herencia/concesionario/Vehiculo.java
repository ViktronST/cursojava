package es.cursojava.POO.herencia.concesionario;

import java.time.LocalDate;

public class Vehiculo {
    private String categoria;   //Coche, Motocicleta o Camión
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;
    private String tipo;    //Gasolina, Diesel, Hibrido o Electrico.
    
    //Constructor
    public Vehiculo(String categoria, String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    //Métodos
    public void mostrarInformacion() {
        System.out.println("\n- Mostrando información del vehículo -");
        System.out.println("Categoría: " + categoria);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " KM.");
        System.out.println("Tipo: " + tipo);
    }

    public int calcularImpuesto() {
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - anio;
        int impuestoBase = 200;
        int impuestoTotal;

        //Cálculo del impuesto base según la antigüedad
        if (antiguedad > 10) {
            impuestoTotal = impuestoBase + (int) (0.05 * impuestoBase); //5% más
        } else {
            impuestoTotal = impuestoBase + (int) (0.10 * impuestoBase); //10% más
        }

        //Cálculo del impuesto base según el tipo de combustible
        if (tipo.equals("Gasolina") || tipo.equals("Diesel")) {
            impuestoTotal += 0.10 * impuestoBase; //10% más
        } else if (tipo.equals("Eléctrico")) {
            impuestoTotal -= 0.10 * impuestoBase; //10% menos
        } else if (tipo.equals("Híbrido")) {
            impuestoTotal -= 0.05 * impuestoBase; //5% menos
        }

        //Cálculo del impuesto base según la categoría de vehículo
        if (categoria.equalsIgnoreCase("Camión")) {
            impuestoTotal += (int) (0.10 * impuestoTotal); //+10% más
        } else if (categoria.equalsIgnoreCase("Coche")) {
            impuestoTotal += (int) (0.05 * impuestoTotal); //+5% más
        } else if (categoria.equalsIgnoreCase("Motocicleta")) {
            impuestoTotal -= (int) (0.05 * impuestoTotal); //-5% menos
        }

        return impuestoTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Categoría: ").append(categoria);
        sb.append(", Marca: ").append(marca);
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
