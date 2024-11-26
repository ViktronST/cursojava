package es.cursojava.inicio.operadoreslogicos.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la temperatura en grados Celsius: ");
	
		double tempCelsius = scan.nextDouble();
		
		double tempFahrenheit = tempCelsius*(9/5)+32;
		
		System.out.print("La temperatura en Fahrenheir es: " + tempFahrenheit);
		
		scan.close();

	}

}
