package _08_utenti;

import java.util.ArrayList;

public class Cliente extends Utente {
	
	public Cliente(String username, String email, boolean isSerious) {
		super(username, email);
	}
	
	@Override 
	public ArrayList<String> getPermessi() {
		ArrayList<String> permessi = new ArrayList<>(); 
		permessi.add("READ");
		return permessi;
	}
	
}
