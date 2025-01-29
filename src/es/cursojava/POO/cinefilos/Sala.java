package es.cursojava.POO.cinefilos;

public class Sala {
    private int numero;
    private String tituloPelicula;
    private Espectador[][] butacas;

    public Sala(int numero, String tituloPelicula, int filas, int columnas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        butacas = new Espectador[filas][columnas];
    }

    public void mostrarAsientosLibres() {
        System.out.println("Asientos libres para " + tituloPelicula + ":");
        for (Espectador[] fila : butacas) {
            for (Espectador asiento : fila) {
                System.out.print(asiento == null ? "O" : "X");
            }
            System.out.println();
        }
    }

    public boolean reservarAsiento(int fila, int columna, Espectador espectador) {
        if (fila >= 0 && fila < butacas.length && columna >= 0 && columna < butacas[fila].length) {
            if (butacas[fila][columna] == null) {
                butacas[fila][columna] = espectador;
                return true;
            }
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public Espectador[][] getButacas() {
        return butacas;
    }
}
