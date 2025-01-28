package es.cursojava.POO.cinefilos;

public class Espectador {
    private String nombre;
    private String dni;

    //Constructor con parámetros
    public Espectador(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
}
