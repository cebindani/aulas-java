package br.com.dxt.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.dxt.domain.Cliente;
import br.com.dxt.domain.Investimento;
import br.com.dxt.domain.TipoInvestimento;
import br.com.dxt.services.EntityManagerFactoryWrapper;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();

		Investimento inv1 = new Investimento();
		inv1.tipo = TipoInvestimento.POUPANCA;
		Investimento inv2 = new Investimento();
		inv2.tipo = TipoInvestimento.ACOES;

		List<Investimento> cli_invests = new ArrayList<Investimento>();
		cli_invests.add(inv1);
		cli_invests.add(inv2);

		Cliente cli = new Cliente();
		cli.nome = "Daniele";
		cli.cpf = "370";
		cli.investimentos = cli_invests;

		
		em.getTransaction().begin();

		for (Investimento invest : cli_invests) {
			em.persist(invest);
		}
		em.persist(cli);

		em.getTransaction().commit();
		em.close();
		
		TipoInvestimento tipo;
		tipo.
		
		cadastrarCliente("Daniele", "123.123.123-11", tipo.POUPANCA, tipo.ACOES);

	}
	
	void cadastrarCliente(String nome, String cpf, TipoInvestimento inv1, TipoInvestimento inv2) {
		Cliente cli = new Cliente();
		cli.nome = nome;
		cli.cpf = cpf;
		List<Investimento> cli_invests = new ArrayList<Investimento>();
		cli_invests.add(inv1);
		cli_invests.add(inv2);
		
	
		
	}

}
