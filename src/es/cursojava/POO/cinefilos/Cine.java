package es.cursojava.POO.cinefilos;

import java.util.Scanner;

public class Cine {
    private String nombre;
    private Sala[] salas;

    //Constructor por parámetros.
    public Cine(String nombre, int numSalas) {
        this.nombre = nombre;
        salas = new Sala[numSalas];
        salas[0] = new Sala(1, "Avatar", 5, 5);
        salas[1] = new Sala(2, "Tennet", 5, 5);
        salas[2] = new Sala(3, "Los Odiosos 8", 5, 5);
    }

    public Sala buscarSalaPorPelicula(String pelicula) {
        for (Sala sala : salas) {
            if (sala.getTituloPelicula().equalsIgnoreCase(pelicula)) {
                return sala;
            }
        }
        return null;
    }

    public void reservarAsiento(Sala sala, int numEntradas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numEntradas; i++) {
            System.out.print("Ingresa la fila: ");
            int fila = scanner.nextInt();
            if (fila == 0) {
                break;
            }
            System.out.print("Ingresa el asiento: ");
            int columna = scanner.nextInt();
            if (columna == 0) {
                break;
            }

            if (sala.reservarAsiento(fila, columna)) {
                System.out.println("Asiento reservado.");
            } else {
                System.out.println("El asiento ya está ocupado.");
                i--; //Para volver a reservar otro asiento.
            }
        }
        
        //Mostrar asientos reservados.
        sala.mostrarAsientosLibres();
    }

    public void mostrarResumenVentas() {
        double precioEntrada = 7.50;

        System.out.println("Resumen de ventas:");

        for (Sala sala : salas) {
            int entradasVendidas = 0;
            for (String[] fila : sala.getButacas()) {
                for (String asiento : fila) {
                    if (!asiento) { //Por si el asiento está ocupado.
                        entradasVendidas++;
                    }
                }
            }

            double ingresoTotal = entradasVendidas * precioEntrada;

            System.out.println("Sala " + sala.getNumero() + ": " + sala.getTituloPelicula());
            System.out.println("  Entradas vendidas: " + entradasVendidas);
            System.out.println("  Ingreso total: " + ingresoTotal + " euros.");
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
