package es.cursojava.inicio.arrays.ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
	
//		Ahoracado
//		En un array guardar una palabra. (Cada letra en una posición del array)
//		El usuario tendrá 6 vidas.
//		Empieza el juego
//			+ Preguntar al usuario por las letras. (Se le preguntará hasta que acierte o se quede sin vidas)
//				+ Si acierta una letra mostrar las letras descubiertas
//				+ Si no acierta, se le indica que ha fallado y se le quita una vida
//			+ Si acierta la palabra entera antes de perder todas las vidas habrá ganado
//			+ Si pierde todas las vidas sin acertar la palabra habrá perdido
		
		String[] palabras = {"destornillador","monitor","pirata","murciélago","metamorfosis",};
		
		int random = (int)Math.random()*5;
		String palabraJuego = palabras[random];
		
		String[] palabra = palabraJuego.split("");
		System.out.println(palabraJuego);
		System.out.println(palabra.length);
	}

}
