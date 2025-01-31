package es.cursojava.POO.herencia.orquesta;

public class Piano extends Instrumento{
    private int numeroOctavas;
    private String tipoPiano;
    
    //Constructor
    public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipoPiano) {
        super(nombre, tipo, afinado);
        this.numeroOctavas = numeroOctavas;
        this.tipoPiano = tipoPiano;
    }

    @Override
    public void Afinar() {
        super.Afinar();
        System.out.println(" Afinando Piano.");
        System.out.println("====================");
    }

    //Getters y Setters
    public int getNumeroOctavas() {
        return numeroOctavas;
    }

    public void setNumeroOctavas(int numeroOctavas) {
        this.numeroOctavas = numeroOctavas;
    }

    public String getTipoPiano() {
        return tipoPiano;
    }

    public void setTipoPiano(String tipoPiano) {
        this.tipoPiano = tipoPiano;
    }

    
}
