package test2_ereditarietaoverride;

public class Professore extends Persona {

    private String materia;

    public Professore(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void getMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void presentati() {
        System.out.println("Sono il professore " + getNome() + " " + getCognome() + ", insegno " + materia);
    }

}
