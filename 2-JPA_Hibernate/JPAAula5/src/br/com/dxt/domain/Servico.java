package br.com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Servico extends BaseEntity {

	@Enumerated(EnumType.STRING)
	public TipoAtendimento tipo;

}