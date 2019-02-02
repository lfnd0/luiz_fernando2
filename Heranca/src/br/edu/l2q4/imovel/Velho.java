package br.edu.l2q4.imovel;

public class Velho extends Imovel {

	private float precoDesconto;

	public Velho(String endereco, float preco, float precoDesconto) {
		super(endereco, preco);
		this.precoDesconto = precoDesconto;
	}

	public float getPrecoDesconto() {
		this.precoDesconto = getPreco() - precoDesconto;
		return precoDesconto;
	}

	public String toString() {
		return "Endereco: " + getEndereco() + ". Valor do imóvel velho: " + getPrecoDesconto();
	}

}