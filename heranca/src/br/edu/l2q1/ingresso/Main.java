package br.edu.l2q1.ingresso;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do ingresso: ");
		float valor = scanner.nextFloat();
		Ingresso ingresso = new Ingresso(valor);
		
		System.out.print("Digite o valor adicional do ingresso VIP: ");
		float valorAdicional = scanner.nextFloat();
		IngressoVIP ingressoVIP = new IngressoVIP(valor, valorAdicional);
		
		System.out.println(ingresso);
		System.out.println(ingressoVIP);
		
		scanner.close();
	}
}