package br.com.l2q3.fatorial;

public class Main {

	public static void main(String[] args) {
		
		Iterativo iterativo = new Iterativo();
		iterativo.iterativo(4);
		
		Recursivo recursivo = new Recursivo();
		System.out.printf("O fatorial e: " + recursivo.recursivo(5));
	}
}