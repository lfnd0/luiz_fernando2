package br.edu.l3q5.pagamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		String nome;
		double salario;

		System.out.println("Dados do chefe: ");
		System.out.print("Nome: ");
		nome = scanner.next();
		System.out.print("Salario: ");
		salario = scanner.nextDouble();
		Chefe chefe = new Chefe(nome, salario);
		System.out.println(chefe);
		
		System.out.println("Dados do trabalhador comissionado: ");
		System.out.print("Nome: ");
		nome = scanner.next();
		System.out.print("Salario: ");
		salario = scanner.nextDouble();
		System.out.print("Comissao: ");
		double comissao = scanner.nextDouble();
		System.out.print("Quantidade de vendas: ");
		int quantidadeVendas = scanner.nextInt();
		TrabalhadorComissionado trabalhadorComissionado = new TrabalhadorComissionado(nome, salario, comissao,
				quantidadeVendas);
		System.out.println(trabalhadorComissionado);
		
		System.out.println("Dados do trabalhador por peca produzida: ");
		System.out.print("Nome: ");
		nome = scanner.next();
		System.out.print("Remuneracao: ");
		double remuneracao = scanner.nextDouble();
		System.out.print("Quantidade de pecas produzidas: ");
		int quantidadeProducao = scanner.nextInt();
		TrabalhadorPecaProduzida trabalhadorPecaProduzida = new TrabalhadorPecaProduzida(nome, remuneracao,
				quantidadeProducao);
		System.out.println(trabalhadorPecaProduzida);
		
		System.out.println("Dados do trabalhador por peca produzida: ");
		System.out.print("Nome: ");
		nome = scanner.next();
		System.out.print("Salario por hora: ");
		salario = scanner.nextDouble();
		System.out.println("Quantidade de horas trabalhadas: ");
		int quantidadeHora = scanner.nextInt();
		TrabalhadorHora trabalhadorHora = new TrabalhadorHora(nome, salario, quantidadeHora);
		System.out.println(trabalhadorHora);
		
		scanner.close();
	}
}