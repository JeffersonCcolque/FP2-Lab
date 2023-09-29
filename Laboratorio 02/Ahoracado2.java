// Laboratorio Nro 02 - Ejercicio01
// Autor: Jefferson Adriano Ccolque Quispe
// Tiempo: 1 hora con 30 minutos

import java.util.Scanner;
public class Ahoracado2 {
	public static void main(String []args){
	
		String ahor1 =  "  +---+ 	\n"+
						"  |   | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"========= ";
		
		String ahor2 = 	"  +---+ 	\n"+
						"  |   | 	\n" +
						"  O   | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"========= ";
	
		String ahor3 =  "  +---+	\n"+
						"  |   |	\n" +
						"  O   | 	\n" +
						"  |   | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"========= ";
		
		String ahor4 =  "  +---+ 	\n"+
						"  |   | 	\n" +
						"  O   | 	\n" +
						" /|   | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"========= ";
		
		String ahor5 =  "  +---+ 	\n"+
						"  |   | 	\n" +
						"  O   | 	\n" +
						" /|\\  | 	\n" +
						"      | 	\n" +
						"      | 	\n" +
						"========= ";
		String ahor6 = 	"  +---+ 	\n"+
						"  |   | 	\n" +
						"  O   | 	\n" +
						" /|\\  |	\n" +
						" /    | 	\n" +
						"      | 	\n" +
						"========= ";
		
		String ahor7 = 	"  +---+ 	\n"+
						"  |   | 	\n" +
						"  O   | 	\n" +
						" /|\\  | 	\n" +
						" / \\  | 	\n" +
						"      | 	\n" +
						"========= ";
		String [] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
		int contador=1, turnos=0;
		String letra;
		String [] palabras = {"programacion", "java", "indentacion", "clases", "objetos", "desarrollador", "pruebas"};
		String palSecreta = getPalabraSecreta(palabras);
		System.out.println(figuras[0]);
		
		String [] encontrados = new String[palSecreta.length()];
		rellenarLista(encontrados);
		mostrarBlancos(encontrados);
		
		while(contador <= 6){
			letra = ingreseLetra();
			if (letraEnPalabraSecreta(letra, palSecreta)) {
				mostrarBlancosActualizados(encontrados, letra, palSecreta);
			}
			else {
				System.out.println(figuras[contador]);
				mostrarBlancos(encontrados);
				contador = contador +1;
			}
			turnos++;
			if(comprobar(encontrados, palSecreta)) {
				break;
			}
		}
		if(comprobar(encontrados, palSecreta)) {
			System.out.println("\nGano en "+turnos+" turnos");
		}
		else {
			System.out.println("\nPerdio en "+turnos+" turnos");
		}	
	}
	public static String getPalabraSecreta(String [] lasPalabras){
		String palSecreta;
		int ind;
		int indiceMayor = lasPalabras.length -1;
		int indiceMenor = 0;
		ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
		return lasPalabras[ind];
	}
	public static void mostrarBlancos(String[] lista){
		for (int i=0;i<lista.length;i++) {
			System.out.print(lista[i]+" ");
		}
	}
	public static String ingreseLetra(){
		String[] permitido = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		String laLetra;
		Scanner sc = new Scanner(System.in);
		boolean letra=false;
		do {
			System.out.print("\nIngrese letra: ");
			laLetra = sc.next().toLowerCase();
			for(String i:permitido) {
				if(laLetra.equals(i)) {
					letra = true;
					break;
				}
			}
			if(!letra) {
				System.out.println("INGRESE SOLO LETRAS");
			}
		}
		while(!letra);
		return laLetra;
	}
	public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
		for(int i=0;i<palSecreta.length();i++) {
			if(letra.equals(palSecreta.substring(i,i+1))){
				return true;
			}
		}
		return false;
	}
	public static void mostrarBlancosActualizados(String[] lista, String letra, String palabra){
		for(int i=0;i<lista.length;i++) {
			if(letra.equals(palabra.substring(i, i+1))) {
				lista[i]=letra;
			}
			System.out.print(lista[i]+" ");
		}
	}
	public static boolean comprobar(String[] lista, String palabra) {
		boolean igualdad=false;
		int iguales=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i].equals(palabra.substring(i,i+1))) {
				iguales++;
			}
		}
		if(iguales==lista.length) {
			igualdad=true;
		}
		return igualdad;
	}
	public static void rellenarLista(String[] lista) {
		for (int i=0;i<lista.length;i++) {
			lista[i]="_";
		}
	}
}
