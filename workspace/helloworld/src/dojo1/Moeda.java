/**
 * 
 */
package dojo1;

public enum Moeda {
	EURO(3.2), DOLAR(2.4), PESO_CHILENO(1/243.0);

	private double cotacao;

	Moeda(double cotacao) {
		this.cotacao = cotacao;
	}

	
	public double getCotacao() {
		return cotacao;
	}

	

}
