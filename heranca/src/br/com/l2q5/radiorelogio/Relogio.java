package br.com.l2q5.radiorelogio;

public interface Relogio {
	
	void setHorario(String horario);
	String getHorario();
	
	void setHorarioAlarme(String horarioAlarme);
	String getHorarioAlarme();
	
	boolean ligarAlarme();
	boolean desligarAlarme();
	
	void setVolumeRelogio(int volumeRelogio);
	int getVolumeRelogio();
}
