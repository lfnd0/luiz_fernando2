package br.com.l2q1.ingresso;

public class Main {

	public static void main(String[] args) {
		
		Ingresso ingresso = new Ingresso(2);
		IngressoVIP ingressoVIP = new IngressoVIP(2, 1);
		
		System.out.println(ingresso);
		System.out.println(ingressoVIP);
	}
}