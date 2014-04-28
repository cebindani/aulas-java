package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Veiculo extends BaseEntity{
	@Column(name="marcaV")
	public String marca;
	public String modelo;
	public int ano;
	

	@Override
	public String toString() {
		return "Veiculos [marca=" + marca + "]";
	}
	
	

}
