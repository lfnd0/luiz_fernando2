package br.edu.l2q3.fatorial;

public class Recursivo implements Fatorial {

	@Override
	public int calcular(int fat) {
		if (fat <= 1) {
			return 1;
		} else {
			return calcular(fat - 1) * fat;
		}
	}
}