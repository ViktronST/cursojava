package es.cursojava.POO.herencia.orquesta;

public class Tambor extends Instrumento{
    private String material;

    //Constructor
    public Tambor(String nombre, String tipo, boolean afinado, String material) {
        super(nombre, tipo, afinado);
        this.material = material;
    }

    @Override
    public void Afinar() {
        System.out.println(" Tambor Afinado."); //SIEMPRE AFINADO
        System.out.println("====================");
    }

    public void Aporrear() {
        System.out.println(" Aporreando Tambor.");
    }

    //Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
}
