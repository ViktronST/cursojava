package es.cursojava.poo.bar.clases;

public class TazaCafe {
    private String tipoCafe;
    private double temperatura;

    // Constructor
    public TazaCafe(String tipoCafe, double temperatura) {
        this.tipoCafe = tipoCafe;
        this.temperatura = temperatura;
    }

    //  Solo los comensales y los clientes Asiduos pueden tomar café.
    public void servirCafe() {
        System.out.println("Café servido");
    }

    // toString
    @Override
    public String toString() {
        return "TazaCafe [Temperatura= " + temperatura + ", Tipo de Cafe= " + tipoCafe + "]";
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
