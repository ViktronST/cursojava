package es.cursojava.POO.herencia;

public class Leon extends Animal{
    private boolean tieneMelena;

    public Leon (boolean tieneMelena, String nombre, double peso){
        super(nombre, peso); //Llamamos a los atributos de la clase PADRE.
        this.tieneMelena = tieneMelena;
    }

    public void cazar(){
        System.out.println("El león " + getNombre() + " está cazando.");
    }
}
