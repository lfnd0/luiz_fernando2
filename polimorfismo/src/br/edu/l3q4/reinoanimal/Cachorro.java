package br.edu.l3q4.reinoanimal;

public class Cachorro extends Mamifero{
	
	private String tipo;
	
	public Cachorro(String nome, String tipo) {
		super(nome);
		this.tipo = tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public void locomover() {
		System.out.println("O "+ tipo + " " + nome + " esta correndo.");
	}

	@Override
	public void alimentar() {
		System.out.println("O "+ tipo + " " + nome + " esta comendo racao.");	
	}
}