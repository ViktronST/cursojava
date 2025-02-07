package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BiciMontana extends Bicicleta{
    private int diametroRuedas;

    //Constructor
    public BiciMontana(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numMarchas,
            int diametroRuedas) {
        super(marca, modelo, anio, velocidadMaxima, tipo, numMarchas);
        this.diametroRuedas = diametroRuedas;
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
        sb.append(" Bici de Montaña [ ");
        sb.append(padre);
        //sb.append(super.toString());
        sb.append(", Diámetro de Ruedas: ").append(diametroRuedas);
        sb.append(" ]");
        return sb.toString();
    }
}
