package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coche extends VehiculosMotorizados{
    private int numPuertas;

    //Constructor
    public Coche(String marca, String modelo, int anio, double velocidadMaxima, String tipo, String motor,
            int numPuertas) {
        super(marca, modelo, anio, velocidadMaxima, tipo, motor);
        this.numPuertas = numPuertas;
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
        sb.append(" Coche [ ");
        sb.append(padre);
        //sb.append(super.toString());
        sb.append(", Número de Puertas: ").append(numPuertas);
        sb.append(" ]");
        return sb.toString();
    }
}
