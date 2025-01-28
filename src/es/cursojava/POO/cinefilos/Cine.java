package es.cursojava.POO.cinefilos;

public class Cine {
    private String nombre;
    private int sala[];

    //Constructor con parámetros
    public Cine(String nombre, int sala[]){
        this.nombre = nombre;
        this.sala = sala;
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int[] getSala(){
        return sala;
    }

    public void setSala(int sala[]){
        this.sala = sala;
    }
}
