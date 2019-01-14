package br.com.l2q4.imovel;

public class Main {
	
	public static void main(String[] args) {
		
		Novo novo = new Novo("Rua X", 2.99f, 0.99f);
		Velho velho = new Velho("Rua Y", 2.99f, 0.99f);
		
		System.out.println(novo);
		System.out.println(velho);
	}
}