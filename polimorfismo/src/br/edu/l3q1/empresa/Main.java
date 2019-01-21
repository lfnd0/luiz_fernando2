package br.edu.l3q1.empresa;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setEmail("f.e@email.com");
		funcionario.setSenha("fe1");
		funcionario.setRegistroUnico(1001001);
		funcionario.setNome("LFS");
		funcionario.setFuncao("atendente");

		System.out.println(funcionario.fazerLogin("f.e@email.com", "fe1"));
		System.out.println("Acesso: " + funcionario.fazerLogin(1001001, "fe1"));
	}
}
