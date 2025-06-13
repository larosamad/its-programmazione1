package _01_calcolatrice;

public class Calcolatrice {
	public static void main(String[] args) {
		int a, b, sum, diff, molt;
		float div;
		a = 50;
		b = 10;
		sum = a+b;
		diff = a-b;
		molt = a*b;
		div = (float)a / b;	
		
        System.out.println("Somma: " + sum);
        System.out.println("Differenza: " + diff);
        System.out.println("Moltiplicazione: " + molt);
        System.out.println("Divisione: " + div);

	}
}
