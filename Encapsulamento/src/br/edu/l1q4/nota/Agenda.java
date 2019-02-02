package br.edu.l1q4.nota;

import java.util.ArrayList;

public class Agenda {
	ArrayList<Nota> notas;

	public void adicionar(String dono, String texto) {
		Nota nota = new Nota(dono, texto);
		notas.add(nota);
	}

	public boolean remover(Nota nota) {
		return notas.remove(nota);
	}

	public void atualizar(int indexNota, String dono, String texto) {
		Nota nota = notas.get(indexNota);

		if (nota.getDono().equals(dono)) {
			nota.setDono(dono);
			nota.setTexto(texto);
		}
	}

	public ArrayList<Nota> listarTrue(String dono) {
		ArrayList<Nota> notasTrue = new ArrayList<Nota>();

		for (Nota nota : notasTrue) {
			if (dono.equals(nota.getDono()) && nota.isEstado()) {
				notasTrue.add(nota);
			}
		}

		return notasTrue;
	}

	public ArrayList<Nota> listarFalse(String dono) {
		ArrayList<Nota> notasFalse = new ArrayList<Nota>();

		for (Nota nota : notasFalse) {
			if (dono.equals(nota.getDono()) && nota.isEstado()) {
				notasFalse.add(nota);
			}
		}

		return notasFalse;
	}

	public void finalizar(String dono, int indexNota) {
		if (dono.equals(notas.get(indexNota).getDono())) {
			notas.get(indexNota).setEstado(false);
		}
	}
}