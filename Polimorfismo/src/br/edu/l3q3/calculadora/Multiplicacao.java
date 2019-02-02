package br.edu.l3q3.calculadora;

import java.util.List;

public class Multiplicacao extends Operacao {
	@Override
	public float calcular(float num1, float num2) {
		return num1 * num2;
	}
	
	@Override
	public float calcular(List<Float> numeros) {
		float valor = numeros.get(0);
		
		for (int index = 0; index < numeros.size(); index ++) {
			valor *= numeros.get(index);
		}
		
		return valor; 
	}
}