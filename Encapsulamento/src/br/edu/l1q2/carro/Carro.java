package br.edu.l1q2.carro;

public class Carro {
	private String marca;
	private String cor;
	private String ano;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public Carro(String marca, String cor, String ano) {
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
	}
}
