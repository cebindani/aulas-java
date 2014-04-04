package br.com.dextraining.helloworld;

public class Ponto {

	int x;
	int y;

	public Ponto(int a, int b) {
		// TODO Auto-generated constructor stub
		this.x = a;
		this.y = b;
	}

	double distanciaAte(Ponto outro) {
		return Math.sqrt(Math.pow(this.x - outro.x, 2)
				+ Math.pow(this.y - outro.y, 2));
		// o uso do this. é apenas para afirmar que está instanciando ele mesmo
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		Ponto other = (Ponto) obj;
		return this.x == other.x && this.y == other.y;
	}

	@Override
	public int hashCode() {
		return 3 * x + 7 * y;
	}
	
	
}
