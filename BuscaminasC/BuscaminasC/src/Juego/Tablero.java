package Juego;

import java.util.Random;

import Juego.Casilla.Valor;

public class Tablero {

	//Atributos del objeto
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


	public Casilla [][] getCasillas() {
		return casillas;
	}


	public void setCasillas(Casilla [][] casillas) {
		this.casillas = casillas;
	}
	
	public void rellenarTablero() {
		
		casillas = new Casilla [columnas][filas]; 
			
		for (int columna = 0; columna < columnas; columna++) {
			for (int fila = 0; fila < filas; fila++) {				
				casillas[columna][fila] = new Casilla(Casilla.Valor.TIERRA, Casilla.Estado.TAPADA, "?");				
			}
		}	
	}
	
	public void mostrarTablero() {
		
		for (int columna = 0; columna < columnas; columna++) {
			for (int fila = 0; fila < filas; fila++) {				
				System.out.print("[" + casillas[columna][fila].getDibujo() + "]");
			}
			System.out.println();
		}	
		
	}

	public void insertarMinas(int minas) {
		
		Random random = new Random();
				
		for (int mina = 1; mina <= minas; mina++) {
			int columnaAleatoria = random.nextInt(columnas);
			int filaAleatoria = random.nextInt(filas);
			
			Casilla casilla = casillas[columnaAleatoria][filaAleatoria];
			
			if(casilla.getValor() != Valor.MINA) {
				casilla.setValor(Valor.MINA);
			}else {
				mina--;
			}			
		}		
	}
	
	
	public boolean comprobarCasilla(int filaElegida, int columnaElegida){
			
		Casilla casillaElegida = casillas[filaElegida][columnaElegida];
		
		if(casillaElegida.getValor() == Casilla.Valor.MINA) {			
			System.out.println("Boom!");
			return true;
		}else {
			
			//La diferencia de int con Integer es que este último, a parte de funcionar
			//como un tipo int, contiene métodos para convertirlo por ejemplo, en un string,
			//algo que int no permite.			
			Integer minasCercanas = comprobarMinasCercanas(filaElegida, columnaElegida);
			casillaElegida.setDibujo(minasCercanas.toString());			
			
			return false;
		}
		
	}
	
	public Integer comprobarMinasCercanas(int filaCasilla, int columnaCasilla) {
		
		Integer minasCercanas = 0;
		
		//TODO: Comprobar las casillas adyacentes de la seleccionada, teniendo en cuenta los límites del tablero
		
		return minasCercanas;
	}

	
}
