package es.cursojava.inicio.colecciones.ejercicios.ejercicio1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Colegio {
    private String nombre;
    private String direccion;
    private Map<String, List<Alumno>> aulas;

    //Lista de Colegios, con Mapa de Aulas y Lista de Alumnos...
    //colegios.get(0).getAulas().get("aula1")get(0).getNombre()  ->  1er Alumno

}
