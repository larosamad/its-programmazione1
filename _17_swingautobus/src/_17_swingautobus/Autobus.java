package _17_swingautobus;
import java.util.ArrayList;

public class Autobus {

    private final int MAX_PASSEGGIERI = 20;
    private final int MAX_AUTISTI = 2;

    private ArrayList<Passeggero> passeggeri;
    private ArrayList<Autista> autisti;

    public Autobus() {
        this.passeggeri = new ArrayList<>();
        this.autisti = new ArrayList<>();
    }

    public void aggiungiPasseggero(Passeggero p) throws PostiEsauritiPasseggeroException {
        if (passeggeri.size() < MAX_PASSEGGIERI) {
            passeggeri.add(p);
        } else {
            throw new PostiEsauritiPasseggeroException("Posti passeggeri esauriti! Massimo: " + MAX_PASSEGGIERI);
        }
    }

    public void aggiungiAutista(Autista a) throws PostiEsauritiAutistaException {
        if (autisti.size() < MAX_AUTISTI) {
            autisti.add(a);
        } else {
            throw new PostiEsauritiAutistaException("Posti autisti esauriti! Massimo: " + MAX_AUTISTI);
        }
    }

    public int getPostiPasseggeriRimasti() {
        return MAX_PASSEGGIERI - passeggeri.size();
    }

    public int getPostiAutistiRimasti() {
        return MAX_AUTISTI - autisti.size();
    }

    public ArrayList<Passeggero> getPasseggeri() {
        return passeggeri;
    }

    public ArrayList<Autista> getAutisti() {
        return autisti;
    }
}