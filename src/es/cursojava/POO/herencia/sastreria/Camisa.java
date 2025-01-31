package es.cursojava.POO.herencia.sastreria;

public class Camisa extends Ropa{
    private Boton[] botones;

    //Constructor con parámetros
    public Camisa(String color, double precio, String talla, Boton[] botones) {
        super(color, precio, talla);
        this.botones = botones;
    }

    public Camisa(String color, double precio, String talla) {
        super(color, precio, talla);
    }

    //Getters y Setters
    public Boton[] getBoton() {
        return botones;
    }

    public void setBoton(Boton[] botones) {
        this.botones = botones;
    }
    
}
