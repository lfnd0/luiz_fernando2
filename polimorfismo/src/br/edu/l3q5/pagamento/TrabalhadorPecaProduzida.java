package br.edu.l3q5.pagamento;

public class TrabalhadorPecaProduzida extends Empregado {
	
	private double remuneracao;
	private int quantidadeProducao;
	
	public TrabalhadorPecaProduzida() {
	}
	
	public TrabalhadorPecaProduzida(String nome, double remuneracao, int quantidadeProducao) {
		super(nome);
		this.remuneracao = remuneracao;
		this.quantidadeProducao = quantidadeProducao;
	}
	
	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public int getQuantidadeProducao() {
		return quantidadeProducao;
	}

	public void setQuantidadeProducao(int quantidadeProducao) {
		this.quantidadeProducao = quantidadeProducao;
	}
	
	@Override
	public double calcularGanho() {
		return getRemuneracao() * getQuantidadeProducao();
	}
	
	public String toString() {
		return "O trabalhador por peça produzida " + getNome() + " recebe um salário de: R$ " + String.format("%.2f", calcularGanho()); 
	}
}