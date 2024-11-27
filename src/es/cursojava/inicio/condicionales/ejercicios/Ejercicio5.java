package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Departamento del empleado: ");
		String dep = scan.nextLine();
		
		System.out.print("Edad del empleado: ");
		int edad = scan.nextInt();
		
		System.out.print("Experiencia del empleado: ");
		int exp = scan.nextInt();
		
		String empleado = "";
		
		if(dep.equals("Ventas")) {
			empleado = "Asistente de ventas";
			System.out.println("El empleado de " + edad + " años de edad, con " + exp + " años de experiencia y perteneciente al departamento de " + dep + ", tiene el puesto de: " + empleado);
		}else if(dep.equals("Recursos Humanos")) {
			empleado = "Gestor de personas";
			System.out.println("El empleado de " + edad + " años de edad, con " + exp + " años de experiencia y perteneciente al departamento de " + dep + ", tiene el puesto de: " + empleado);
		}else if(dep.equals("TI")) {
			empleado = "Tech Lead";
			System.out.println("El empleado de " + edad + " años de edad, con " + exp + " años de experiencia y perteneciente al departamento de " + dep + ", tiene el puesto de: " + empleado);
		}else {
			if(exp<1) {
				if(edad<18) {
					empleado = "Becario Juniro";
				}else if (edad>=18 && edad<=35) {
					empleado = "Trainee";
				}else {
					System.out.println("Error");
				}
			}else if(exp>=1 && exp<=5) {
	            if(edad>=18 && edad<=35) {
					empleado = "Junior";
				}else if (edad>35) {
					empleado = "Especialista";
				}else {
					System.out.println("Error");
				}
			}else if(exp>5) {
	            if(edad>=18 && edad<=35) {
	            	empleado = "Senior";
				}else if (edad>35) {
					empleado = "Experto";
				}else {
					System.out.println("Error");
				}
			}else {
				System.out.println("Error");
			}
			System.out.println("El empleado de " + edad + " años de edad y con " + exp + " años de experiencia, tiene el puesto de: " + empleado);
		}
	}

}
