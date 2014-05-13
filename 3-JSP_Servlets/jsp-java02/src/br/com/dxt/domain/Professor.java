package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class Professor extends MyAbstractEntity {

	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	private String nome;
	private String data_nasc;
	private String telefone;
	private String area;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	

}
