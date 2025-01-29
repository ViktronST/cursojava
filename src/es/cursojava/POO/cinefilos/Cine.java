package es.cursojava.POO.cinefilos;

import java.util.HashMap;

public class Cine {
    private String nombre;
    private Sala[] salas;

    //Constructor por parámetros
    public Cine(String nombre, int numSalas) {
        this.nombre = nombre;
        salas = new Sala[numSalas];
        // Inicializar las salas con datos ficticios (puedes personalizar esto)
        salas[0] = new Sala(1, "Avatar", 10, 15);
        salas[1] = new Sala(2, "Tennet", 8, 12);
        salas[2] = new Sala(3, "Los Odiosos 8", 12, 18);
    }

    public Sala buscarSalaPorPelicula(String pelicula) {
        for (Sala sala : salas) {
            if (sala.tituloPelicula.equalsIgnoreCase(pelicula)) {
                return sala;
            }
        }
        return null;
    }

    public void mostrarResumenVentas() {
        // Supongamos un precio de entrada fijo por simplicidad
        double precioEntrada = 10.0;

        System.out.println("Resumen de ventas:");

        for (Sala sala : salas) {
            int entradasVendidas = 0;
            for (boolean[] fila : sala.butacas) {
                for (boolean asiento : fila) {
                    if (!asiento) { // Si el asiento está ocupado
                        entradasVendidas++;
                    }
                }
            }

            double ingresoTotal = entradasVendidas * precioEntrada;

            System.out.println("Sala " + sala.numero + ": " + sala.tituloPelicula);
            System.out.println("  Entradas vendidas: " + entradasVendidas);
            System.out.println("  Ingreso total: $" + ingresoTotal);
        }

    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}
