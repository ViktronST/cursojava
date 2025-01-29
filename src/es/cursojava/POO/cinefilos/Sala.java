package es.cursojava.POO.cinefilos;

public class Sala {
    private int numero;
    private String tituloPelicula;
    private String[][] butacas;

    // Constructor con parámetros.
    public Sala(int numero, String tituloPelicula, int filas, int columnas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        butacas = new String[filas][columnas];

        //Inicializamos todas las butacas como "L" (Libre).
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                butacas[i][j] = "L";
            }
        }
    }

    public void mostrarAsientosLibres() {
        System.out.println("Asientos libres para " + tituloPelicula + ":");
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j].equals("L") ? "O " : "X ");  // "O" para libre, "X" para ocupado.
            }
            System.out.println();
        }
    }

    public String reservarAsiento(int fila, int columna) {
        if (fila >= 0 && fila < butacas.length && columna >= 0 && columna < butacas[fila].length) {
            if (butacas[fila][columna].equals("L")) {  //Verifica si el asiento está libre.
                butacas[fila][columna] = "X";  //Marca el asiento como reservado.
                return "Asiento reservado.";
            } else {
                return "El asiento ya está ocupado.";
            }
        } else {
            return "Asiento fuera de rango.";
        }
    }


    //Getters y Setters.
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

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }
    
}
