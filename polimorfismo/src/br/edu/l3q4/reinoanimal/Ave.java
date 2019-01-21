package br.com.l3q4.reinoanimal;

public abstract class Ave extends Animal {

	public Ave(String nome) {
		super(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return nome + " e um animal, " + nome + " e uma ave.";
	}
	
	public abstract void locomover();
	
	public abstract void alimentar();
}