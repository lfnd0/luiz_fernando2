package br.edu.l3q5.pagamento;

public abstract class Empregado {

	String nome;
	private String cpf;
	private String rg;

	public Empregado() {
	}
	
	public Empregado(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public abstract double calcularGanho();
}