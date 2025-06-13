package _06_abstract;
import java.lang.Math;

public class Cerchio extends Forma {
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		double area = raggio * raggio * Math.PI;
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = 2 * Math.PI * raggio;
		return perimetro;
	}
}
