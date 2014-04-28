package test;

import java.util.ArrayList;
import java.util.List;

import domain.PessoaFisica;
import domain.Telefone;
import domain.Telefone.tipoTel;
import service.GenericDAO;

public class Teste2 {

	public static void main(String[] args) {

		GenericDAO gd = new GenericDAO();

		Telefone tel = new Telefone();
		Telefone tel2 = new Telefone();

		List<Telefone> listaTel = new ArrayList<Telefone>();

		tel.ddd = "011";
		tel.numero = "99153-9070";
		tel.tipo = tipoTel.celular;
		listaTel.add(tel);
		
		tel2.ddd="011";
		tel2.numero="4028-6643";
		tel2.tipo=tipoTel.residencial;
		listaTel.add(tel2);
		
		PessoaFisica pf=new PessoaFisica();
		pf.nome="Daniele";
		pf.sobrenome="Cebin";
		pf.cpf="370.544.128-00";
		pf.telefones=listaTel;
		
		gd.salvar(tel);
		gd.salvar(tel2);
		gd.salvar(pf);
		
		
		

		System.exit(0);
	}

}
