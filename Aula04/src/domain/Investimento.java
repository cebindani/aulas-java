package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Investimento extends BaseEntity {
	@Column(name = "tipo_invest")
	public String tipocd;

	public Investimento() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String toString() {
		return "Investimento [tipo=" + tipocd + ", id=" + id + "]";
	}

}
