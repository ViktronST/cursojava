package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Dame otro número: ");
		int num2 = scan.nextInt();
		
		System.out.println("¿Qué operación quieres realizar?");
		scan = new Scanner(System.in);
		String operacion = scan.nextLine();
		
//		if (operacion.equals("suma") || operacion.equals("+")) {
//			System.out.println("Resultado: " + (num1+num2));
//		}else if(operacion.equals("resta") || operacion.equals("-")) {
//			System.out.println("Resultado: " + (num1-num2));
//		}else if(operacion.equals("multiplicar") || operacion.equals("*")) {
//			System.out.println("Resultado: " + (num1*num2));
//		}else {
//			System.out.println("Resultado: " + (num1/num2));
//		}
		
		int resultado = 0;
		if (operacion.equals("suma") || operacion.equals("+")) {
			resultado = num1+num2;
			operacion = "suma";
		}else if(operacion.equals("resta") || operacion.equals("-")) {
			resultado = num1-num2;
			operacion = "resta";
		}else if(operacion.equals("multiplicar") || operacion.equals("*")) {
			resultado = num1*num2;
			operacion = "multiplicar";
		}else {
			resultado = num1/num2;
			operacion = "dividir";
		}
		
		System.out.println("La " + operacion + " de " + num1 + " y " + num2 + " es " + resultado);
	}
}

