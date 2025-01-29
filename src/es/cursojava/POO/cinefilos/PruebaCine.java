package es.cursojava.POO.cinefilos;

import java.util.Scanner;

public class PruebaCine {
    public static void main(String[] args) {
        //Crear un cine con 3 salas.
        Cine cine = new Cine("Trinity", 3);

        //Crear 3 espectadores.
        Espectador[] espectadores = new Espectador[3];
        espectadores[0] = new Espectador("Ricky Martin", "12345678A");
        espectadores[1] = new Espectador("Sergio Goodguy", "87654321B");
        espectadores[2] = new Espectador("Ivan Ionevski", "56789012C");

        Scanner scanner = new Scanner(System.in);

        //Bucle para cada espectador.
        for (Espectador espectador : espectadores) {
            System.out.println("======================================");
            System.out.println("Espectador: " + espectador.getNombre());

            //Pedimos la información al espectador.
            System.out.println("¿Qué película quiere ver? ");
            String pelicula = scanner.nextLine().toLowerCase();
            System.out.println("¿Cuántas entradas quiere? ");
            int numEntradas = scanner.nextInt();
            scanner.nextLine();

            //Buscamos la sala con la película seleccionada.
            Sala sala = cine.buscarSalaPorPelicula(pelicula);
            if (sala == null) {
                System.out.println("La película no está en cartelera.");
                continue;
            }

            //Mostramos los asientos libres.
            // sala.mostrarAsientosLibres();
            
            //Reservamos los asientos.
            cine.reservarAsiento(sala, numEntradas);
        }

        //Mostramos el resumen por cada sala.
        cine.mostrarResumenVentas();
    }
}
