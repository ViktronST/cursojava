package es.cursojava.inicio.arrays.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Meter los valores 4,8,15,16,23,42 en un array.
		//Mostrar todos los números.
		//Mostrar la media de los valores.
		//Mostrar el número mayor y el número menor.
		
		int[] numeros = {4,8,15,16,23,42};
		
	//Mostrar todos los números.
		for(int i=0 ; i<numeros.length ; i++) {
			System.out.println(numeros[i]);
		}
		
	//Mostrar la media de los valores.
		int suma = 0;
		
		for(int numero : numeros) {
			suma += numero;
		}
		
		int media = suma / numeros.length;
		
		System.out.println("La media es: " + media);
		
	//Mostrar el número mayor y el número menor.
		int mayor = numeros[0];
		int menor = numeros[0];
		
		for(int numero : numeros) {
			if(numero > mayor) {
				mayor = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("El menor número es: " + menor);
		System.out.println("El mayor número es: " + mayor);
	}

}
