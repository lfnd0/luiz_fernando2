package br.edu.l3q5.pagamento;

public class Chefe extends Empregado{
	
	private double salarioMensal;
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public Chefe() {	
	}
	
	public Chefe(String nome, double salarioMensal) {
		super(nome);
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double calcularGanho() {
		return getSalarioMensal();
	}
	
	public String toString() {
		return "O chefe " + getNome() + " recebe um salário de: R$ " + String.format("%.2f", calcularGanho()); 
	}
}
