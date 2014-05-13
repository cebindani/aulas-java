<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>

<%@include file="header.jsp"%>
<title>Incluir aluno</title>
<script type="text/javascript">
	$(document).ready(function() {
		$('#voltar').click(function() {
			window.location = "/jsp/listagemAluno.jsp";
		});
	});
</script>


</head>
<body>
	<%@include file="menu.jsp"%>
	<div>
		<form action="/jsp/cadastroAluno" method="POST">
			<h1>Alunos</h1>
			<div class="well conteudo">
				<fieldset>
					<div class="input-group">
						<label for="nome">Nome: </label> <input type="text"
							class="form-control" id="nome" name="nome" />
					</div>
					<div class="input-group">
						<label for="dataNascimento">Data de nascimento: </label> <input
							type="text" class="form-control" id="dataNascimento"
							name="dataNascimento" />
					</div>
					<div class="input-group">
						<label for="telefone">Telefone: </label> <input type="text"
							class="form-control" id="telefone" name="telefone" />
					</div>

					<div class="app-buttons">
						<input type="submit" class="btn btn-success" value="Gravar" /> <input
							id="voltar" type="button" class="btn btn-primary" value="Voltar">
					</div>

				</fieldset>
			</div>
		</form>
	</div>

</body>
</html>