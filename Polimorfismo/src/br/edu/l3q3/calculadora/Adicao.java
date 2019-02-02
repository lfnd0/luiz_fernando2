package br.edu.l3q3.calculadora;

import java.util.List;

public class Adicao extends Operacao{
	
	@Override
	public float calcular(float num1, float num2) {
		return num1 + num2; 
	}
	
	@Override
	public float calcular(List<Float> numeros) {
		float sum = numeros.get(0); 
		for (int index = 1; index < numeros.size(); index ++) {
			sum += numeros.get(index); 
		}
		
		return sum; 
	}
}
