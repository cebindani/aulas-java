package br.com.dxt.services;

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
	

}
