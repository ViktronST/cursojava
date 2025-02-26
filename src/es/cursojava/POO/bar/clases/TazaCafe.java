package es.cursojava.poo.bar.clases;

import es.cursojava.poo.bar.excepcion.hija.TooColdTemperatureException;
import es.cursojava.poo.bar.excepcion.hija.TooHotTemperatureException;

public class TazaCafe {
    private String tipoCafe;
    private double temperatura;

    // Constructor
    public TazaCafe(String tipoCafe, double temperatura) {
        this.tipoCafe = tipoCafe;
        this.temperatura = temperatura;
    }

    // toString
    @Override
    public String toString() {
        return "TazaCafe [Temperatura= " + temperatura + ", Tipo de Cafe= " + tipoCafe + "]";
    }

    // Método tomarCafe
    public void tomarCafe() throws TooHotTemperatureException, TooColdTemperatureException {
        System.out.println("Tomando café...");

        temperatura = Math.random() * 100;
        System.out.println("Temperatura del café: " + temperatura);

        if (temperatura > 80) {
            throw new TooHotTemperatureException("¡Cuidado! El café está muy caliente.");
        } else if (temperatura < 40) {
            throw new TooColdTemperatureException("¡Cuidado! El café está muy frío.");
        } else {
            System.out.println("¡Qué rico café!");
        }
        
    }

    // Getters y Setters
    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}
