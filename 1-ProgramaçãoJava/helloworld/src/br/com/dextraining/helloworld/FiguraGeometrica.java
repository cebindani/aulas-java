package br.com.dextraining.helloworld;

public abstract class FiguraGeometrica {
	
	abstract double area();
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " area "+area();
	}

	
}
