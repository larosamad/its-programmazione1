package _02_max;

public class Max {
    public static void main(String[] args) {
        int[] numeri = {2, 40, 35, 100, 85, 7};
        System.out.println("Il numero massimo è: " + trovaMassimo(numeri));
    }

    public static int trovaMassimo(int[] numeri) {
        int max = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        return max;
    }
}