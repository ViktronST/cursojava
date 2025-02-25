package es.cursojava.poo.bar.clases.hija;

import es.cursojava.poo.bar.clases.padre.Cliente;

public class ClienteAsiduo extends Cliente{
    private String mote;

    // Constructor
    public ClienteAsiduo(String nombre, String mote) {
        super(nombre);
        this.mote = mote;
    }

    // Método tomarCafe
    public void tomarCafe() {
        System.out.println("Tomando café...");
    }

    // toString
    @Override
    public String toString() {
        return "ClienteAsiduo [Mote= " + mote + "]";
    }

    // Getters y Setters
    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    
}
