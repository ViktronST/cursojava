package es.cursojava.inicio.menu;

import java.util.Scanner;

public class EjercicioMenu {
	public static void main(String[] args) {
		
//		Pintar menu mientras que el usuario no seleccione la opción 4
//
//		1. Pintar Cuadrado
//		2. Validar email
//		3. Añadir Alumno
//		4. Salir
//
//		Elige una opción
//
//
//		Si el usuario selecciona la opción 1
//			+ Vamos a preguntar por el tamaño del cuadrado:
//				Ejemplo: 5
//				* * * * *
//				*  		*
//				*       *
//				*       *
//				* * * * *
//				
//		Si el usuario selecciona la opción 2
//			+ Vamos a preguntar por un email:
//				-Debe tener solo una @
//				-No puede tener espacios en blanco
//				-Después de la @ tiene que haber al menos un punto
//				-Entre la @ y el primer punto después de la @ tiene que haber al menos 2 carcateres
//				-Después del último punto solo puede haber entre 2 y 6 caracter
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenido al Menú");
		System.out.println("1. Pintar Cuadrado");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir alumno");
		System.out.println("4. Salir");
		System.out.print("\nElige una opción: ");
		scan = new Scanner(System.in);
		String opcion = scan.nextLine();
		
		if(opcion.equals("uno") || opcion.equals("1")) {
			System.out.println("- Has seleccionado Pintar Cuadrado.");
			System.out.println("¿De qué tamaño quieres el cuadrado?");
			int tamanio = scan.nextInt();
			
			for(int i=0 ; i<tamanio ; i++) {
				
				for(int j=0; j<tamanio ; j++) {	
					
					if(i==0 || i==tamanio-1 || j==0 || j==tamanio-1) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
				System.out.println(" ");

			}
			
		}else if(opcion.equals("dos") || opcion.equals("2")) {
			System.out.println("- Has seleccionado validar email.");
			System.out.print("Introduce el email: ");
			String email = scan.nextLine();
			
			if(email.contains(" ") || email.isEmpty() || email.contains()) {
				System.out.println("Introduce un correo válido.");
			}else {
				System.out.println("Correo válido.");
			}
			
		}else if(opcion.equals("tres") || opcion.equals("3")) {
			System.out.println("- Has seleccionado añadir alumno.");
			
			
		}else if(opcion.equals("cuatro") || opcion.equals("4")) {
			System.out.println("= = = Adiós! = = =");
		}else {
			System.out.println(" Oops!, error... ");
		}

	}

}
