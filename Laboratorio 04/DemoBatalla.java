// Laboratorio Nro 04 - Ejercicio01
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 1 hora con 20 minutos

import java.util.*;
public class DemoBatalla {
	public static void main(String [] args){
		Nave [] misNaves = new Nave[5];
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

		//leer un nombre
		//mostrar los datos de la nave con dicho nombre, mensaje de “no encontrado” en caso contrario
		int pos=busquedaLinealNombre(misNaves,ingresarNave());
		ordenarPorPuntosBurbuja(misNaves);
		mostrarNaves(misNaves);
		ordenarPorNombreBurbuja(misNaves);
		mostrarNaves(misNaves);
		
		//mostrar los datos de la nave con dicho nombre, mensaje de “no encontrado” en caso contrario
		pos=busquedaBinariaNombre(misNaves,ingresarNave());
		ordenarPorPuntosSeleccion(misNaves);
		mostrarNaves(misNaves);
		ordenarPorNombreSeleccion(misNaves);
		mostrarNaves(misNaves);
		ordenarPorPuntosInsercion(misNaves);
		mostrarNaves(misNaves);
		ordenarPorNombreInsercion(misNaves);
		mostrarNaves(misNaves);
	}
	
	public static String ingresarNave() {
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.print("Ingrese el nombre a buscar: ");
		nombre = sc.next();
		return nombre;
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
	///////////////////////////////
	
	//Método para buscar la primera nave con un nombre que se pidió por teclado
	public static int busquedaLinealNombre(Nave[] flota, String s){
		System.out.println("Busqueda linea por nombre");
		for(int i=0;i<flota.length;i++) {
			if(flota[i].getNombre().equals(s)) {
				System.out.println("La nave es: "+flota[i].getNombre());
				return i;
			}
		}
		System.out.println("No se encontro la nave");
		return 0;
	}
	//Método que ordena por número de puntos de menor a mayor
	public static void ordenarPorPuntosBurbuja(Nave[] flota){
		System.out.println("Ordenamiento burbuja por puntos");
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			for(int j=0;j<flota.length;j++) {
				if(flota[j].getPuntos()>flota[j+1].getPuntos()) {
					temp = flota[i];
					flota[i] = flota[j];
					flota[j] = temp;
				}
			}
		}
	}
	//Método que ordena por nombre de A a Z
	public static void ordenarPorNombreBurbuja(Nave[] flota){
		System.out.println("Ordenamiento burbuja por nombres");
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			for(int j=0;j<flota.length;j++) {
				if(flota[j].getNombre().compareTo(flota[j+1].getNombre()) > 0) {
					temp = flota[j];
					flota[i] = flota[j];
					flota[j] = temp;
				}
			}
		}
	}
	//Método para buscar la primera nave con un nombre que se pidió por teclado
	public static int busquedaBinariaNombre(Nave[] flota, String s){
		System.out.println("Busqueda binaria por nombre");
		int min = 0;
		int max = flota.length-1;
		int centro=0;
		
		while(min < max) {
			
			centro = (min+max)/2;
			if(flota[centro].getNombre().equals(s)) {
				System.out.println("La posicion del nombre es: "+centro);
				return centro;
			}
			else {
				if(flota[centro].getNombre().compareTo(s) > 0 ) {
					max = centro;
				}
				else {
					min = centro;
				}
			}
		}
		System.out.println("No se encontro el nombre");
		return 0;
	}
	//Método que ordena por número de puntos de menor a mayor
	public static void ordenarPorPuntosSeleccion(Nave[] flota){
		System.out.println("Ordenamiento por puntos con seleccion");
		int min;
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			min = i;
			for(int j=i+1;j<flota.length;j++) {
				if(flota[j].getPuntos() < flota[min].getPuntos()) {
					min = j;
				}
			}
			temp = flota[i];
			flota[i] = flota[min];
			flota[min] = temp;
		}
	}
	//Método que ordena por nombre de A a Z
	public static void ordenarPorNombreSeleccion(Nave[] flota){
		System.out.println("Ordenamiento por nombres con seleccion");
		int min;
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			min = i;
			for(int j=i+1;j<flota.length;j++) {
				if(flota[j].getNombre().compareTo(flota[min].getNombre()) < 0) {
					min = j;
				}
			}
			temp = flota[i];
			flota[i] = flota[min];
			flota[min] = temp;
		}
	}
	//Método que muestra las naves ordenadas por número de puntos de mayor a menor
	public static void ordenarPorPuntosInsercion(Nave[] flota){
		System.out.println("Ordenamiento por puntos con insercion");
		int pos;
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			pos = i;
			temp = flota[i];
			while((pos>0) && (flota[pos-1].getPuntos()>temp.getPuntos())) {
				flota[pos] = flota[pos-1];
				pos--;
			}
			flota[pos] = temp;
		}
	}
	//Método que muestra las naves ordenadas por nombre de Z a A
	public static void ordenarPorNombreInsercion(Nave[] flota){
		System.out.println("Ordenamiento por nombres con insercion");
		int pos;
		Nave temp;
		for(int i=0;i<flota.length;i++) {
			pos = i;
			temp = flota[i];
			while((pos>0) && (flota[pos-1].getNombre().compareTo(temp.getNombre()) > 0)) {	
				flota[pos] = flota[pos-1];
				pos--;
			}
			flota[pos] = temp;
		}
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