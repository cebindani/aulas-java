package domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Endereco extends BaseEntity {

	public String rua;
	public String cidade;

	public enum UF {
		SP, RJ, ES, MG
	};

	@Enumerated(EnumType.STRING)
	public UF estado;

	public Endereco() {
		super();
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + ", id=" + id
				+ "]";
	}

}
