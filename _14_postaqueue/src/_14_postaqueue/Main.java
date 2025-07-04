package _14_postaqueue;

public class Main {

	public static void main(String[] args) {
		
		PostOffice posta = new PostOffice();
		// Aggiungi almeno 3 persone alla coda
		posta.joinQueue(new Person("Romolo"));
		posta.joinQueue(new Person("Gianni"));
		posta.joinQueue(new Person("Gino"));
		
		// Mostra la coda
		posta.showQueue();

		// Visualizza il prossimo da servire
		posta.whosNext();
		
		// Servi due persone
		posta.serveNext();
		posta.serveNext();
		
		// Mostra la coda rimanente
		posta.showQueue();
	}

}
