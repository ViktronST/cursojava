package es.cursojava.inicio.colecciones.ejercicios.ejercicio1;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import es.cursojava.POO.centroeducativo.Alumno;

public class MainAlumnos {
    public static void main(String[] args) {
        MainAlumnos probar = new MainAlumnos();

        Alumno alumno1 = new Alumno("N1", "A1", 18, 4.9, "asdas1@gmail.com");
        Alumno alumno2 = new Alumno("N2", "A2", 19, 5, "asdas2@gmail.com");
        Alumno alumno3 = new Alumno("N1", "A3", 20, 4, "asdas3@gmail.com");
        Alumno alumno4 = new Alumno("N2", "A4", 21, 10, "asdas4@gmail.com");
        Alumno alumno5 = new Alumno("N5", "A5", 22, 7, "asdas5@gmail.com");
        Alumno alumno6 = new Alumno("N1", "A6", 23, 3.5, "asdas6@gmail.com");

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
       
        //Otras manera de crear las listas.
        // alumnos.add(new Alumno("N1", "A1", 18, 4.9, "asdas1@gmail.com"));
        // alumnos.add(new Alumno("N2", "A2", 19, 5, "asdas2@gmail.com"));
        // alumnos.add(new Alumno("N3", "A3", 20, 4, "asdas3@gmail.com"));
        // alumnos.add(new Alumno("N4", "A4", 21, 10, "asdas4@gmail.com"));
        // alumnos.add(new Alumno("N5", "A5", 22, 7, "asdas5@gmail.com"));
        // alumnos.add(new Alumno("N6", "A6", 23, 3.5, "asdas6@gmail.com"));
        
        //Otra manera de crear las listas.
        //List<Alumno> listaAlumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6);

        probar.mostrarInfoAlumnos(alumnos);
    }

    private void mostrarInfoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    private String nombreAlumno() {
        String nombre.equals();
    }

    private int notaMedia() {
        
    }
}
