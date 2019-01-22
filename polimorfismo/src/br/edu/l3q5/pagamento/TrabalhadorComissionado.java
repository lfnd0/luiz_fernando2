package br.edu.l3q5.pagamento;

public class TrabalhadorComissionado extends Empregado {
	
	private double salario;
	private double comissao;
	private int quantidadeVendas;
	
	public TrabalhadorComissionado() {
	}
	
	public TrabalhadorComissionado(String nome, double salario, double comissao, int quantidadeVendas) {
		super(nome);
		this.salario = salario;
		this.comissao = comissao;
		this.quantidadeVendas = quantidadeVendas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}

	@Override
	public double calcularGanho() {
		return getSalario() + (getComissao() * getQuantidadeVendas());
	}
	
	public String toString() {
		return "O trabalhador comissionado " + getNome() + " recebe um salário de: R$ " + String.format("%.2f", calcularGanho()); 
	}
}