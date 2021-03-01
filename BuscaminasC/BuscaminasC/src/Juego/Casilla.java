package Juego;

public class Casilla {
	
	//Atributos de la clase casilla
	private Valor valor;
	private Estado estado;
	private String dibujo;
	
	public enum Valor { TIERRA, MINA }
	
	public enum Estado { TAPADA, DESCUBIERTA }
	
	
	//Constructores	
	public Casilla(Valor valor, Estado estado, String dibujo) {
		this.setValor(valor);
		this.setEstado(estado);
		this.setDibujo(dibujo);
	}
	
	public Casilla() {
		
	}

	public Valor getValor() {
		return valor;
	}


	public void setValor(Valor valor) {
		this.valor = valor;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public String getDibujo() {
		return dibujo;
	}


	public void setDibujo(String dibujo) {
		this.dibujo = dibujo;
	}

	
}
