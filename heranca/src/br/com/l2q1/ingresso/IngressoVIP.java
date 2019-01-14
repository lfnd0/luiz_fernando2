package br.com.l2q1.ingresso;

public class IngressoVIP extends Ingresso {
	private float valorAdicional;
	
	public IngressoVIP(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public float getValorAdicional() {
		return valorAdicional;
	}
	
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public float getValorTotal() {
		return this.valorAdicional + getValor();
	}
	
	public String toString() {
		
		return "Com o adicional de: " + valorAdicional + ", o valor do ingresso VIP e: " + getValorTotal();
	}
}