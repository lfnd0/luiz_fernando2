package br.com.l3q2.empresa;

public interface Funcionario {
	
	public boolean fazerLogin(String email, String senha);
	
	public boolean fazerLogin(int registroUnico, String senha);
	
	public String getFuncao();
}
