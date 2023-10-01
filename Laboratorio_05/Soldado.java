
///////////////////////////////////////////

public class Soldado {
	
	String nombre;
	int vida;
	int fila;
	int columna;
	char columnachar;
	
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	public void setVida(int v) {
		this.vida = v;
	}
	public void setFila(int f) {
		this.fila = f;
	}
	public void setColumna(int c) {
		this.columna = c;
	}
	public void setColumnachar(int c) {
		char[] letras = {'A','B','C','D','E','F','G','H','I','J'};
		this.columnachar = letras[c];
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getVida() {
		return this.vida;
	}
	public int getFila() {
		return this.fila;
	}
	public int getColumna() {
		return this.columna;
	}
	public char getColumnachar() {
		return this.columnachar;
	}

}
