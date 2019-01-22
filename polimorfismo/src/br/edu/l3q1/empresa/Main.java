package br.edu.l3q1.empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("example@email.com", "pass00", 11235);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu E-mail: ");
		String email = scanner.nextLine();
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();
		System.out.println(funcionario.fazerLogin(email, senha));
		
		scanner.close();
	}
}