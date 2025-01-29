package es.cursojava.POO.cinefilos;

import java.util.HashMap;
import java.util.Map;

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

        // Mapa para almacenar las ventas por película
        Map<String, Integer> ventasPorPelicula = new HashMap<>();

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

            // Agregar las ventas de la película al mapa
            ventasPorPelicula.put(sala.tituloPelicula, entradasVendidas);
        }

        // Encontrar la película más vendida
        String peliculaMasVendida = "";
        int maxEntradas = 0;
        for (Map.Entry<String, Integer> entry : ventasPorPelicula.entrySet()) {
            if (entry.getValue() > maxEntradas) {
                maxEntradas = entry.getValue();
                peliculaMasVendida = entry.getKey();
            }
        }

        System.out.println("Película más vendida: " + peliculaMasVendida + " con " + maxEntradas + " entradas vendidas.");

    
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
