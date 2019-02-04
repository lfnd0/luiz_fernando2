package br.edu.l3q1.empresa;

public class Funcionario {

	private String nome;

	private String cpf;
	private String dataNascimento;
	private String funcao;
	private String senha;
	private String email;
	private int registroUnico;

	public Funcionario() {
	}

	public Funcionario(String nome, String funcao, String email, String senha, int registroUnico) {
		this.nome = nome;
		this.funcao = funcao;
		this.email = email;
		this.senha = senha;
		this.registroUnico = registroUnico;
		
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
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String fazerLogin(String email, String senha) {
		if (email.equals(this.email) && senha.equals(this.senha)) {
			return "Acesso permitido!";
		} else {
			return "Acesso negado!";
		}
	}
	
	public String fazerLogin(int registroUnico, String senha) {
		if (this.registroUnico == registroUnico && (senha.equals(this.senha))) {
			return "Acesso permitido!";
		} else {
			return "Acesso negado!";
		}
	}
}