package _07_animali;
import java.util.ArrayList;

public class Rifugio {
	private ArrayList<Animale> animali;
	

	public Rifugio() {
	animali = new ArrayList<>();
	}

	public void aggiungiAnimale(Animale a) {
		animali.add(a);
	}
	
	
	public void stampaVersi() {
		for (Animale temp : animali) {
			temp.descrizione();
			temp.emettiVerso();
		}
	}
}
