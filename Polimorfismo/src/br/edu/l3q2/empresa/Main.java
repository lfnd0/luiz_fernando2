package br.edu.l3q2.empresa;

import java.util.Scanner;

import br.edu.l3q1.empresa.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Funcionario gerente = new Gerente("Luiz", "Gerente", "email@email.com", "pass1", 1234);
		Funcionario atendente = new Atendente("Fernado", "Atendente", "email@email.com", "pass2", 123456);
		
		System.out.print("Digite seu E-mail: ");
		String email = scanner.nextLine();
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();
		System.out.println(gerente.fazerLogin(email, senha));
		System.out.println(gerente.getFuncao());
		
		System.out.print("Digite seu Registro unico: ");
		int registroUnico = scanner.nextInt();
		System.out.print("Digite sua senha: ");
		senha = scanner.next();
		System.out.println(atendente.fazerLogin(registroUnico, senha));
		System.out.println(atendente.getFuncao());
		scanner.close();
	}
}