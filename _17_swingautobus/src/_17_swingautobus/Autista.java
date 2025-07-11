package _17_swingautobus;

import _17_swingautobus.Autista;

public class Autista extends Persona implements UtenteAutobus{
	private String patente;
	private int anniEsperienza;

	public Autista(String nome, String cognome, String CF, String patente, int anniEsperienza) {
		super(nome, cognome, CF);
		this.patente = patente;
		this.anniEsperienza = anniEsperienza;
	}

	public Autista(String nome, String cognome, String CF, String patente) {
		super(nome, cognome, CF);
		this.patente = patente;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getAnniEsperienza() {
		return anniEsperienza;
	}

	public void setAnniEsperienza(int anniEsperienza) {
		this.anniEsperienza = anniEsperienza;
	}

	@Override
	public String toString() {
		return "Autista [patente=" + patente + "]";
	}
	
    @Override
    public Autista getTipo() {
        return this;
    }


}
