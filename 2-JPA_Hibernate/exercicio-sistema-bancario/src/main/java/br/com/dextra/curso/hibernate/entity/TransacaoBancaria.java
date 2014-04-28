package br.com.dextra.curso.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.sun.jmx.snmp.Timestamp;

@Entity
public class TransacaoBancaria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long IdTransacao;
	private ContaBancaria contaOrigem;
	private ContaBancaria contaDestino;
	private Timestamp dataEhora;
	
	
	public Long getIdTransacao() {
		return IdTransacao;
	}
	public ContaBancaria getContaOrigem() {
		return contaOrigem;
	}
	public ContaBancaria getContaDestino() {
		return contaDestino;
	}
	public Timestamp getDataEhora() {
		return dataEhora;
	}
	public void setContaOrigem(ContaBancaria contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public void setContaDestino(ContaBancaria contaDestino) {
		this.contaDestino = contaDestino;
	}
	public void setDataEhora(Timestamp dataEhora) {
		this.dataEhora = dataEhora;
	}

	public void setIdTransacao(Long idTransacao) {
		IdTransacao = idTransacao;
	}
	
	
	
	

}
