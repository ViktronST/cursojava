package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Yogur extends Alimentos{
    private String sabor;

    //Constructor
    public Yogur(String nombre, double precio, String fechaCaducidad, String sabor) {
        super(nombre, precio, fechaCaducidad);
        this.sabor = sabor;
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
        sb.append(" Yogur [ ");
        sb.append(padre);
        //sb.append(super.toString());
        sb.append(", Sabor: ").append(sabor);
        sb.append(" ]");
        return sb.toString();
    }
}
