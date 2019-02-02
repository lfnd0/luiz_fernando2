
package br.edu.l2q4.imovel;

public class Novo extends Imovel {

	private float precoAdicional;

	public Novo(String endereco, float preco, float precoAdicional) {
		super(endereco, preco);
		this.precoAdicional = precoAdicional;
	}

	public float getPrecoAdicional() {
		return this.precoAdicional + getPreco();
		
	}
	
	public String toString() {
		return "Endereco: " + getEndereco() + ". Valor do imóvel novo: " + getPrecoAdicional();
	}
}