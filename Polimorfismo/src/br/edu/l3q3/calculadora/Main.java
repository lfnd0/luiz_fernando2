package br.edu.l3q3.calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Float> numeros = new ArrayList<Float>();

		Adicao soma  = new Adicao();
		Subtracao subtracao = new Subtracao();
		Multiplicacao mult = new Multiplicacao();
		Divisao divisao = new Divisao();
		
		float numero;
		
		do {
			numero = scanner.nextFloat();
			
			if(numero != 0) {
				numeros.add(numero);
			}
			
		}while(numero != 0);
		
		if (numeros.size() == 2) {
			System.out.println("Soma: " + soma.calcular(numeros.get(0), numeros.get(1)));
			System.out.println("Subtracao: " + subtracao.calcular(numeros.get(0), numeros.get(1)));
			System.out.println("Multiplicacao: " + mult.calcular(numeros.get(0), numeros.get(1)));
			System.out.println("Divisao: " + divisao.calcular(numeros.get(0), numeros.get(1)));

		
		}else {
			System.out.println("Soma: " + soma.calcular(numeros));
			System.out.println("Subtracao: " + subtracao.calcular(numeros));
			System.out.println("Multiplicacao: " + mult.calcular(numeros));
			System.out.println("Divisao: " + divisao.calcular(numeros));

		}
		scanner.close();
	}

}