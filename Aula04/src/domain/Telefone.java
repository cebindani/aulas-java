package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Telefone extends BaseEntity {

	public enum tipoTel {
		comercial, residencial, celular
	};

	@Column(name = "tipoTel")
	public tipoTel tipo;
	@Column(length = 3)
	public String ddd;
	public String numero;

	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", ddd=" + ddd + ", numero=" + numero
				+ ", id=" + id + "]";
	}

}
