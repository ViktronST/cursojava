package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class pruebaUtilidades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//LLAMAMOS A pideDatoNumerico
		int edad = utilidades.pideDatoNumerico("Introduce tu edad: ");
		int opcion = utilidades.pideDatoNumerico("Introduce una opción: ");
		
		//LLAMAMOS A pideDatoCadena
		String nombre = utilidades.pideDatoCadena("Introduce tu nombre: ");
		String mes = utilidades.pideDatoCadena("Introduce tu mes de nacimiento: ");

		String[] texto = new String[3];
		texto[0] = "Hola";
		texto[1] = "Manolo";
		texto[2] = "Vicente";
		utilidades.pintaMenu(texto);
		
	}

}
