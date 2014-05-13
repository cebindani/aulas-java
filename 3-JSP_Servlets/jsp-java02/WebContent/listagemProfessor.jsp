<%@page import="br.com.dxt.services.ProfessorService"%>
<%@page import="java.util.List"%>
<%@ page import="br.com.dxt.domain.Professor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>

<%@include file="header.jsp"%>
<title>Listar professor</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#novoProfessor').click(function() {
			window.location = "/jsp/cadastroProfessor.jsp";
		});
	});
</script>


</head>
<body>
	<%@include file="menu.jsp"%>

	<form>
		<h1>Professores</h1>
		<div class="well conteudo">
			<table class="table table-hover">
				<thead>
					<th>Nome</th>
					<th>Data nascimento</th>
					<th>Area</th>
				</thead>
				<%
					ProfessorService service = new ProfessorService();
					List<Professor> professores = service.buscarProfessores();

					for (Professor professor : professores) {
				%>
				<tbody>
					<tr>
						<td><%=professor.getNome()%></td>
						<td><%=professor.getData_nasc()%></td>
						<td><%=professor.getArea()%></td>
					</tr>
					<%
						}
					%>

				</tbody>
			</table>
			<div class="app-buttons">
				<input type="button" class="btn btn-primary" value="Novo" id="novoProfessor"  />
			</div>

		</div>

	</form>




</body>
</html>