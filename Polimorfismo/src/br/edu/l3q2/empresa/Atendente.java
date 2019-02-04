package br.edu.l3q2.empresa;

import br.edu.l3q1.empresa.Funcionario;

public class Atendente extends Funcionario {
	
	public Atendente(String nome, String funcao, String email, String senha, int registroUnico) {
		super(nome, funcao, email, senha, registroUnico);
	}
	
	@Override
	public String getFuncao() {
		return "O funcionario " + super.getNome() + " e atendente.";
	}	
}