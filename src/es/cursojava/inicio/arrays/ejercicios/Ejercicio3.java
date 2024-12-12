package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Pedir cuantos números se van a guardar
		//Pedir los valores de cada número
		//Mostrar todos los números introducidos
		//Reordenar los números de manera inversa en el array
		//Mostrar de nuevo todos los números

		//Original: 4, 2, 8, 3, 7
		//Inverso: 7, 3, 8, 2, 4
		
		Scanner scan = new Scanner(System.in);
		
	//Pedir cuantos números se van a guardar
		System.out.println("¿Cuántos números vas a utilizar?");
		int numeros = scan.nextInt();
		String[] valores = new String[numeros];
		
	//Mostrar todos los números introducidos
		for(int i=0 ; i<valores.length ; i++){
			scan = new Scanner(System.in);
			System.out.print("Escribe el valor del número: ");
			valores[i] = scan.nextLine();
		}
		
		for(int i=0 ; i<valores.length ; i++){
			System.out.print(valores[i]+", ");
		}
		
		//Reordenar los números de manera inversa en el array
		
		
	}

}
