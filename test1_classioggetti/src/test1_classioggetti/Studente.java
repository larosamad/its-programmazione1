package test1_classioggetti;

public class Studente {
	private String nome;
	private String cognome;
	private int annoNascita;
	
	public Studente(String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public void stampaScheda() {
		System.out.println(nome + " " + cognome + " nato nel " + annoNascita);
	}
	
}
