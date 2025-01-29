package es.cursojava.POO.cinefilos;

import java.util.Scanner;

public class Cine {
    private String nombre;
    private Sala[] salas;

    public Cine(String nombre, int numSalas) {
        this.nombre = nombre;
        salas = new Sala[numSalas];
        salas[0] = new Sala(1, "Avatar", 5, 5);
        salas[1] = new Sala(2, "Tennet", 5, 5);
        salas[2] = new Sala(3, "Los Odiosos 8", 5, 5);
    }

    public void mostrarCartelera() {
        System.out.println("Cartelera del cine " + nombre + ":");
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.getNumero() + ": " + sala.getTituloPelicula());
        }
    }

    public Sala buscarSalaPorPelicula(String pelicula) {
        for (Sala sala : salas) {
            if (sala.getTituloPelicula().equalsIgnoreCase(pelicula)) {
                return sala;
            }
        }
        return null;
    }

    public void reservarAsientos(Sala sala, int numEntradas, Espectador espectador) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numEntradas; i++) {
            int fila, asiento;
            do {
                System.out.print("Ingrese la fila (o 0 para salir): ");
                fila = scanner.nextInt();
                if (fila == 0) return;
                System.out.print("Ingrese el asiento (o 0 para salir): ");
                asiento = scanner.nextInt();
                if (asiento == 0) return;
            } while (!sala.reservarAsiento(fila - 1, asiento - 1, espectador));
            
            System.out.println("Asiento reservado.");
        }
        
        sala.mostrarAsientosLibres();
    }

    public void mostrarResumenVentas() {
        double precioEntrada = 7.50;
        System.out.println("Resumen de ventas:");

        for (Sala sala : salas) {
            int entradasVendidas = 0;
            for (Espectador[] fila : sala.getButacas()) {
                for (Espectador asiento : fila) {
                    if (asiento != null) entradasVendidas++;
                }
            }
            double ingresoTotal = entradasVendidas * precioEntrada;
            System.out.println("Sala " + sala.getNumero() + ": " + sala.getTituloPelicula());
            System.out.println("  Entradas vendidas: " + entradasVendidas);
            System.out.println("  Ingreso total: €" + ingresoTotal);
        }
    }

    //Getters y Setters.
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
