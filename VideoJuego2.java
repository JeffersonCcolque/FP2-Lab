// Laboratorio Nro 05 - Videojuego2
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 2 hora con 15 minutos

import java.util.*;
public class VideoJuego2 {
	public static void main(String[] args) {
		
		String[][] tablero = new String[10][10];
		Soldado[] ejercito = new Soldado[aleatorioEjercito()];
		
		crearEjercitos(ejercito);
		posicionarSoldados(tablero, ejercito);
		mostrartablero(tablero);
		
		Soldado mayor = mayorvidaSoldado(ejercito);
		System.out.println("\nSoldando con mayor vida:");
		mostrarDatos(mayor);
		vidaEjercito(ejercito);
		mostrarSoldados(ejercito);
		rankSoldadosBurbuja(ejercito);
		rankSoldadosSeleccion(ejercito);
		
	}
	public static int aleatorioEjercito() {
		int aleatorio = (int) (Math.random()*10+1);
		return aleatorio;
	}
	public static int aleatorio() {
		int aleatorio = (int) (Math.random()*10);
		return aleatorio;
	}

	public static Soldado[] crearEjercitos(Soldado[] lista) {
		String nombre;
		for(int i=0; i<lista.length;i++) {
			nombre=("soldado"+i);
			lista[i] = new Soldado();
			lista[i].setNombre(nombre);
			lista[i].setVida((int) (Math.random()*5)+1);
		}
		return lista;
	}
	public static void posicionarSoldados(String[][] tabla, Soldado[] lista) {
		int fil,col;
		for(int i=0;i<lista.length;i++) {
			lista[i].setFila(aleatorio());
			lista[i].setColumna(aleatorio());
			fil = lista[i].getFila();
			col = lista[i].getColumna();
			if(tabla[fil][col] == null) {
				tabla[fil][col] = lista[i].getNombre();
				lista[i].setColumnachar(col);
			}
			else {
				i--;
			}
		}
		for(int j=0;j<lista.length;j++) {
			tabla[lista[j].getFila()][lista[j].getColumna()] = lista[j].getNombre();
		}
	}
	public static void mostrartablero(String[][] table) {
		char[] columna = {'A','B','C','D','E','F','G','H','I','J'};
		
		for(int i=0;i<table.length;i++) {
			if(i==0) {
				System.out.print("\t|");
				for(int k=0;k<columna.length;k++){
					System.out.print(" ______"+columna[k]+"______\t|");
				}
				System.out.println();
			}
			System.out.print("    "+(i+1)+"\t|");
			for(int j=0;j<table[i].length;j++) {
				if(table[i][j] == null) {			
					System.out.print(" _____________\t|");
				}
				else {
					System.out.print(" ___"+table[i][j]+"__\t|");
				}
			}
			System.out.println();
		}
	}
	public static void mostrarDatos(Soldado s) {
		System.out.println("Nombre: "+s.getNombre());
		System.out.println("Vida: "+s.getVida());
		System.out.println("Fila: "+(s.getFila()+1));
		System.out.println("Columna: "+s.getColumnachar());
	}
	public static void mostrarNombreVida(Soldado s) {
		System.out.println("Nombre: "+s.getNombre());
		System.out.println("Vida: "+s.getVida());
	}
	public static Soldado mayorvidaSoldado(Soldado[] lista) {
		Soldado mayor =lista[0];
		for(int i=1;i<lista.length;i++) {
			if(mayor.getVida()<lista[i].getVida())
				mayor = lista[i];
		}
		return mayor;
	}
	public static void vidaEjercito(Soldado[] lista) {
		int vidatotal=0;
		for(int i=0;i<lista.length;i++) {
			vidatotal = vidatotal+lista[i].getVida();
		}
		double promedio = (double)vidatotal/lista.length;
		System.out.println("\nEl promedio de vida del ejercito es: "+promedio);
		System.out.println("El nivel de vida de todo el ejercito es: "+vidatotal);
	}
	public static void mostrarSoldados(Soldado[] lista) {
		System.out.println("\nLISTA SOLDADOS:");
		for(int i=0;i<lista.length;i++) {
			mostrarDatos(lista[i]);
		}
	}
	public static void rankSoldadosBurbuja(Soldado[] lista) {
		System.out.println("\nOrdenamiento burbuja por vida");
		Soldado temp;	
		for(int i=1;i<lista.length;i++) {
			for(int j=0;j<lista.length-1;j++) {
				if(lista[j].getVida()>lista[j+1].getVida()) {
					temp = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = temp;
				}
			}
		}
		for(int k=lista.length-1;k>=0;k--) {
			System.out.println("Nombre: "+lista[k].getNombre());
			System.out.println("Vida: "+lista[k].getVida());
		}
	}
	public static void rankSoldadosSeleccion(Soldado[] lista) {
		System.out.println("\nOrdenamiento por vida con seleccion");
		int min;
		Soldado temp;
		for(int i=0;i<lista.length;i++) {
			min = i;
			for(int j=i+1;j<lista.length;j++) {
				if(lista[j].getVida() < lista[min].getVida()) {
					min = j;
				}
			}
			temp = lista[i];
			lista[i] = lista[min];
			lista[min] = temp;
		}
		for(int k=lista.length-1;k>=0;k--) {
			System.out.println("Nombre: "+lista[k].getNombre());
			System.out.println("Vida: "+lista[k].getVida());
		}
	}
}
