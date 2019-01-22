package br.edu.l3q1.empresa;

public class Funcionario {

	private String nome;

	/*
	 * private String cpf; private String dataNascimento; private String funcao;
	 */
	private String senha;
	private String email;
	private int registroUnico;

	public Funcionario() {
	}

	public Funcionario(String email, String senha, int registro) {
		this.email = email;
		this.senha = senha;
		this.registroUnico = registro;
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

	public String fazerLogin(String email, String senha) {
		if (email.equals(this.email) && (senha.equals(this.senha))) {
			return "Acesso permitido!";
		} else {
			return "Acesso negado!";
		}
	}

	public boolean fazerLogin(int registroUnico, String senha) {
		return this.registroUnico == registroUnico && senha.equals(this.senha);
	}
}