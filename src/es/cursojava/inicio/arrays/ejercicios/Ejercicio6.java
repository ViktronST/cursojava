package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
//		+ Definir array bidimensional de enteros de 2x3
//		+ Dar los valores de cada posición de una en una
//		+ Mostrar todos los datos en formato matriz con dos for anidados
//		+ Hacer los mismo con 2 foreach
		
		Scanner scan = new Scanner(System.in);
		
		int[][] numeros = new int[2][3];
		
		System.out.println("Dame el número para la posición:");
		for(int i=0 ; i<numeros.length ; i++) {
			for(int j=0 ; j<numeros[i].length ; j++) {
				scan = new Scanner(System.in);
				System.out.print("["+i+"]["+j+"]: ");
				numeros[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\n- - - Matríz - - -");
		for(int i=0 ; i<numeros.length ; i++) {
			for(int j=0 ; j<numeros[i].length ; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for (int[] fila : numeros) {
			for (int numero : fila) {
				System.out.print(numero);
			}
		}
		
		for (int[] columna : numeros) {
			for (int numero : columna) {
				System.out.print(numero);
			}
		}

	}

}
