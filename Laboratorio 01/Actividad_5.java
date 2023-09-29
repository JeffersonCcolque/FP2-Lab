// Laboratorio Nro 01 - Ejercicio5
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 14 min

import java.util.*;
public class Actividad_5 {
	public static void main(String[] args) {
		
		String[] ejercito1 = new String[aleatorio()];
		ejercitos(ejercito1);
		
		String[] ejercito2 = new String[aleatorio()];
		ejercitos(ejercito2);
		
		System.out.println("El ejercito 1 cuenta con "+ejercito1.length+", estando: ");
		mostrarEjercito(ejercito1);
		System.out.println();
		System.out.println("El ejercito 2 cuenta con "+ejercito2.length+", estando: ");
		mostrarEjercito(ejercito2);
		
		if(ejercitoGanador(ejercito1, ejercito2)==ejercito1) {
			System.out.println("Gano el ejercito 1");
		}
		
		if(ejercitoGanador(ejercito1, ejercito2)==ejercito2) {
			System.out.println("Gano el ejercito 2");
		}
		
		if(ejercitoGanador(ejercito1, ejercito2)==null) {
			System.out.println("Hubo un empate");
		}
			
	}
	public static int aleatorio() {
		int aleatorio = (int) (Math.random()*5)+1;
		return aleatorio;
	}
	public static String[] ejercitos(String[] lista) {
		for(int i=0; i<lista.length;i++) {
			lista[i] = ("soldado"+i);
		}
		return lista;
	}
	public static void mostrarEjercito(String[] lista) {
		for(int i=0; i<lista.length;i++) {
			System.out.println(lista[i]);;
		}
	}
	public static String[] ejercitoGanador(String[] lista1, String[] lista2) {
		if(lista1.length>lista2.length)
			return lista1;
		else {
			if(lista1.length<lista2.length)
				return lista2;
			else 
				return null;
		}
	}
}



