package _10_carrello;

import java.util.ArrayList;

public class Carrello {
	private ArrayList<String> prodotti;

	public Carrello() {
		prodotti = new ArrayList<String>();
	}
	
	public void aggiungiProdotto(String nomeProdotto) {
		prodotti.add(nomeProdotto);
	}
	
	public void aggiungiProdotto(String nomeProdotto, int quantitaProdotto) {
		String quantitaProdottoString = Integer.toString(quantitaProdotto);
		prodotti.add(nomeProdotto + " " + quantitaProdottoString);
	}
	
	public void stampaCarrello() {
		for (String prodotto : prodotti) {
			System.out.println(prodotto);
		}
	}
	
}
