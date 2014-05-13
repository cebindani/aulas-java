package br.com.dxt.services;

import java.util.List;

import javax.persistence.Query;

import br.com.dxt.domain.Professor;

public class ProfessorService extends AbstractService<Professor> {

	public ProfessorService() {
		super(Professor.class);
		// TODO Auto-generated constructor stub
	}
	
	public void criarProfessor(String nome, String data_nasc, String telefone, String area) {
		Professor professor=new Professor();
		professor.setNome(nome);
		professor.setData_nasc(data_nasc);
		professor.setTelefone(telefone);
		professor.setArea(area);
		
		this.salvar(professor);
	}
	
	
	public List<Professor> buscarProfessores() {
		//List<Professor> professores = new ArrayList<>();
		String queryStr="FROM "+ Professor.class.getSimpleName();
		Query qry=this.getEm().createQuery(queryStr);
		return qry.getResultList(); 
	}
	

}
