package br.com.l1q4.encapsulamento;

public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda("Luiz Fernando", "Viagem para Portland.");
		
		System.out.printf("Dono da agenda: %s%n", agenda.getDono());
		System.out.printf("Nota: %s", agenda.getTexto());
	}

}