package dojo1;

import java.math.BigDecimal;

public class Money {

	
	private BigDecimal valor;
	private int moeda;

	public Money(int moeda, String s) {
		this(moeda,new BigDecimal(s));

	}
	public Money(){
		
	}
	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	/**
	 * @return the moeda
	 */
	public Moeda getMoeda() {
		return moeda;
	}
	/**
	 * @param moeda the moeda to set
	 */
	public void setMoeda(int moeda) {
		this.moeda = moeda;
	}



}
