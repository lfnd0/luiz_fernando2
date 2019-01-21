package br.com.l3q4.reinoanimal;

public class Main {
	
	public static void main(String[] args) {
		
		Macaco macaco = new Macaco("Shell", "gorila");
		System.out.println(macaco.getDescricao());
		macaco.getDescricao();
		macaco.locomover();
		macaco.alimentar();
		
		Cachorro cachorro = new Cachorro("Leo", "pastor-alemao");
		System.out.println(cachorro.getDescricao());
		cachorro.getDescricao();
		cachorro.locomover();
		cachorro.alimentar();
		
		Aguia aguia = new Aguia("Zeca", "harpia-macho");
		System.out.println(aguia.getDescricao());
		aguia.getDescricao();
		aguia.locomover();
		aguia.alimentar();
		
		Passaro passaro = new Passaro("Uh-uh", "rouxinol");
		System.out.println(passaro.getDescricao());
		passaro.getDescricao();
		passaro.locomover();
		passaro.alimentar();
	}
}