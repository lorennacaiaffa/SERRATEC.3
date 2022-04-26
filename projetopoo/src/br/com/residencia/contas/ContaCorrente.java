package br.com.residencia.contas;

import br.com.residencia.enums.TipoConta;

public class ContaCorrente extends Conta {

	private Integer idContaCorrente;
	private Double chequeEspecial;
	private Double taxa;

	public ContaCorrente(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status, Integer idContaCorrente, Double chequeEspecial,
			Double taxa) {
		super(tipo, idConta, senhaConta, numeroAgencia, numeroConta, saldo, dataAbertura, status);
		this.idContaCorrente = idContaCorrente;
		this.chequeEspecial = chequeEspecial;
		this.taxa = taxa;
	}

	public ContaCorrente() {

	}

	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

}
