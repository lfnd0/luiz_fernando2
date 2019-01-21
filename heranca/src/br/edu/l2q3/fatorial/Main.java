package br.edu.l2q3.fatorial;

public class Main {

	public static void main(String[] args) {
		
		Iterativo iterativo = new Iterativo();
		System.out.println("O fatorial e: " + iterativo.calcular(4));
		
		Recursivo recursivo = new Recursivo();
		System.out.printf("O fatorial e: " + recursivo.calcular(5));
	}
}