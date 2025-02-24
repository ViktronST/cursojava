package es.cursojava.inicio.excepciones.ejercicios.ejercicio1;

import es.cursojava.POO.centroeducativo.Alumno;
import es.cursojava.inicio.funciones.Utilidades;

public class MainExcepcion {
    public static void main(String[] args) {
        MainExcepcion main = new MainExcepcion();
        main.pideDatos();
    }

    private void pideDatos() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = Utilidades.pideDatoCadena("Federico");
            System.out.println("Introduce el apellido del alumno: ");
            String apellido = Utilidades.pideDatoCadena("García Lorca");
            System.out.println("Introduce la edad del alumno: ");
            int edad = Utilidades.pideDatoNumerico("38");
            System.out.println("Introduce la nota media del alumno: ");
            double notaMedia = Utilidades.pideDatoNumerico("8.5");
            System.out.println("Introduce el email del alumno: ");
            String email = Utilidades.pideDatoCadena("Lorca@gmail.com");
        }
        
    }

    private void creaAlumno(String nombre, String apellido, int edad, double notaMedia, String email) {
        try {
            Alumno alumno = new Alumno(nombre, apellido, edad, notaMedia, email);
        } catch (NotaInvalidaExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
