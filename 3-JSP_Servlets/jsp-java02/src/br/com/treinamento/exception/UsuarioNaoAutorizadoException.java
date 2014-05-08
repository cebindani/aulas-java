package br.com.treinamento.exception;

public class UsuarioNaoAutorizadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsuarioNaoAutorizadoException() {
		super();

	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause) {
		super(message, cause);

	}

	public UsuarioNaoAutorizadoException(String message) {
		super(message);

	}

	public UsuarioNaoAutorizadoException(Throwable cause) {
		super(cause);

	}

}
