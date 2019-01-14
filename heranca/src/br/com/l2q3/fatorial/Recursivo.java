package br.com.l2q3.fatorial;

public class Recursivo implements Fatorial {
	
	int n = 1;

	@Override
	public int recursivo(int fat) {
		if (fat <= 1) {
			return 1;
		} else {
			return recursivo(fat - 1) * fat;
		}
	}

	@Override
	public void iterativo(int fat) {
	}

}