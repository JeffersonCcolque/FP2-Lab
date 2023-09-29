// Laboratorio Nro 03 - Ejercicio01
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 1 hora con 30 minutos

import java.util.*;
public class DemoBatalla {
	public static void main(String [] args){
		Nave [] misNaves = new Nave[10];
		Scanner sc = new Scanner(System.in);
		String nomb, col;
		int fil, punt;
		boolean est;
		
		for (int i=0;i<misNaves.length;i++) {
			System.out.println("Nave " + (i+1));
			System.out.print("Nombre: ");
			nomb = sc.next();
			System.out.print("Fila: ");
			fil = sc.nextInt();
			System.out.print("Columna: ");
			col = sc.next();
			System.out.print("Estado: ");
			est = sc.nextBoolean();
			System.out.print("Puntos: ");
			punt = sc.nextInt();
			
			misNaves[i] = new Nave(); 
			
			misNaves[i].setNombre(nomb);
			misNaves[i].setFila(fil);
			misNaves[i].setColumna(col);
			misNaves[i].setEstado(est);
			misNaves[i].setPuntos(punt);
			misNaves[i].setOrden(i+1);
		}
		System.out.println("\nNaves creadas:");
		mostrarNaves(misNaves);
		mostrarPorNombre(misNaves);
		mostrarPorPuntos(misNaves);
		Nave navemayor = mostrarMayorPuntos(misNaves);
		System.out.println("\nNave con mayor número de puntos: Nave "+navemayor.getOrden()+"-"
					+navemayor.getNombre()+" con "+navemayor.getPuntos());
		desordenarNaves(misNaves);
		System.out.println("\nEl nuevo orden es:");
		mostrarNaves(misNaves);
	}
	public static void mostrarNaves(Nave [] flota){
		for (int i=0;i<flota.length;i++) {
			System.out.println("nave "+flota[i].getOrden()+": "+flota[i].getNombre());
		}
	}
	public static void mostrarPorNombre(Nave [] flota){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre a buscar: ");
		String nombre = sc.next();
		for(int i=0;i<flota.length;i++) {
			if(nombre.equals(flota[i].getNombre())) {
				System.out.println(("nave "+(i+1))+": "+flota[i].getNombre());
			}
		}
	}
	public static void mostrarPorPuntos(Nave [] flota){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el punto referencial: ");
		int puntos = sc.nextInt();
		for(int i=0;i<flota.length;i++) {
			if(puntos>=flota[i].getPuntos()) {
				System.out.println(("nave "+(i+1))+": "+flota[i].getPuntos());
			}
		}
	}
	public static Nave mostrarMayorPuntos(Nave [] flota){
		int mayor = flota[0].getPuntos();
		Nave navemayor = flota[0];
		for(int i=1;i<flota.length;i++) {
			if(mayor<flota[i].getPuntos()) {
				mayor = flota[i].getPuntos();
				navemayor = flota[i];
			}
		}
		return navemayor;
	}
	public static Nave[] desordenarNaves(Nave[] flota) {
		int rand;
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			temp = flota[i];
			rand = (int)(Math.random()*flota.length);
			if(rand==i) 
				i--;
			else {
				flota[i]=flota[rand];
				flota[rand]=temp;
			}
		}
		return flota;
	}

}

///////////////////////////////////////////////////////////////////