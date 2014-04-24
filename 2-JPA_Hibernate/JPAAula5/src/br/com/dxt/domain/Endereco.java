package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Endereco {

	@Column(length = 200)
	public String rua;
	@Column(length = 200)
	public String cidade;

	@Enumerated(EnumType.STRING)
	public Estado estado;

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + ", estado="
				+ estado  + "]";
	}

}
