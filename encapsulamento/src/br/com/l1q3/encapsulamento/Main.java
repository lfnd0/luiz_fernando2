package br.com.l1q3.encapsulamento;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setNumeroConta(9001);
		conta.depositar(9001, 10.99f);
		conta.sacar(900, 10.99f);
		
		System.out.printf("Nº da conta: %s.%n", conta.getNumeroConta());
		System.out.printf("Saldo da conta: %s R$.%n", conta.getSaldo());
	}
}