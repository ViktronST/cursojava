package es.cursojava.inicio.operadoreslogicos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Escribe otro número: ");
		int num2 = scan.nextInt();
		
		System.out.println("La suma de los números da: " + (num1+num2));
		System.out.println("La resta de los números da: " + (num1-num2));
		System.out.println("La multiplicación de los números da: " + (num1*num2));
		System.out.println("La división de los números da: " + (num1/num2));
		
		scan.close();
		
	}
	

}
