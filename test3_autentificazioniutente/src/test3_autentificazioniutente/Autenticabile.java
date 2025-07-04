package test3_autentificazioniutente;

public interface Autenticabile {
    void autentica(String password) throws AutenticazioneException;
}