package br.com.dxt.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.com.dxt.domain.Cliente;
import br.com.dxt.domain.Investimento;
import br.com.dxt.domain.TipoInvestimento;
import br.com.dxt.services.EntityManagerFactoryWrapper;

public class CasoDeTeste_1 {

	
	public void CadastraInvestimento() {
		
		fail("Not yet implemented");
		
		
	
	
	
	}
	
	@Test
	public void CadastraCliente() {
		
		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		
		
		Cliente cli= new Cliente();
		List<Investimento> invest = new ArrayList<Investimento>();
		Investimento inv = new Investimento();
		
		inv.tipo=TipoInvestimento.POUPANCA;
		invest.add(inv);
		inv.tipo=TipoInvestimento.ACOES;
		invest.add(inv);
		
		cli.nome="Daniele";
		cli.cpf="370";
		cli.investimentos=invest;
			
		
		
		
//		em.getTransaction().begin();
//		em.persist(invest);
//		em.getTransaction().commit();
		
		em.getTransaction().begin();
		em.persist(cli);
		em.getTransaction().commit();
		
		
		
		
			
		
		
	}
	
	
	

}
