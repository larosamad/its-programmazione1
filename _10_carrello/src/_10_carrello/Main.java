package _10_carrello;

public class Main {

	public static void main(String[] args) {

		Carrello carrello =  new Carrello();
		
		carrello.aggiungiProdotto("Mozzarella senza lattosio");
		
		carrello.aggiungiProdotto("Pizza", 10);
		
		carrello.aggiungiProdotto("Pane", 5);
		
		carrello.stampaCarrello();
		
	}

}
