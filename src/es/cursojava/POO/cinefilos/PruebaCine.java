package es.cursojava.POO.cinefilos;

import java.util.Scanner;

public class PruebaCine {
    public static void main(String[] args) {
        Cine cine = new Cine("Trinity", 3);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenidos al cine " + cine.getNombre() + "!");
    cine.mostrarCartelera();

    Espectador[] espectadores = {
        new Espectador("Ricky Martin", "12345678A"),
        new Espectador("Sergia Gayman", "87654321B"),
        new Espectador("Ivan Ionevski", "56789012C")
    };

    for (Espectador espectador : espectadores) {
        System.out.println("======================================");
        System.out.println("Espectador: " + espectador.getNombre());
        System.out.print("¿Qué película quiere ver? ");
        String pelicula = scanner.nextLine().toLowerCase();
        System.out.print("¿Cuántas entradas quiere? ");
        int numEntradas = scanner.nextInt();
        scanner.nextLine();

        Sala sala = cine.buscarSalaPorPelicula(pelicula);
        if (sala == null) {
            System.out.println("La película no está en cartelera.");
            continue;
        }

        sala.mostrarAsientosLibres();
        cine.reservarAsientos(sala, numEntradas, espectador);
    }

    cine.mostrarResumenVentas();
    }
    
}

