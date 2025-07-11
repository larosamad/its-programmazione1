package test3_autentificazioniutente;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Utente> utenti = new ArrayList<>();
        // String password = "studente123";
        String password = "prof2024";

        utenti.add(new Studente("Gino", "gino@email.it", "AAH82718"));
        utenti.add(new Professore("Lino", "marco@email.edu", "matematica"));
        utenti.add(new Segreteria("Lello", "lello@email.it", "Ufficio Rinunce"));
        
        for (Utente utente : utenti) {
            utente.presentati();

            if (utente instanceof Segreteria) {
                System.out.println("Questo utente non ha bisogno di essere autenticato.");
            } else {
                try {
                    utente.autentica(password);
                    System.out.println("Accesso avvenuto.");
                } catch (AutenticazioneException e) {
                    System.out.println("Accesso negato. Motivo: " + e.getMessage());
                }
            }
            
            System.out.println();
        }
    }
}