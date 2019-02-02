package br.edu.l2q3.fatorial;

public class Iterativo implements Fatorial {
	
	int num = 1;

	@Override
	public int calcular(int fat) {
		for(int i=1; i<= fat; i++) {
			num *= i;
		}
		return num;
	}	
}