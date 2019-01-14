package br.com.l2q2.empregado;

public class Gerente extends Empregado {

	private String departamento;

	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String toString() {
		return "O gerente " + getNome() + " atua no departamento " + departamento + " e recebe: " + salario + "R$.";
	}
}
