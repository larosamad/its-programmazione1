package _07_animali;

public abstract class Animale {
	private String nome;
	
	public Animale(String nome) {
		this.nome = nome;
	}
	
	public abstract void emettiVerso();
	public void descrizione() {
		System.out.println("Sono un animale di nome "+nome);
	}
}
