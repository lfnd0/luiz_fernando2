package br.edu.l3q3.calculadora;

import java.util.List;

public abstract class Operacao {
	public abstract float calcular(float num1, float num2);
	public abstract float calcular(List<Float> numeros);
}
