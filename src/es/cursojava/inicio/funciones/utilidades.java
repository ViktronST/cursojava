package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class utilidades {
	
	public static int pideDatoNumerico(String texto) {
		System.out.print(texto);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		return numero;
	}
	
	public static String pideDatoCadena(String texto) {
		System.out.print(texto);
		Scanner scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		
		return cadena;
	}
	
	public static void pintaMenu(String[] texto) {
		System.out.println("");
		System.out.println("* * * * MENÚ * * * *");
		System.out.println("Elige una opción");
		System.out.println("1. " + texto[0]);
		System.out.println("2. " + texto[1]);
		System.out.println("3. " + texto[2]);

	}
}
