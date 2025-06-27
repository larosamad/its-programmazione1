package _11_divisione;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci un numero: ");
        int numeroA = scanner.nextInt();
        
        System.out.println("Inserisci un altro numero: ");
        int numeroB = scanner.nextInt();

        
        try {
            System.out.println("Divisione: " + numeroA / numeroB);
       	} catch (ArithmeticException e) {
       		System.out.println("Errore");
       	}

        scanner.close();
	}

}