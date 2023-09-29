// Laboratorio Nro 03 - Ejercicio3
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo:  21 min

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Soldados[] ejercito1 = new Soldados[aleatorio()];
		Soldados[] ejercito2 = new Soldados[aleatorio()];
		crearEjercitos(ejercito1);
		crearEjercitos(ejercito2);
		
		System.out.println("El ejercito 1 cuenta con "+ejercito1.length+", estando: ");
		mostrarEjercito(ejercito1);
		System.out.println();
		System.out.println("El ejercito 2 cuenta con "+ejercito2.length+", estando: ");
		mostrarEjercito(ejercito2);
		
		ejercitoGanador(ejercito1, ejercito2);
		
	}
	public static int aleatorio() {
		int aleatorio = (int) (Math.random()*5)+1;
		return aleatorio;
	}
	public static Soldados[] crearEjercitos(Soldados[] lista) {
		String nombre;
		for(int i=0; i<lista.length;i++) {
			nombre=("soldado"+i);
			lista[i] = new Soldados();
			lista[i].setNombre(nombre);
		}
		return lista;
	}
	public static void mostrarEjercito(Soldados[] lista) {
		for(int i=0; i<lista.length;i++) {
			System.out.println(lista[i].getNombre());
		}
	}
	public static Soldados[] ejercitoGanador(Soldados[] lista1, Soldados[] lista2) {
		if(lista1.length>lista2.length) {
			System.out.println("\nGano el ejercito 1");
			return lista1;
		}
		else {
			if(lista1.length<lista2.length) {
				System.out.println("\nGano el ejercito 2");
				return lista2;
			}
			else {
				System.out.println("\nHubo un empate");
				return null;
			}
		}
	}
}
