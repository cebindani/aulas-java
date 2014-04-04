package cebin.daniele.helloworld.interfaces;

public class Circulo implements FiguraGeometrica {

	private Ponto centro;
	private double raio;

	public Circulo(Ponto a, double b) {
		this.centro = a;
		this.raio = b;

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Círculo";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raio;
	}

}
