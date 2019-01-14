package br.com.l2q3.fatorial;

public class Iterativo implements Fatorial {

	int n = 1;

	@Override
	public void iterativo(int fat) {
		for (int i = 1; i <= fat; i++) {
			n *= i;
		}
		System.out.printf("O fatorial e: %s%n", n);
	}

	@Override
	public int recursivo(int fat) {
		return 0;
	}
}