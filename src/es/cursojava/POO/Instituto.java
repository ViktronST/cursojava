package es.cursojava.POO;

public class Instituto {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("María", "Gómez", 17, 10, "mariago1907@gmail.com");
        // alumno1.setNombre("María");
        // alumno1.setApellido("Gómez");
        // alumno1.setEdad(17);
        // alumno1.setNotaMedia(10);
        // alumno1.setEmail("mariago1907@gmail.com");
        alumno1.setAsignaturas(args);

        Alumno alumno2 = new Alumno("Pedro", "Martínez", 19, 5, "martinezpedro@gmail.com");
        // alumno2.setNombre("Pedro");
        // alumno2.setApellido("Martínez");
        // alumno2.setEdad(19);
        // alumno2.setNotaMedia(5);
        // alumno2.setEmail("martinezpedro@gmail.com");
        String[] asignaturasAlumno2 = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Historia"};
        alumno2.setAsignaturas(asignaturasAlumno2);

        String[] asignaturasAlumno3 = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Filosofía"};
        Alumno alumno3 = new Alumno("Ana", "Sánchez", 20, 3, "sanchez2222@gmail.com", asignaturasAlumno3);
        // alumno3.setNombre("Ana");
        // alumno3.setApellido("Sánchez");
        // alumno3.setEdad(20);
        // alumno3.setNotaMedia(3);
        // alumno3.setEmail("sanchez2222@gmail.com");

        Alumno alumno4 = new Alumno();
        alumno4.setNombre("Juan");
        alumno4.setApellido("José Pérez");
        alumno4.setEdad(18);
        alumno4.setNotaMedia(7);
        alumno4.setEmail("juanjo2006@gmail.com");
        String[] asignaturas = {"Matemáticas", "Lengua", "Inglés", "Física", "Química", "Historia"};

        String[] alumnos = new String[4];
        alumnos[0] = alumno1.getNombre();
        alumnos[1] = alumno2.getNombre();
        alumnos[2] = alumno3.getNombre();
        alumnos[3] = alumno4.getNombre();
    }
}
