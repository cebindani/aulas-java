package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Servico extends BaseEntity {

	@Column(name = "tipoServico")
	public String tipo;

	public Servico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Servico [tipo=" + tipo + ", id=" + id + "]";
	}

}
