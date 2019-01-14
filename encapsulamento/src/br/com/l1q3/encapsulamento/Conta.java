package br.com.l1q3.encapsulamento;

public class Conta {

	private int numeroConta;
	private float saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void depositar(int validarConta, float valor) {
		if (validarConta == this.numeroConta) {
			this.saldo += valor;
			System.out.printf("Deposito de: %.2f R$ na conta: %s, realizado com sucesso.%n", valor, numeroConta);
		} else {
			System.out.printf("Deposito invalido! Conta: %s, valor: %.2f R$.%n", validarConta, valor);
		}
	}

	public void sacar(int validarConta, float valor) {
		if (validarConta == this.numeroConta && valor <= this.saldo) {
			this.saldo -= valor;
			System.out.printf("Saque de: %.2f R$ na conta: %s, realizado com sucesso.%n", valor, numeroConta);
		} else {
			System.out.printf("Saque invalido! Conta: %s, valor: %.2f R$.%n", validarConta, valor);
		}
	}
}