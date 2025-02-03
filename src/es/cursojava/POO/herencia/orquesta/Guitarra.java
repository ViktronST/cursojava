package es.cursojava.POO.herencia.orquesta;

public class Guitarra extends Instrumento{
    private int numCuerdas;

    //Constructor
    public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
        super(nombre, tipo, afinado);
        this.numCuerdas = numCuerdas;
    }

    //Método
    @Override
    public void afinar() {
        super.afinar();
        System.out.println(" Afinando Guitarra.");
        System.out.println("====================");
    }

    //Getters y Setters
    public int getNumCuerdas() {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }

    
}
