package _06_abstract;

public class Rettangolo extends Forma {
	private double base;
	private double altezza;
	

	public Rettangolo(double altezza, double base) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		double area = (base * altezza);
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = 2 * base + 2 * altezza;
		return perimetro;
	}
}

