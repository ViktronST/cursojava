package es.cursojava.POO.herencia.interfaces.ejercicios.ejercicio1.interfaces;

public interface NoUpdatable extends Consultable, Insertable, Deletable{

    public void NoUpdate();
}
