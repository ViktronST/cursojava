package es.cursojava.POO.herencia.orquesta;

public class Instrumento {
    private String nombre;
    private String tipo;
    private boolean afinado;
    
    //Constructor
    public Instrumento(String nombre, String tipo, boolean afinado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.afinado = afinado;
    }

    //Métodos
    public void afinar(){
        System.out.println("Afinando instrumento " + getNombre());
        if(Math.random() < 0.4){
            System.out.println("El isntrumento " + getNombre() + " se está afinando.");
            afinado = false;
        }else{
            System.out.println("El isntrumento " + getNombre() + " está afinando correctamente.");
            afinado = true;
        }
    }

    public void tocar(){
        System.out.println("Tocando instrumento " + getNombre());
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    
}
