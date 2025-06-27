package _08_utenti;

public class Main {

	public static void main(String[] args) {
		Utente pedro = new Admin ("pedro9", "pedropedropedropedrope@gmail.com"); 
		Utente fedro = new Admin ("fedro", "fedrooo@gmail.com"); 
		Utente mignolo = new Cliente ("pollice", "indice@gmail.com"); 
		Utente giorgio = new Cliente ("giorgino", "giorgione@gmail.com"); 
		GestioneUtenti gestione = new GestioneUtenti();
		gestione.aggiungiUtente(pedro);
		gestione.aggiungiUtente(fedro);
		gestione.aggiungiUtente(mignolo);
		gestione.aggiungiUtente(giorgio);
		gestione.stampaPermessi();
	}

}
