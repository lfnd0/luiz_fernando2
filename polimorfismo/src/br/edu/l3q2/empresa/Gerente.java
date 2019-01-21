package br.com.l3q2.empresa;

public class Gerente implements Funcionario {

	private String nome;
	private String email;
	private int registroUnico;
	private String senha;

	public Gerente(String nome, String email, int registroUnico, String senha) {
		this.nome = nome;
		this.email = email;
		this.registroUnico = registroUnico;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRegistroUnico() {
		return registroUnico;
	}
	
	public void setRegistroUnico(int registroUnico) {
		this.registroUnico = registroUnico;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean fazerLogin(String email, String senha) {
		return this.email == email && this.senha == senha;
	}
	
	@Override
	public boolean fazerLogin(int registroUnico, String senha) {
		return this.registroUnico == registroUnico && this.senha == senha;
	}
	
	@Override
	public String getFuncao() {
		return "O funcionario " + getNome() + " e gerente.";
	}
}