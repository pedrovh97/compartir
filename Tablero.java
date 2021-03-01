package Juego;

//Pedro Vivar 

import java.util.Random;

public class Tablero {

	//objeto
	private int filas;
	private int columnas;
	private Casilla [][] casillas; 
	
	
	//Constructores del objeto
	public Tablero(){ }
	
	
	public Tablero(int filas, int columnas){
		this.filas = filas;
		this.columnas = columnas;
	}
		
	
	//Métodos del objeto		
	public int getFilas() {
		return filas;
	}
		
	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}


	public Casilla[][] getCasillas() {
		return casillas;
	}


	public void setCasillas(Casilla[][] casillas) {
		this.casillas = casillas;
	}
	
	public void rellenarTablero() {
		casillas = new Casilla [columnas][filas];
		for (int columna = 0; columnas < columnas; columnas++) {
			for (int fila = 0; fila < filas; fila++) {
				casillas[columna][filas] = new Casilla(Casilla.Valor.TIERRA,Casilla.Estado.TAPADA,"?");
			}
		}
	}
	
	public void insertarMinas(int cantidadMinas){
		int filaAzar,columnaAzar;
		Random aleatorio = new Random();
		
		for (int i = 0; i < cantidadMinas; i++) {
			filaAzar = aleatorio.nextInt(filas);
			columnaAzar = aleatorio.nextInt(columnas);
			Casilla casillaMina = casillas[columnaAzar][filaAzar];
			
			if (casillaMina.getValor()!= Casilla.Valor.MINA) {
				casillaMina.setValor(Casilla.Valor.MINA);
				casillaMina.setDibujo("X");				
			}else {
				i--;
			}
		}
	}
	
	public void mostrarTablero() {
		for (int columna = 0; columna < columnas; columna++) {
			for (int fila = 0; fila < filas; fila++) {
				System.out.println("["+ casillas[columna][fila].getDibujo()+ "]");
			}
			System.out.println(" ");
		}
	}

	
}
