package br.com.l3q1.empresa;

public class Funcionario {

	private String nome;
	/*
	 * private String cpf; private String dataNascimento;
	 */
	private String funcao;
	private String senha;
	private String email;
	private int registroUnico;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
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
		if (this.email == email && this.senha == senha) {
			return "Acesso permitido! " + getNome() + " e " + getFuncao() + "!";
		} else {
			return "Acesso negado!";
		}
	}

	public boolean fazerLogin(int registroUnico, String senha) {
		return this.registroUnico == registroUnico && this.senha == senha;
	}
}