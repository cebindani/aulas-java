package com.dxt.test;

import com.dxt.domain.BaseEntity;
import com.dxt.domain.PessoaFisica;
import com.dxt.service.Genericdao;

public class Principal {

	public static void main(String[] args) {
		
		Genericdao gd = new Genericdao();
				
		PessoaFisica p1 = new PessoaFisica();
		PessoaFisica p2 = new PessoaFisica();
		p1.cpf = "1234";
		p1.estadoCivil = "Solteiro";
		p1.nome ="Daniele";
		
		gd.salvar(p1);
		
		for(BaseEntity be : gd.buscaTodos(p1.getClass())){
			System.out.println(be);
		}
		
		p1.nome = "Daniele Cebin";
		
		gd.salvar(p1);
		
//		for(BaseEntity be : gd.buscaTodos(p1.getClass())){
//			System.out.println(be);
		
//		P2.Id = 1L;
		p2.nome = "Danilo";
		p2.cpf = "12345";
		p2.estadoCivil = "Solteiro";
		gd.salvar(p2);
		
		for(BaseEntity be : gd.buscaTodos(p1.getClass())){
			System.out.println(be);
		}
		
		PessoaFisica pf = gd.em.find(PessoaFisica.class, 2L);
		System.out.println(pf);
		gd.exclui(pf);
		
		for(BaseEntity be : gd.buscaTodos(p1.getClass())){
			System.out.println(be);
		}
		
		System.exit(0);
	}

}
