package br.edu.l3q1.empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Luiz Fernando", "Gerente", "email@e-mail.com", "pass", 123456);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu E-mail: ");
		String email = scanner.nextLine();
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();
		System.out.println(funcionario.fazerLogin(email, senha));

		System.out.print("Digite seu Registro unico: ");
		int registroUnico = scanner.nextInt();
		System.out.print("Digite sua senha: ");
		senha = scanner.next();
		System.out.println(funcionario.fazerLogin(registroUnico, senha));
		scanner.close();
	}
}