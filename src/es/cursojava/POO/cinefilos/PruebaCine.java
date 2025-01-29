package es.cursojava.POO.cinefilos;

import java.util.Scanner;

public class PruebaCine {
    public static void main(String[] args) {
        //Crear un cine con 3 salas
        Cine cine = new Cine("Trinity", 3);

        //Crear 3 espectadores
        Espectador[] espectadores = new Espectador[3];
        espectadores[0] = new Espectador("Ricky Martin", "12345678A");
        espectadores[1] = new Espectador("Sergia Gayman", "87654321B");
        espectadores[2] = new Espectador("Ivan Ionevski", "56789012C");

        Scanner scanner = new Scanner(System.in);

        //Bucle para cada espectador
        for (Espectador espectador : espectadores) {
            System.out.println("======================================");
            System.out.println("Espectador: " + espectador.getNombre());

            //Pedir información al espectador
            System.out.println("¿Qué película quiere ver? ");
            String pelicula = scanner.nextLine().toLowerCase();
            System.out.println("¿Cuántas entradas quiere? ");
            int numEntradas = scanner.nextInt();
            scanner.nextLine();

            //Buscar la sala con la película seleccionada
            Sala sala = cine.buscarSalaPorPelicula(pelicula);
            if (sala == null) {
                System.out.println("La película no está en cartelera.");
                continue;
            }

            //Mostrar los asientos libres
            sala.mostrarAsientosLibres();
            
            // Reservar asientos
            cine.reservarAsientos(sala, numEntradas);

            //Permitir al espectador elegir asientos
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

        //Mostrar resumen por cada sala
        cine.mostrarResumenVentas();
    }
}
