package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Telefone extends BaseEntity {

	
	private enum tipoTel {comercial,residencial,celular};
	@Column(name="tipoTel")
	public tipoTel tipo;
	public String ddd;
	public String numero;
	
	
	public Telefone() {
		super();
	}


	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", ddd=" + ddd + ", numero=" + numero
				+ ", id=" + id + "]";
	}

}
