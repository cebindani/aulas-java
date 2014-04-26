package br.com.dextra.curso.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pessoaJuridica")
public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	@Enumerated(EnumType.STRING)
	private TipoEmpresa tipo;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public TipoEmpresa getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}
}
