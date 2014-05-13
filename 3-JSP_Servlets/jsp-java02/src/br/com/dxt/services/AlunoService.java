package br.com.dxt.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import br.com.dxt.domain.Aluno;

public class AlunoService extends AbstractService<Aluno> {

	public AlunoService() {
		super(Aluno.class);
		
	}
	
	public void criarAluno(String nome,String dataNascimento,String telefone){
		
		Aluno aluno=new Aluno();
		aluno.setNome(nome);
		aluno.setData_nasc(dataNascimento);
		aluno.setTelefone(telefone);
		
		this.salvar(aluno);
	}

	public List<Aluno> buscarAlunos() {		
		List<Aluno> alunos = new ArrayList<>();
		String queryStr = "FROM "+ Aluno.class.getSimpleName();
		Query query = this.getEm().createQuery(queryStr);
	
		return query.getResultList();
	}

}
