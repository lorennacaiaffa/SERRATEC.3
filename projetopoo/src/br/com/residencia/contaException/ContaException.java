package br.com.residencia.contaException;

public class ContaException extends Exception {
	
	public ContaException() {
		super();
	}

	public ContaException(String message) {
		super(message);
	}

	public ContaException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContaException(Throwable cause) {
		super(cause);
	}

	protected ContaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
