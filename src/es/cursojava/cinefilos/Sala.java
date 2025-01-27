package es.cursojava.cinefilos;

public class Sala {
    private int numero;
    private String tituloPelicula;
    private int butacas[][];

    //Constructor con parámetros
    public Sala(int numero, String tituloPelicula, int butacas[][]){
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        this.butacas = butacas;
    }

    //Getters y Setters
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTituloPelicula(){
        return tituloPelicula;
    }

    public void setTitutloPelicula(String tituloPelicula){
        this.tituloPelicula = tituloPelicula;
    }

    public int[][] getButacas() {
        return butacas;
    }

    public void setButacas(int[][] butacas) {
        this.butacas = butacas;
    }

}
