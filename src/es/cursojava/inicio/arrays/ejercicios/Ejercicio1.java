package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Pedir el número de alumnos.
		//Crear un Array de String con el número de alumnos indicado.
		//Pedir para cada alumno su nombre y guardarlo en el Array.
		//Mostrar el nombre de todos los alumnos.
		//Mostrar el nombre de todos los alumnos que empiecen por A.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cunántos alumnos vas a registrar?");
		int numAlumnos = scan.nextInt();
		String[] alumno = new String[numAlumnos];
		
		for(int i=1 ; i<=numAlumnos ; i++) {
			System.out.print("Introduce el nombre del alumno " + i + ": ");
			alumno[i]=scan.nextLine();
		}
		System.out.println(alumno);
	}
}
