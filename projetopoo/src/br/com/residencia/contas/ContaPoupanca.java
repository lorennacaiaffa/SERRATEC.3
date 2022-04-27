package br.com.residencia.contas;

import br.com.residencia.enums.TipoConta;

public class ContaPoupanca extends Conta {

	private Integer idContaPoupan�a;
	private Double rendimento;

	public ContaPoupanca(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status, Integer idContaPoupan�a, Double rendimento) {
		super(tipo, idConta, senhaConta, numeroAgencia, numeroConta, saldo, dataAbertura, status);
		this.idContaPoupan�a = idContaPoupan�a;
		this.rendimento = rendimento;
	}

	public ContaPoupanca() {

	}

	public Integer getIdContaPoupan�a() {
		return idContaPoupan�a;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

}
