package Juego;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Tablero tablero = new Tablero(5, 5);		
		
		tablero.rellenarTablero();
		
		tablero.insertarMinas(5);
		
		tablero.mostrarTablero();
		
		
		System.out.println("--------------------------");
		System.out.println("--------BUSCAMINAS--------");
		System.out.println("--------------------------");

		Scanner teclado = new Scanner(System.in);
		int columnaElegida, filaElegida;
		
		boolean finPartida = false;
		
		while(finPartida == false) {
			
			System.out.println("Selecciona una casilla");
			System.out.println("Fila: ");
			filaElegida = teclado.nextInt();
			
			System.out.println("Columna: ");
			columnaElegida = teclado.nextInt();
			
			finPartida = tablero.comprobarCasilla(filaElegida, columnaElegida);
			
			tablero.mostrarTablero();
			
		}	
		
	}

}
