package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cafetera extends ProductosElectronicos {
    private String tipo; //Cápsulas o granos de café.

    //Constructor
    public Cafetera(String nombre, double precio, String fechaFabricacion, String tipo) {
        super(nombre, precio, fechaFabricacion);
        this.tipo = tipo;
    }

    //Método
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String padre = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(" Cafetera [ ");
        sb.append(padre);
        //sb.append(super.toString());
        sb.append(", Tipo: ").append(tipo);
        sb.append(" ]");
        return sb.toString();
    }
}
