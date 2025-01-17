package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class Utilidades2 {
	
	public static int numAulas(int aulas) {
		
	}
	
	public static void pintarMenu(String[] menuArray) {
		for (String opcion : menuArray) {
			System.out.println(opcion);
		}
		System.out.print("\nIntroduce una opción: ");
	}
	
	public static int caso1(int[] numAulas) {
    	Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numAulas; i++) {
            System.out.println("Aula " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce el nombre del alumno para la mesa " + (j + 1) + ": ");
                aulas[i][j] = scan.nextLine();
                return aulas[i][j];
            }
        }
	}
}
