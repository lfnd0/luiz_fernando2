package br.edu.l1q3.conta;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setNumeroConta(900);
		conta.depositar(9001, 10.99f);
		conta.sacar(9001, 11.99f);
		
		System.out.printf("Nº da conta: %s.%n", conta.getNumeroConta());
		System.out.printf("Saldo da conta: %s R$.%n", conta.getSaldo());
	}
}