package br.com.l2q2.empregado;

public class Main {

	public static void main(String[] args) {
		
		Empregado empregado = new Empregado("W", 9.99f);
		Gerente gerente = new Gerente("X", 9.99f, "Y");
		Vendedor vendedor = new Vendedor("Z", 9.99f, 20.0f);
		
		System.out.println(empregado);
		System.out.println(gerente);
		System.out.println(vendedor);
	}
}
