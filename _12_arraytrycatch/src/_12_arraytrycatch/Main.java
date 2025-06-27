package _12_arraytrycatch;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] nomi = new String[3];
		nomi[0] = "Ugo";
		nomi[1] = "Eva";
		nomi[2] = "Emma";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un indice");
		int indice = scanner.nextInt();
		
		try {
			System.out.println("Il nome all'indice scelto: " + nomi[indice]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Errore");
		} finally {
			scanner.close();
		}
	}

}
