package _06_abstract;

class Triangolo extends Forma {
	private double base;
	private double altezza;
	private double latoA;
	private double latoB;
	private double latoC;
	

	public Triangolo(double base, double altezza, double latoA, double latoB, double latoC) {
		this.base = base;
		this.altezza = altezza;
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
	}

	@Override
	public double calcolaArea() {
		double area = (base * altezza)/2;
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = latoA + latoB + latoC;
		return perimetro;
	}
}





