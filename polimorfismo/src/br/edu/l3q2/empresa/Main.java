package br.com.l3q2.empresa;

public class Main {

	public static void main(String[] args) {
		
		Atendente atendente = new Atendente("LFS", "a.e2@email.com", 1001001, "wasd");
		Gerente gerente = new Gerente("SFL", "g.e2@email.com", 001100, "wasd");
		
		System.out.println("Acesso: " + atendente.fazerLogin("a.e2@email.com", "wasd"));
		System.out.println(atendente.getFuncao());
		
		System.out.println("Acesso: " + gerente.fazerLogin(001100, "wasd"));
		System.out.println(gerente.getFuncao());
	}

}