package _09_calcolatrice;

public class Main {

	public static void main(String[] args) {
		Calcolatrice sommatore = new Calcolatrice();
		
		int risultato1 = sommatore.somma(5, 4);
		int risultato2 = sommatore.somma(5, 4, 4);
		double risultato3 = sommatore.somma(8.2, 3.4);
		String risultato4 = sommatore.somma("ciao", "mondo");
		
		System.out.println(risultato1);
		System.out.println(risultato2);
		System.out.println(risultato3);
		System.out.println(risultato4);
		
		// oppure
		// System.out.println(sommatore.somma(5, 4));
	}

}
