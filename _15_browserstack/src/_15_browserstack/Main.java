package _15_browserstack;

public class Main {

	public static void main(String[] args) {
		
		Browser mozilla = new Browser();
		
		// Visita 3 pagine diverse
		mozilla.visitPage("google.it");
		mozilla.visitPage("facebook.it");
		mozilla.visitPage("youtube.it");
		
		mozilla.previousPage();

		// Uso del tasto “indietro” una o due volte.
		mozilla.goBack();
		mozilla.goBack();

		// Stampa finlale della cronologia
		mozilla.printHistory();
		
	}

}
