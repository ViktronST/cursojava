package es.cursojava.inicio.colecciones.ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.POO.centroeducativo.Alumno;

public class MainAlumnos3 {
public static void main(String[] args) {
    MainAlumnos2 probar = new MainAlumnos2();

    Colegio colegio1 = new Colegio("Cole1", "Dir1");
    Map<String, List<Alumno>> aulasCole1 = probar.distribuirAlumnosEnAulas(probar.obtenerAlumnos(6));
    colegio1.setAulas(aulasCole1);

    Map<String, List<Alumno>> aulasCole2 = probar.distribuirAlumnosEnAulas(probar.obtenerAlumnos(6));
    Colegio colegio2 = new Colegio("Cole2", "Dir2", aulasCole2);

    Map<String, List<Alumno>> aulasCole3 = probar.distribuirAlumnosEnAulas(probar.obtenerAlumnos(6));
    Colegio colegio3 = new Colegio("Cole3", "Dir3", aulasCole3);

    List<Colegio> colegios = Arrays.asList(colegio1, colegio2, colegio3);
}
}
