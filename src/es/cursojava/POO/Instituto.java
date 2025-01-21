package es.cursojava.POO;

public class Instituto {
    public static void main(String[] args) {
        Alumno alumno0 = new Alumno();
        alumno0.setNombre("Juan");
        alumno0.setApellido("José Pérez");
        alumno0.setEdad("18");
        alumno0.setNotaMedia(7);
        alumno0.setEmail("juanjo2006@gmail.com");
        String[] asignaturas = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Historia"};

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("María");
        alumno1.setApellido("Gómez");
        alumno1.setEdad("17");
        alumno1.setNotaMedia(10);
        alumno1.setEmail("mariago1907@gmail.com");
        String[] asignaturas1 = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Arte"};

        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Pedro");
        alumno2.setApellido("Martínez");
        alumno2.setEdad("19");
        alumno2.setNotaMedia(5);
        alumno2.setEmail("martinezpedro@gmail.com");
        String[] asignaturas2 = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Educación Física"};

        Alumno alumno3 = new Alumno();
        alumno3.setNombre("Ana");
        alumno3.setApellido("Sánchez");
        alumno3.setEdad("20");
        alumno3.setNotaMedia(3);
        alumno3.setEmail("sanchez2222@gmail.com");
        String[] asignaturas3 = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Filosofía"};

        Alumno[] alumnos = new String[4];
        alumnos[0] = alumno0.getNombre();
        alumnos[1] = alumno1.getNombre();
        alumnos[2] = alumno2.getNombre();
        alumnos[3] = alumno3.getNombre();

    }
}
