package esame;
// Scrivi una classe Java che rappresenta un “Libro” con almeno 3 attributi e un metodo per stampare le informazioni del libro.


public class Libro {
	private String titolo;
	private int pagine;
	private String genere;
	
	public Libro(String titolo, int pagine, String genere) {
		this.titolo = titolo;
		this.pagine = pagine;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", pagine=" + pagine + ", genere=" + genere + "]";
	}

}
