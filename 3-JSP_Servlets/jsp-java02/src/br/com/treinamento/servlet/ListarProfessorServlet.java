package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.services.ProfessorService;

public class ListarProfessorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ProfessorService service = new ProfessorService();
		service.buscarTodos();
		resp.sendRedirect("/jsp/listagemProfessor.jsp");
	}

	

}
