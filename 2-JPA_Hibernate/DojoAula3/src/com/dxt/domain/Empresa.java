package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipoEmpresa")
public class Empresa extends BaseEntity{
	
	@Column(name="nome_empresa")
	public String nomeEmpresa;
	
	@Column(name="nome_fantasia")
	public String nomeFantasia;
	@Column (length=25, unique=true)
	public String cnpj;
	
	
	@Override
	public String toString() {
		return "Empresa [nomeEmpresa=" + nomeEmpresa + ", nomeFantasia="
				+ nomeFantasia + ", cnpj=" + cnpj + "]";
	}

	

	

	

}

