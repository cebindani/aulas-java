package com.dxt.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class EmpresaPrivada {
	
	
	
	

	
	



	public EmpresaPrivada() {
		// TODO Auto-generated constructor stub
	}

}
