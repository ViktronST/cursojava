package es.cursojava.POO.cinefilos;

import java.util.Scanner;

// public class PruebaCine {
//     public static void main(String[] args) {
//         Cine cine = new Cine("Trinity", 1);
        
//         Sala sala1 = new Sala(1, "El rey león", "");
//         Sala sala2 = new Sala(2, "Tennet", "30");
//         Sala sala3 = new Sala(3, "Los Odiosos 8", "30");
        
//         Espectador espectador1 = new Espectador("Juan", "20405060L");
//         Espectador espectador2 = new Espectador("María", "10509070H");
//         Espectador espectador3 = new Espectador("Ivan", "85274163Z");

public class PruebaCine {
    public static void main(String[] args) {
        // Crear un cine con 3 salas
        Cine cine = new Cine("Trinity", 3);

        // Crear 3 espectadores
        Espectador[] espectadores = new Espectador[3];
        espectadores[0] = new Espectador("Ricky Martin", "12345678A");
        espectadores[1] = new Espectador("Sergia Gayman", "87654321B");
        espectadores[2] = new Espectador("Ivan Ionevski", "56789012C");

        Scanner scanner = new Scanner(System.in);

        // Bucle para cada espectador
        for (Espectador espectador : espectadores) {
            System.out.println("Espectador: " + espectador.getNombre());

            // Pedir información al espectador
            System.out.print("¿Qué película quiere ver? ");
            String pelicula = scanner.nextLine();
            System.out.print("¿Cuántas entradas quiere? ");
            int numEntradas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Buscar la sala con la película seleccionada
            Sala sala = cine.buscarSalaPorPelicula(pelicula);
            if (sala == null) {
                System.out.println("La película no está en cartelera.");
                continue;
            }

            // Mostrar los asientos libres
            sala.mostrarAsientosLibres();

            // Permitir al espectador elegir asientos
            boolean asientosElegidos = false;
            while (!asientosElegidos) {
                System.out.print("Ingrese la fila (o 0 para salir): ");
                int fila = scanner.nextInt();
                if (fila == 0) {
                    break;
                }
                System.out.print("Ingrese el asiento (o 0 para salir): ");
                int asiento = scanner.nextInt();
                if (asiento == 0) {
                    break;
                }

                asientosElegidos = sala.reservarAsiento(fila, asiento);
                if (!asientosElegidos) {
                    System.out.println("El asiento ya está ocupado.");
                }
            }
        }

        // Mostrar resumen por cada sala
        cine.mostrarResumenVentas();
    }
}
    }
}
