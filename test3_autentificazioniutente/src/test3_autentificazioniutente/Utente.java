package test3_autentificazioniutente;

public abstract class Utente implements Autenticabile {
    private String username;
    private String email;

    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public abstract void presentati();
}
