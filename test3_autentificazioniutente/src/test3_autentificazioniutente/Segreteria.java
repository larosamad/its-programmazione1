package test3_autentificazioniutente;

public class Segreteria extends Utente {
    private String ufficio;

    public Segreteria(String username, String email, String ufficio) {
        super(username, email);
        this.ufficio = ufficio;
    }

    @Override
    public void presentati() {
        System.out.println("Personale di segreteria " + getUsername() + ", ufficio: " + ufficio);
    }

	@Override
	public void autentica(String password) {
	}
}