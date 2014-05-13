package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.services.ProfessorService;

/**
 * Servlet implementation class ProfessorServlet
 */
public class ProfessorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ProfessorService service;

	@Override
	public void init() throws ServletException {
		service = new ProfessorService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String data_nasc = req.getParameter("dataNascimento");
		String telefone = req.getParameter("telefone");
		String area = req.getParameter("area");
		
		service.criarProfessor(nome, data_nasc, telefone, area);
		resp.sendRedirect("/jsp/index.jsp");
		
	}

}
