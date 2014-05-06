package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class Aluno extends MyAbstractEntity {

	private String nome;
	private String data_nasc;
	private String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
