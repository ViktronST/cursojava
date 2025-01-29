package es.cursojava.POO.cinefilos;

public class Sala {
    private int numero;
    private String tituloPelicula;
    private boolean[][] butacas;

    //Constructor con parámetros
    public Sala(int numero, String tituloPelicula, int filas, int columnas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        butacas = new boolean[filas][columnas];
        //Inicializamos todas las butacas como libres
        for (int i = 1; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {
                butacas[i][j] = true;
            }
        }
    }

    public void mostrarAsientosLibres() {
        System.out.println("Asientos libres para " + tituloPelicula + ":");
        for (int i = 1; i < butacas.length; i++) {
            for (int j = 1; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j] ? "O" : "X");  //Si está ocupado, muestra "X"
            }
            System.out.println();
        }
    }

    public boolean reservarAsiento(int fila, int columna) {
        if (fila >= 1 && fila < butacas.length && columna >= 1 && columna < butacas[fila].length) {
            if (butacas[fila][columna]) {
                butacas[fila][columna] = false;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public boolean[][] getButacas() {
        return butacas;
    }

    public void setButacas(boolean[][] butacas) {
        this.butacas = butacas;
    }
    

}
