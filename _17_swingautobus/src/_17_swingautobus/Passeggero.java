package _17_swingautobus;

import _17_swingautobus.Passeggero;

public class Passeggero extends Persona implements UtenteAutobus{
	private Boolean bagaglio;
	private String destinazione;
	
	public Passeggero(String nome, String cognome, String CF) {
		super(nome, cognome, CF);
	}
	
	public Passeggero(String nome, String cognome, String CF, Boolean bagaglio, String destinazione) {
		super(nome, cognome, CF);
		this.bagaglio = bagaglio;
		this.destinazione = destinazione;
	}

	
	public Boolean getBagaglio() {
		return bagaglio;
	}

	public void setBagaglio(Boolean bagaglio) {
		this.bagaglio = bagaglio;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	@Override
    public Passeggero getTipo() {
        return this;
    }
	
}

