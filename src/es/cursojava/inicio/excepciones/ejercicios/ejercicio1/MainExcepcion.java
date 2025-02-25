package es.cursojava.inicio.excepciones.ejercicios.ejercicio1;

import es.cursojava.poo.centroeducativo.Alumno;

public class MainExcepcion {
    public static void main(String[] args) {
        MainExcepcion main = new MainExcepcion();
        main.creaAlumno("Viktor", "Stoyanov", -24, 10, "null@null.es");;
    }

    private void creaAlumno(String nombre, String apellido, int edad, double notaMedia, String email) {
        try {
            Alumno alumno = new Alumno(nombre, apellido, edad, notaMedia, email);
            System.out.println(alumno);
        } catch (NotaInvalidaExcepcion error1) {
            System.out.println("Error: " + error1.getMessage());
        }
    }
}
