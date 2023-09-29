// Laboratorio Nro 01 - Ejercicio2
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 2 min

import java.util.*;
public class Actividad_2 {
	public static void main(String[] args) {

		String soldado1, soldado2, soldado3, soldado4, soldado5;
		int salud1, salud2, salud3, salud4, salud5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de 5 soldados con su nivel de vida: ");
		soldado1 = sc.next();
		salud1 = sc.nextInt();
		soldado2 = sc.next();
		salud2 = sc.nextInt();
		soldado3 = sc.next();
		salud3= sc.nextInt();
		soldado4 = sc.next();
		salud4 = sc.nextInt();
		soldado5 = sc.next();
		salud5 = sc.nextInt();
		
		System.out.println("Los soldados ingresados son: \n"
				+ soldado1 + " con un nivel de vida de " + salud1 + "\n"
				+ soldado2 + " con un nivel de vida de " + salud2 + "\n"
				+ soldado3 + " con un nivel de vida de " + salud3 + "\n"
				+ soldado4 + " con un nivel de vida de " + salud4 + "\n"
				+ soldado5 + " con un nivel de vida de " + salud5 + "\n");
	}
}


