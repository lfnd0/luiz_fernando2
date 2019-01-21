package br.edu.l2q4.imovel;

public class Imovel {

	private String endereco;
	private float preco;

	public Imovel(String endereco, float preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}
}
