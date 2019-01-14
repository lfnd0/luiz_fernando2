package br.com.l2q2.empregado;

public class Vendedor extends Empregado {

	private float percentualComissao;

	public Vendedor(String nome, float salario, float percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
	}

	public float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public float calcularSalario() {
		return this.salario + (salario * (percentualComissao / 100));
	}

	public String toString() {
		return "O vendedor " + getNome() + " recebe " + salario + " com salario final de " + calcularSalario() + "R$"
				+ " e comissao de " + percentualComissao + "%.";
	}
}
