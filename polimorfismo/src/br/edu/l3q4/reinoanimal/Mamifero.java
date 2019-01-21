package br.com.l3q4.reinoanimal;

public abstract class Mamifero extends Animal { 
		
	public Mamifero(String nome) {
		super(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return nome + " e um animal, " + nome + " e um mamifero.";
	}
	
	public abstract void locomover();
	
	public abstract void alimentar();
}