package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	
//		Scanner scan = new Scanner(System.in);
		
//		double suma = 0;
//		
//		System.out.println("¿Cuánto ha durado la llamada?");
//		int min = scan.nextInt();
//		int minextra;
//		
//		if(min>10) {
//			suma = (5 + (0.8*3) + (0.7*2));
//			minextra = min-10;
//			suma = suma + (minextra*0.5);
//		}else if(min>8) {
//			suma = (5 + (0.8*3));
//			minextra = min-8;
//			suma = suma + (minextra*0.7);
//		}else if (min>5) {
//			suma = 5;
//			minextra = min-5;
//			suma = suma + (minextra*0.8);
//		}else if(min>0) {
//			suma = min;
//		}else {
//			System.out.println("Introduce un número válido");
//		}
//		
//		suma = Math.round(suma*100.00)/100.00;
//		
//		System.out.println("La llamada ha durado " + min + " minutos y tiene un costo de " + suma + "€.");
		
		int minLlamada = 10;
		double precioLlamada = 0;
		String dia = "Martes";
		int hora = 5;
		
		if(minLlamada>0 && minLlamada<=5) {
			precioLlamada++;
			//precioLlamada+=1;
			//precioLlamada = precioLlamada + 1;
		}else if(minLlamada>5 && minLlamada<=8) {
			precioLlamada+=1.8;
		}else if(minLlamada>8 && minLlamada<=10) {
			precioLlamada+=2.5;
		}else if(minLlamada>10) {
			precioLlamada+= (minLlamada-10)*0.5;
		}else {
			System.out.println("Introduce un número correcto.");
		}
		
		System.out.println("El precio de la llamada total es " + precioLlamada + "€.");
		
		double impuesto = 0.0;
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Es domingo.");
			impuesto = precioLlamada*3/100;
		}else {
			if(hora>=6 && hora<12) {
				impuesto = precioLlamada*15/100;
			}else if(hora>=12 && hora<23) {
				impuesto = precioLlamada*10/100;
			}else {
				impuesto = -precioLlamada*10/100;
			}
		}
		
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total a pagar por " + minLlamada + " minutos " + (precioLlamada+impuesto));
		
        // OPERADOR TERCIARIO EXPLICACION
//		String texto = "";
//		if(minLlamada==1) {
//			texto = "minuto";
//		}else {
//			texto = "minuto";
//		}
//		System.out.println(texto);
//		
		// OPERADOR TERCIARIO CON UN BOOLEAN
//		String textoTernario = (minLlamada==1) ? "minuto" : "minutos" ;
		// OPERADOR TERCIARIO CON DOS BOOLEAN
//		String textoTernario2 = (minLlamada==1) ? "minuto" : (minLlamada==2) ? "minutos" : "minutoss" ;
//		System.out.println(textoTernario);
	}
}
