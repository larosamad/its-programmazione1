package _04_arraylist;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> nomi = new ArrayList<>();
		
		nomi.add("Mario");
		nomi.add("Alice");
		nomi.remove("Mario");
		nomi.add("Bob");
		nomi.add("Carla");
		nomi.add("Gianni");
		
		System.out.println("Nomi nella lista:");
		for (String nome : nomi) {
		    System.out.println(nome);
		}
	}
}