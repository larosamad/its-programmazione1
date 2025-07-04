package test2_ereditarietaoverride;

public class Main {

	public static void main(String[] args) {
        Persona[] persone = new Persona[3];
        persone[0] = new Studente("Gino", "Paoli", "H228A8");
        persone[1] = new Professore("Rino", "Folletto", "matematica");
        persone[2] = new Persona("Orlando", "Furioso");

        for (int i = 0; i < persone.length; i++) {
            persone[i].presentati();
        }
	}

}