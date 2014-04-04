package dojo1;

import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		Money euros = new Money(Moeda.EURO, "30.00");
		Money dolar = new Money(Moeda.DOLAR, "25.00");

		Money[] valores = new Money[] { euros, dolar, peso };
		
		for (Money money : valores) {
			double cotacao = 0.0;
			if (money.getMoeda() == Moeda.EURO) {
				cotacao = Moeda.EURO.getCotacao();
			} else if (money.getMoeda() == Moeda.DOLAR) {
				cotacao = Moeda.DOLAR.getCotacao();
			}
			System.out.println("Valor em reais: "
					+ money.getValor().multiply(new BigDecimal(cotacao)));
		}
		
		
		for (Money money : valores) {
			System.out.println("Valor em reais: "+money.getValor().multiply(new BigDecimal(money.getMoeda().getCotacao())));
		}
	}

}
