package es.cursojava.inicio.colecciones.ejercicios.ejercicio1;

import es.cursojava.POO.centroeducativo.Alumno;
import es.cursojava.inicio.funciones.Utilidades;

import java.util.ArrayList;
import java.util.LinkedHashMap;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainAlumnos2 {
    public static void main(String[] args) {
        MainAlumnos2 probar = new MainAlumnos2();
        probar.mostrarInfoAlumnos(probar.obtenerAlumnos());
        probar.mostrarNotasPorNombre(probar.obtenerAlumnos());

        // Obtener los alumnos
        List<Alumno> alumnos = probar.obtenerAlumnos();

        // Distribuir alumnos en aulas
        Map<String, List<Alumno>> aulas = probar.distribuirAlumnosEnAulas(alumnos);

        // Mostrar información de cada aula y sus alumnos
        probar.mostrarAulas(aulas);

        // Encontrar al mejor alumno entre todas las aulas
        probar.encontrarMejorAlumno(aulas);

        // Eliminar alumnos suspensos
        probar.eliminarAlumnosSuspensos(alumnos);
    }

    private List<Alumno> obtenerAlumnos() {
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

        return alumnos;
    }

    private void mostrarInfoAlumnos(List<Alumno> alumnos) {
        System.out.println("================  Listado de Alunmos ================");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    private void mostrarNotasPorNombre(List<Alumno> alumnos) {
        System.out.println("\n================  Buscando de Alunmos ================");
        String nombre = Utilidades.pideDatoCadena("Introduce nombre del alumno: ");
        boolean encontrado = false;

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\nNombre: " + alumno.getNombre() + " - Nota Media: " + alumno.getNotaMedia());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nNo hay alumnos con el nombre '" + nombre + "'.");
        }
    }

    private Map<String, List<Alumno>> distribuirAlumnosEnAulas(List<Alumno> alumnos) {
        Map<String, List<Alumno>> aulas = new LinkedHashMap<>();
        aulas.put("Aula 1", new ArrayList<>());
        aulas.put("Aula 2", new ArrayList<>());
        aulas.put("Aula 3", new ArrayList<>());

        // DISTRIBUIR EN ORDEN SECUENCIAL
        for (int i = 0; i < alumnos.size(); i++) {
            if (i < 2) {
                aulas.get("Aula 1").add(alumnos.get(i));
            } else if (i < 4) {
                aulas.get("Aula 2").add(alumnos.get(i)); 
            } else {
                aulas.get("Aula 3").add(alumnos.get(i)); 
            }
        }

        return aulas;
    }

    // private void mostrarAulas(Map<String, List<Alumno>> aulas) {
    //     for (String aula : aulas.keySet()) {
    //         System.out.println("\n" + aula + ":");
    //         List<Alumno> alumnos = aulas.get(aula);
    //         for (Alumno alumno : alumnos) {
    //             System.out.println("" + alumno);
    //         }
    //     }
    // }

    private void mostrarAulas(Map<String, List<Alumno>> aulas) {
        System.out.println("\n================ Distribución por Aulas ================");
        for (String aula : aulas.keySet()) {
            System.out.println("\n" + aula + ":");
            for (Alumno alumno : aulas.get(aula)) {
                System.out.println("\t" + alumno);
            }
        }
    }

    // private void encontrarAulaConMejorNota(Map<String, List<Alumno>> aulas) {
    //     String mejorAula = "";
    //     double mejorNota = 0;

    //     for (String aula : aulas.keySet()) {
    //         List<Alumno> alumnos = aulas.get(aula);
    //         for (Alumno alumno : alumnos) {
    //             if (alumno.getNotaMedia() > mejorNota) {
    //                 mejorNota = alumno.getNotaMedia();
    //                 mejorAula = aula;
    //             }
    //         }
    //     }

    //     System.out.println("\nEl aula con la mejor nota media es: " + mejorAula + " con una nota de " + mejorNota);
    // }

    private void encontrarMejorAlumno(Map<String, List<Alumno>> aulas) {
        Alumno mejorAlumno = null;
        String aulaMejorAlumno = "";

        for (String aula : aulas.keySet()) {
            for (Alumno alumno : aulas.get(aula)) {
                if (mejorAlumno == null || alumno.getNotaMedia() > mejorAlumno.getNotaMedia()) {
                    mejorAlumno = alumno;
                    aulaMejorAlumno = aula;
                }
            }
        }

        if (mejorAlumno != null) {
            System.out.println("\nEl mejor alumno es: " + mejorAlumno.getNombre() + " " + mejorAlumno.getApellido() +
                    " con una nota de " + mejorAlumno.getNotaMedia() + " en " + aulaMejorAlumno);
        } else {
            System.out.println("\nNo hay alumnos en las aulas.");
        }
    }

    // MÉTODO CON MAP.ENTRY
    // private void mostrarAulas(Map<String, List<Alumno>> aulas) {
    //     for (Map.Entry<String, List<Alumno>> entry : aulas.entrySet()) {
    //         System.out.println("\n" + entry.getKey() + ":");
    //         for (Alumno alumno : entry.getValue()) {
    //             System.out.println("\t" + alumno);
    //         }
    //     }
    // }

    // private void encontrarAulaConMejorNota(Map<String, List<Alumno>> aulas) {
    //     String mejorAula = "";
    //     double mejorNota = 0;

    //     for (Map.Entry<String, List<Alumno>> entry : aulas.entrySet()) {
    //         for (Alumno alumno : entry.getValue()) {
    //             if (alumno.getNotaMedia() > mejorNota) {
    //                 mejorNota = alumno.getNotaMedia();
    //                 mejorAula = entry.getKey();
    //             }
    //         }
    //     }
    // }

    // MÉTODO CON LIST<LIST<ALUMNO>>
    // private List<List<Alumno>> separarEnAulas(List<Alumno> alumnos) {
    //     List<List<Alumno>> aulas = new ArrayList<>();
    //     aulas.add(new ArrayList<>()); // Aula 1
    //     aulas.add(new ArrayList<>()); // Aula 2
    //     aulas.add(new ArrayList<>()); // Aula 3

    //     // DISTRIBUIR CÍCLICAMENTE
    //     // for (int i = 0; i < alumnos.size(); i++) {
    //     //     aulas.get(i % 3).add(alumnos.get(i)); 
    //     // }

    //     // DISTRIBUIR EN ORDEN SECUENCIAL
    //     for (int i = 0; i < alumnos.size(); i++) {
    //         if (i < 2) {
    //             aulas.get(0).add(alumnos.get(i)); // Primeros 2 a Aula 1
    //         } else if (i < 4) {
    //             aulas.get(1).add(alumnos.get(i)); // Siguientes 2 a Aula 2
    //         } else {
    //             aulas.get(2).add(alumnos.get(i)); // Últimos 2 a Aula 3
    //         }
    //     }

    //     return aulas;
    // }

    // private void mostrarAulas(List<List<Alumno>> aulas) {
    //     System.out.println("\n======== Listado de alumnos por aula ======== ");
    //     for (int i = 0; i < aulas.size(); i++) {
    //         System.out.println("\nAula " + (i + 1) + ":");
    //         for (Alumno alumno : aulas.get(i)) {
    //             System.out.println("Nombre: " + alumno.getNombre() + " - Nota Media: " + alumno.getNotaMedia());
    //         }
    //     }
    // }

    // private void aulaConMejorAlumno(List<List<Alumno>> aulas) {
    //     double mejorNota = -1;
    //     int aulaMejor = -1;
    //     Alumno mejorAlumno = null;

    //     for (int i = 0; i < aulas.size(); i++) {
    //         for (Alumno alumno : aulas.get(i)) {
    //             if (alumno.getNotaMedia() > mejorNota) {
    //                 mejorNota = alumno.getNotaMedia();
    //                 aulaMejor = i + 1;
    //                 mejorAlumno = alumno;
    //             }
    //         }
    //     }

    //     if (mejorAlumno != null) {
    //         System.out.println("\nEl aula con el alumno de mayor nota media es el Aula " + aulaMejor +
    //                 " (Alumno: " + mejorAlumno.getNombre() + " - Nota Media: " + mejorNota + ")");
    //     }
    // }

    private void eliminarAlumnosSuspensos(List<Alumno> alumnos) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNotaMedia() < 5) {
                alumnos.remove(i);
                i--;
            }
        }

        System.out.println("\n================ Alumnos Aprobados ================");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
