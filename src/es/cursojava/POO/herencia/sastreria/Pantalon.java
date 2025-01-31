package es.cursojava.POO.herencia.sastreria;

public class Pantalon extends Ropa{
    private Boton boton;
    
    //Constructor con parámetros
    public Pantalon(String color, double precio, String talla, Boton boton) {
        super(color, precio, talla);
        this.boton = boton;
    }

    //Getters y Setters
    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    
}
