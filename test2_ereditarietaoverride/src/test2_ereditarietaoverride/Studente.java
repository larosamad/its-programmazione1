package test2_ereditarietaoverride;

public class Studente extends Persona {

    private String matricola;

    public Studente(String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public void presentati() {
        System.out.println("Sono lo studente " + getNome() + " " + getCognome() + ", matricola: " + matricola);
    }
}