package br.edu.l2q5.radiorelogio;

public class RadioRelogio implements Radio, Relogio {

	private String horario;
	private boolean despertar;
	private String horarioAlarme = "6:00am";
	private String emissora;
	private String tipoEmissora = "FM";
	private int volumeRadio;
	private int volumeRelogio;

	public RadioRelogio(String horario, boolean despertar, String emissora, int volumeRadio,
			int volumeRelogio) {
		this.horario = horario;
		this.setDespertar(despertar);
		this.emissora = emissora;
		this.volumeRadio = volumeRadio;
		this.volumeRelogio = volumeRelogio;
	}

	@Override
	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	@Override
	public String getEmissora() {
		return emissora;
	}

	@Override
	public String getTipoEmissora() {
		return tipoEmissora;
	}

	@Override
	public void setVolumeRadio(int volumeRadio) {
		this.volumeRadio = volumeRadio;
	}

	@Override
	public int getVolumeRadio() {
		return volumeRadio;
	}

	@Override
	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String getHorario() {
		return horario;
	}

	@Override
	public void setHorarioAlarme(String horarioAlarme) {
		this.horarioAlarme = horarioAlarme;
	}

	@Override
	public String getHorarioAlarme() {
		return horarioAlarme;
	}

	@Override
	public boolean ligarAlarme() {
		return true;
	}

	@Override
	public boolean desligarAlarme() {
		return true;
	}

	@Override
	public void setVolumeRelogio(int volumeRelogio) {
		this.volumeRelogio = volumeRelogio;
	}

	@Override
	public int getVolumeRelogio() {
		return volumeRelogio;
	}

	public boolean isDespertar() {
		return despertar;
	}

	public void setDespertar(boolean despertar) {
		this.despertar = despertar;
	}
}