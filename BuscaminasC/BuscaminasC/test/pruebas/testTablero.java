package pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Juego.Casilla;
import Juego.Tablero;

class testTablero {

	@Test
	@DisplayName("Comprueba el método getFilas()")
	void testGetFilas() {
		Tablero tablero = new Tablero(10, 20);
		int actual, esperado;
		
		actual = tablero.getFilas();
		esperado = 10;
		assertEquals(esperado, actual);
	}
	
	
	@Test
	@DisplayName("Comprueba el método setFilas()")
	void testSetFilas() {
		Tablero tablero = new Tablero(33, 20);
		int actual, esperado;
		
		tablero.setFilas(15);		
		actual = tablero.getFilas();		
		esperado = 15;		
		assertEquals(esperado, actual);
		
	}
	
	
	@Test
	@DisplayName("Comprueba el método getColumnas()")
	void testGetColumnas() {
		
		Tablero tablero = new Tablero(40, 30);
		int actual, esperado;
		
		actual = tablero.getColumnas();
		esperado = 30;
		
		assertEquals(esperado, actual);		
	}
	
	
	@Test
	@DisplayName("Comprobar la función rellenarTablero()")
	void testRellenarTablero() {
		
		Tablero tablero = new Tablero(5, 5);
		tablero.rellenarTablero();
		Casilla[][] casillas = tablero.getCasillas();
		
		for (int i = 0; i < tablero.getFilas(); i++) {
			for (int j = 0; j < tablero.getColumnas(); j++) {
				
				assertTrue(casillas[i][j].getEstado() == Casilla.Estado.TAPADA);
				
			}
		}
		
		
	}
	
	@Test
	@DisplayName("Comprueba si el tablero se rellena de minas correctamente")
	void testInsertarMinas() {
		
		Tablero tablero = new Tablero(5, 5);
		tablero.rellenarTablero();
		
		int esperado = 5; //Minas que introducimos al tablero
		int actual = 0; //Contador de las minas		
		
		tablero.insertarMinas(esperado);
		
		int tamTablero = tablero.getFilas() * tablero.getColumnas();
		if(esperado > tamTablero) {
			fail("Demasiadas minas para el tablero");			
		}		
		
		Casilla casillas[][] = tablero.getCasillas();
				
		for (int i = 0; i < tablero.getFilas(); i++) {
			for (int j = 0; j < tablero.getColumnas(); j++) {
				
				if(casillas[i][j].getValor() == Casilla.Valor.MINA) {
					actual++;
				}
			}
		}
		//Comprobar si se introducen correctamente las minas indicadas
		assertEquals(esperado, actual);
		
	}
	
	//TODO: testComprobarCasilla 
		
	@Test
	@DisplayName("Comprueba el método comprobarCasilla(), verificando que una casilla es una mina")
	void testComprobarCasilla() {

		//TODO: 1. Inicializar un tablero de pruebas
		
		
		//TODO: 2. Obtener las casillas del tablero, y manualmente, poner una mina a una casilla

		
		//TODO: 3. Comprobar el método y compararlo con un valor esperado, podemos usar assertTrue
		
		
	}
	
	
	//TODO: testComprobarMinasCercanas
	
	
}
