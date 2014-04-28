package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PV")
public class EmpresaPrivada extends Empresa {
	
	@Column(precision=4,scale=2)
	public double faturamento;
	
	

}
