package es.cursojava.inicio.funciones;

public class MenuUtilidades {
    public static void main(String[] args) {
    	
        int numAulas = Utilidades2.pideDatoNumerico("¿Cuántas aulas tiene el colegio?");
        String[][] aulas = new String[numAulas][5];
        int opcion;
        final int OPCION_SALIR = 5;

        do {
        	String[] opcionesMenu = {"\n = = = MENÚ = = =", "1. Introducir Datos de los Alumnos", "2. Mostrar Alumnos por Aula",
        			"3. Buscar Alumno", "4. Borrar Alumno", "5. Salir"};
            Utilidades2.pintarMenu(opcionesMenu);
            opcion = Utilidades2.pideDatoNumerico("Introduce una opción: ");

            switch (opcion) {
                case 1: Utilidades2.datosAlumnos(aulas); break;
                case 2: Utilidades2.mostrarAlumnos(aulas); break;
                case 3: Utilidades2.buscarAlumno(aulas); break;
                case 4: Utilidades2.borrarAlumno(aulas); break;
                case 5: Utilidades2.pideDatoCadena("\n- - - ¡Adiós! - - -"); break;
                default: Utilidades2.pideDatoCadena("\nOpción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != OPCION_SALIR);

    }

}
