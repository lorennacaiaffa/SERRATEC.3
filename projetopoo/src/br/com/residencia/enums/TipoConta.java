package br.com.residencia.enums;

public enum TipoConta {
	CORRENTE("corrente", 1), POUPANCA("poupanca", 2);

	private final String tipoConta;
	private final Integer idConta;

	TipoConta(String tipoConta, Integer idConta) {
		this.tipoConta = tipoConta;
		this.idConta = idConta;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public Integer getIdConta() {
		return this.idConta;
	}
}
