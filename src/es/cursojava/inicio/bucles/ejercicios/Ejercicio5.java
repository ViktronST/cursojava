package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
//		Solicitar por consola el numero de alumnos de un aula. 
//		Pedir para cada alumno su nota
//		Indicar la nota media de todos los alumnos del aula.
		
		Scanner scan = new Scanner(System.in);
		int numAlumnos = 15;
		
		if(numAlumnos<=0) {
			System.out.println("El número de alumnos debe ser mayor que 0.");
		}else {
			int sumaNotas = 0;

			for(int i=1 ; numAlumnos<=0; i++) {
				System.out.println("Ingrsa la nota del alumno " + i + ": ");
				
				int nota = scan.nextInt();
				
				if(nota<0 || nota>10) {
					System.out.println("Nota inválida");
					i--;
				}else {
					sumaNotas += nota;
				}

			}
			int notaMedia = sumaNotas/numAlumnos;
			System.out.println("La nota media de los " + numAlumnos + " alumnos es: " + notaMedia);		

		}
		
//		do {
//			System.out.print("Escribe la nota del alumno: ");
//			int notaAlumno = scan.nextInt();
//			numAlumnos++;
//			nota++;
//		}while(numAlumnos<15);
//		
//		System.out.println("La nota media es de: " + (nota/numAlumnos));

	}

}
