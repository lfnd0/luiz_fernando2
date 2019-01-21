package br.com.l3q4.reinoanimal;

public class Passaro extends Ave {
	
private String tipo;
	
	public Passaro(String nome, String tipo) {
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
		System.out.println("O "+ tipo + " " + nome + " esta voando.");
		
	}

	@Override
	public void alimentar() {
		System.out.println("O "+ tipo + " " + nome + " esta comendo biscoito.");
		
	}
}