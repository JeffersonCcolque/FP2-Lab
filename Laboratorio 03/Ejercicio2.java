// Laboratorio Nro 03 - Ejercicio2
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 9 min

import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int vida;
		
		Soldado[] misSoldados = new Soldado[5];
		for (int i=0; i<misSoldados.length;i++) {
			System.out.print("Ingrese el nombre del soldado: ");
			nombre = sc.next();
			System.out.print("Ingrese el nivel de vida del soldado: ");
			vida = sc.nextInt();
			
			misSoldados[i] = new Soldado();
			
			misSoldados[i].setNombre(nombre);
			misSoldados[i].setVida(vida);
		}
		System.out.println("Los soldados ingresados son:");
		for(int i=0;i<misSoldados.length;i++) {
			System.out.println(misSoldados[i].getNombre()+" con una salud de " + misSoldados[i].getVida());
		}
	}
}
