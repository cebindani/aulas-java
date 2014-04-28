package com.dxt.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PU")
public class EmpresaPublica extends Empresa {
	
	public int numeroProcessos;

}
