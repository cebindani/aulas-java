package br.com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class Investimento extends MyAbstractEntity {

	public Investimento(TipoInvestimento invest) {
		this.tipo=invest;
		// TODO Auto-generated constructor stub
	}

	@Enumerated(EnumType.STRING)
	public TipoInvestimento tipo;

//	@ManyToOne
//	public Pessoa pessoa;
}
