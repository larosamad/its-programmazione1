package _07_animali;


public class Main {

	public static void main(String[] args) {		
		Rifugio speranza = new Rifugio();
		Animale gino = new Gatto("Gino"); 
		Animale guccio = new Cane ("Guccio");

		speranza.aggiungiAnimale(gino);
		speranza.aggiungiAnimale(guccio);
		speranza.stampaVersi();
	}

}