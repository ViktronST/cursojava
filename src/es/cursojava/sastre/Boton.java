package es.cursojava.sastre;

public class Boton {
    //Creamos la clase botón con los atributos color, tamaño y forma.
    private String color;
    private String tamanio;
    private String forma;

    //Constructor con parámetros
    public Boton(String color, String tamanio, String forma) {
        this.color = color;
        this.tamanio = tamanio;
        this.forma = forma;
    }
    
    //Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

}
