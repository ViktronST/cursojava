package es.cursojava.POO.herencia.orquesta;

public class GuitarraElectrica extends Guitarra{
    private double potencia;

    //Constructor
    public GuitarraElectrica(String nombre, String tipo, boolean afinado, int numCuerdas, double potencia) {
        super(nombre, tipo, afinado, numCuerdas);
        this.potencia = potencia;
    }

    //Método
    public void tocando(){
        System.out.println("Tocando muy alto.");
        System.out.println("====================");
    }

    //Getters y Setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    
}
