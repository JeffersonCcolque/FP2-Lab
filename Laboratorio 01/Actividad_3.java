// Laboratorio Nro 01 - Ejercicio3
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 3 min

import java.util.*;
public class Actividad_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] soldados = new String[5];
		
		for(int i=0; i<soldados.length;i++) {
			System.out.print("Ingrese el nombre del soldado: ");
			soldados[i] = sc.next();
		}
		
		System.out.println("Los soldados ingresados son:");
		for(int i=0; i<soldados.length;i++) {
			System.out.println(soldados[i]);
		}

	}
}


