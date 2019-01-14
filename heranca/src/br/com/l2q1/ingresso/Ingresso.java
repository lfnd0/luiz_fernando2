package br.com.l2q1.ingresso;

public class Ingresso {
	
	private float valor;

	public Ingresso(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "O valor do ingresso e: " + valor;
	}
}