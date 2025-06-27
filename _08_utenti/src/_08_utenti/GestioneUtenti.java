package _08_utenti;
import java.util.ArrayList;


public class GestioneUtenti {
    private ArrayList<Utente> utenti;
	
    public GestioneUtenti() {
    	utenti = new ArrayList<Utente>();
    }
    
    public void aggiungiUtente(Utente u) {
        utenti.add(u);
    }
    
    public void stampaPermessi() {
        for (Utente u : utenti) {
            u.stampaInfo();  
            System.out.println("Permessi: " + u.getPermessi() + "\n"); 
        }
    }

}
