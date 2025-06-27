package _13_veicolointerfacce;

public class Main {

	public static void main(String[] args) {
		AutoIbrida a1 = new AutoIbrida(70);
		
		System.out.println(a1.toString());
		a1.ricarica();
		System.out.println(a1.toString());
		
		a1.connetti();
	}
}
