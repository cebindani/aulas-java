<%@page import="br.com.dxt.services.AlunoService"%>
<%@page import="java.util.List"%>
<%@ page import="br.com.dxt.domain.Aluno"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>

<%@include file="header.jsp"%>
<title>Listar aluno</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#novoAluno').click(function() {
			window.location = "/jsp/cadastroAluno.jsp";
		});
	});
</script>


</head>
<body>
	<%@include file="menu.jsp"%>

	<form>
		<h1>Alunos</h1>
		<div class="well conteudo">
			<table class="table table-hover">
				<thead>
					<th>Nome</th>
					<th>Data nascimento</th>
				</thead>
				<%
					AlunoService service = new AlunoService();
					List<Aluno> alunos = service.buscarAlunos();

					for (Aluno aluno : alunos) {
				%>
				<tbody>
					<tr>
						<td><%=aluno.getNome()%></td>
						<td><%=aluno.getData_nasc()%></td>
					</tr>
					<%
						}
					%>

				</tbody>
			</table>
			<div class="app-buttons">
				<input type="button" class="btn btn-primary" value="Novo" id="novoAluno"  />
			</div>

		</div>

	</form>




</body>
</html>