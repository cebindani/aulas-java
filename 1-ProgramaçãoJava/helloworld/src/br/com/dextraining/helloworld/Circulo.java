package br.com.dextraining.helloworld;

public class Circulo extends FiguraGeometrica {

	private Ponto centro;
	private double raio;

	public Circulo(Ponto a, double b) {
		this.centro = a;
		this.raio = b;

	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Círculo: "+ super.toString();
	}
}
