package _01_calcolatriceFX;

public class CalcolatriceFX {

    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Somma: " + somma(a, b));
        System.out.println("Differenza: " + differenza(a, b));
        System.out.println("Moltiplicazione: " + moltiplicazione(a, b));
        System.out.println("Divisione: " + divisione(a, b));
    }
    
    public static int somma(int a, int b) {
        return a + b;
    }

    public static int differenza(int a, int b) {
        return a - b;
    }

    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    public static float divisione(int a, int b) {
        return (float) a / b;
    }
}