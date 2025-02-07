package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.clases;

public class MainEjercicio1 {
    public static void main(String[] args) {
        MainEjercicio1 prueba = new MainEjercicio1();
        prueba.información();
    }

    private void información() {
        Productos[] productos = creaProductos();
        Vehiculos[] vehiculos = crearVehiculos();
        mostrarInfo(productos, vehiculos);
    }

    private Productos[] creaProductos() {
        Yogur yogur = new Yogur("Yogur Griego", 1.15, "19/02/25","Stracciatella");
        Cafetera cafetera = new Cafetera("Nescafé v2", 50.95, "02/11/23","Capsulas");

        Productos[] productos = {yogur, cafetera};
        return productos;
    }

    private Vehiculos[] crearVehiculos() {
        BiciMontana bici = new BiciMontana("SCOTT", "970 Blue", 2005, 50, "Montaña", 3,6);
        Coche coche = new Coche("Mercedes", "Berlina", 2022, 215, "Eléctrico", "V4",5);

        Vehiculos[] vehiculos = {bici, coche};
        return vehiculos;
    }

    private void mostrarInfo(Productos[] productos, Vehiculos[] vehiculos) {
        for (Vehiculos v : vehiculos) {
            v.mostrarInformacion();
            System.out.println("------------------------------------------------------------------------------------------------------");
        }

        for (Productos a : productos) {
            a.mostrarInformacion();
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
    }

    //Método para mostrar los Productos y Vehículos Encendibles y Apagables.
    //Todo en uno.
    private void estado(Productos[] productos, Vehiculos[] vehiculos) {
        
    }
}
