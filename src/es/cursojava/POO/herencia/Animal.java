package es.cursojava.POO.herencia;

public class Animal {
    private String nombre;
    private double peso;
    
    //Constructor con parámetros
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comer(){
        System.out.println("El animal " + this.nombre + " está comiendo.");
    }

    public void beber(){
        System.out.println("El animal " + this.nombre + " está bebeindo.");

    }
}
