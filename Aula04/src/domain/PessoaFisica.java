package domain;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	public String cpf;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", id=" + id + ", nome=" + nome
				+ ", endereco=" + endereco + ", agencia=" + agencia + "]";
	}
	
	
	
}
