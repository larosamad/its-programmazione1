package _06_abstract;

public class Main {
	public static void main(String[] args) {
		Cerchio c = new Cerchio(5);
		double areaCerchio = c.calcolaArea();
		System.out.println("L'area del cerchio è:"+areaCerchio);
		
		Rettangolo r = new Rettangolo(5, 10);
		double perimetroRettangolo = r.calcolaPerimetro();
		System.out.println("Perimetro rettangolo è:"+perimetroRettangolo);
	}
}
