package domain;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	public String cnpj;

	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nome=" + nome + ", id=" + id
				+ "]";
	}

}
