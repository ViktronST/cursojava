package es.cursojava.POO.herencia.concesionario;

public class PruebaVehiculo {
    public static void main(String[] args) {
        PruebaVehiculo probar = new PruebaVehiculo();
        probar.infoVehiculo();
    }

    private void infoVehiculo() {
        Vehiculo coche1 = new Coche("Mercedes", "Berlina", 2022, 215, "Eléctrico", 5, true);
        Vehiculo coche2 = new Coche("BMW", "M3 E30", 1990, 235, "Gasolina", 3, false);
        Vehiculo motocicleta1 = new Motocicleta("Kawasaki", "Z900", 2024, 260, "Gasolina", false, 948);
        Vehiculo motocicleta2 = new Motocicleta("BMW", "R60", 1970, 110, "Gasolina", true, 594);
        Vehiculo camion1 = new Camion("Volvo", "FH", 2023, 300, "Eléctrico", 65, 5);
        Vehiculo camion2 = new Camion("Iveco", "X-Way", 2010, 200, "Diesel", 30, 3);

        Vehiculo[] vehiculos = {coche1, coche2, motocicleta1, motocicleta2, camion1, camion2};
        mostrarInfoVehiculo(vehiculos);
    }

    private void mostrarInfoVehiculo(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
        }
    }
}
