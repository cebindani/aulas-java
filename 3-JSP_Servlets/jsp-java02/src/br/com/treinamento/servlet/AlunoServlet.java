package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.services.AlunoService;

public class AlunoServlet extends HttpServlet{

	private static final long serialVersionUID = 4793671708902942183L;
	
	private AlunoService service;
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		service = new AlunoService();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome= req.getParameter("nome");
		String dataNascimento= req.getParameter("dataNascimento");
		String telefone=req.getParameter("telefone");
		
		
		service.criarAluno(nome, dataNascimento, telefone);
		
		
		
		
	}
	
	
	

}
