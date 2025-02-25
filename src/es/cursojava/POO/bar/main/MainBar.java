package es.cursojava.poo.bar.main;

import es.cursojava.poo.bar.clases.hija.ClienteAsiduo;
import es.cursojava.poo.bar.clases.hija.Comensal;
import es.cursojava.poo.bar.clases.hija.Huesped;

public class MainBar {

    private String nombre;

    public MainBar(String nombre){
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        MainBar bar = new MainBar("Bar Akuda");
        System.out.println(bar.nombre);
        bar.abrirBar();
    }

    // Método abrirBar con un Huesped, un Comensal y un ClienteAsiduo.
    private void abrirBar() {
        
        // Huesped
        Huesped huesped = new Huesped("Juan", "12345678A");
        System.out.println(huesped.toString());
        
        // Comensal
        Comensal comensal = new Comensal("Pedro", true);
        System.out.println(comensal.toString());
        
        // ClienteAsiduo
        ClienteAsiduo clienteAsiduo = new ClienteAsiduo("Luis", "El Rápido");
        System.out.println(clienteAsiduo.toString());
    }
}
