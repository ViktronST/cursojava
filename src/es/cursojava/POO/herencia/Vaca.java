package es.cursojava.POO.herencia;

public class Vaca extends Animal{
    //Atributos
    private int numCuernos;

    //Constructor con parámetros
    public Vaca(String nombre, double peso, int numCuernos){
        super(nombre, peso);  //Llamamos a los atributos de la clase PADRE.
        this.numCuernos = numCuernos;
    }

    public Vaca(String nombre, int numCuernos){
        super(nombre);  //Llamamos a los atributos de la clase PADRE.
        this.numCuernos = numCuernos;
    }

    //Métodos
    public void mugir(){
        System.out.println("La vaca " + getNombre() + " está mugiendo.");
    }

    //Sobreescribimos el método del padre
    //Para saber si lo estamos sobreescribiendo de manera correcta
    //pondremos "@Override" y este se asegura de que lo estamos sobreescribiendo.
    @Override
    public void comer(){
        System.out.println("La vaca " + getNombre() + " está pastando.");
    }
}
