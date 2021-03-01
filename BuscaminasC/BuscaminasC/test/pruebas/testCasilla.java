package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Juego.Casilla;
import Juego.Casilla.Valor;

class testCasilla {
	

	@Test
	@DisplayName("Comprueba el método setValor")
	void testSetValor() {
		
		Casilla casilla = new Casilla();
		
		Valor actual, esperado;
		
		esperado = Valor.TIERRA;
		
		casilla.setValor(Valor.TIERRA);
		actual = casilla.getValor();
		
		assertEquals(esperado, actual);
		
	}
	
	//TODO: GetValor, Set y Get estado, Set y Get dibujo
	
	/*
	@Test
	@DisplayName("Comprueba el método ...")
	void test...() {
		...		
	}
	*/
}
