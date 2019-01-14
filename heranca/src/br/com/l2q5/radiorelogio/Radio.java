package br.com.l2q5.radiorelogio;

public interface Radio {
	
	String getEmissora();
	void setEmissora(String emissora);
	
	String getTipoEmissora();
	
	int getVolumeRadio();
	void setVolumeRadio(int volumeRadio);
}