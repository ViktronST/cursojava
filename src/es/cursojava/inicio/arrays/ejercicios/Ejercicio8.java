package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
//		Preguntar cuantas aulas tiene un colegio, 
//		Suponiendo que en cada aula caben 5 alumnos
//
//		1. Pedir datos
//			+ Por cada mesa vacía de un aula solicitar el nombre del alumno
//		2. Mostrar alumnos por aula
//			+ Mostrar por cada aula los nombres de los alumnos
//		3. Buscar alumno
//			+ Pedir nombre del alumno a buscar
//			+ Indicar en qué aula se encuentra
//		4. Borrar alumnos
//			+ Confirmar borrado
//		5. Salir
//
//		Selecciona una opción
		
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuántas aulas tiene el colegio?");
		int numAulas = scan.nextInt();
		
		int opcion = 0;
		final int OPCION_SALIR = 4;
		
		do {
			System.out.println("1. Datos de los Alumnos");
			System.out.println("2. Alumnos por Aula");
			System.out.println("3. Buscar Alumno");
			System.out.println("4. Borrar Alumnos");
			System.out.println("5. Salir");
			System.out.print("\nElige una opción: ");
			scan = new Scanner(System.in);
			
			opcion = scan.nextInt();
			
			switch(opcion) {
			
				case 1: 
					System.out.println("- Has elegido la opcion " + opcion + ": Datos de los Alumnos.");
					break;
					
				case 2: 
					System.out.println("Has elegido la opcion " + opcion + ": Alumnos por Aula.");
					break;
					
				case 3: 
					System.out.println("Has elegido la opcion " + opcion + ": Buscar Alumno.");
					break;
					
				case 4: 
					System.out.println("Has elegido la opcion " + opcion + ": Borrar Alumnos.");
					break;
				
				case 5:
					System.out.println("= = = Adiós! = = =");
					break;
					
				default: 
					System.out.println("- Opción Incorrecta -");
			}
			
		}while(opcion!=OPCION_SALIR);
	}

}
