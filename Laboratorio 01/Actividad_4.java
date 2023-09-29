// Laboratorio Nro 01 - Ejercicio4
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 4 min

import java.util.*;
public class Actividad_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] soldados = new String[5];
		int[] vida = new int[5];
		
		for(int i=0; i<soldados.length;i++) {
			System.out.print("Ingrese el nombre del soldado: ");
			soldados[i] = sc.next();
			System.out.print("Ingrese el nivel de vida del soldado: ");
			vida[i] = sc.nextInt();
		}
		
		System.out.println("Los soldados ingresados son:");
		for(int i=0; i<soldados.length;i++) {
			System.out.println(soldados[i]+" con una salud de " + vida[i]);
		}

	}
}

