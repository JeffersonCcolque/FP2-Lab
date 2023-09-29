// Laboratorio Nro 01 - Ejercicio1
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 2 min

import java.util.*;
public class Actividad_1 {
	public static void main(String[] args) {
		
		String soldado1, soldado2, soldado3, soldado4, soldado5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de 5 soldados: ");
		soldado1 = sc.next();
		soldado2 = sc.next();
		soldado3 = sc.next();
		soldado4 = sc.next();
		soldado5 = sc.next();
		
		System.out.println("Los soldados ingresados son: \n"
				+ soldado1 + "\n"
				+ soldado2 + "\n"
				+ soldado3 + "\n"
				+ soldado4 + "\n"
				+ soldado5 );
		
	}
}


