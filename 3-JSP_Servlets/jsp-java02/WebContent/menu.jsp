<%@ page pageEncoding="UTF-8"%>
<nav class="navbar navbar-default" data-role="navigation">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse">
		</button>
		<a class="navbar-brand" href="/jsp/index.jsp">App</a>
	</div>
	<div class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"> Cadastro <b class="caret"></b>
			</a>
				<ul class="dropdown-menu">
					<li><a href="/jsp/cadastroUsuario.jsp">Usuário</a></li>
					<li><a href="/jsp/cadastroAluno.jsp">Aluno</a></li>
				</ul></li>
		</ul>
		<ul class="nav navbar-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"> Buscar <b class="caret"></b>
			</a>
				<ul class="dropdown-menu">
					<li><a href="/jsp/listarUsuario.jsp">Usuário</a></li>
					<li><a href="/jsp/ListarAluno.jsp">Aluno</a></li>
				</ul></li>
		</ul>
	</div>
</nav>