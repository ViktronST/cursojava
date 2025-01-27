package es.cursojava.cinefilos;

public class Sala {
    private int numero;
    private String tituloPelicula;
    private String butacas[][];

    //Constructor con parámetros
    public Sala(int numero, String tituloPelicula, String butacas[][]){
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

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }

}
