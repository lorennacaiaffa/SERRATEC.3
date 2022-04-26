package br.com.residencia.contas;

public class ContaPoupanca extends Conta {

	private Integer idContaPoupança;
	private Double rendimento;

	public ContaPoupanca(Integer idContaPoupança, Double rendimento) {
		super();
		this.idContaPoupança = idContaPoupança;
		this.rendimento = rendimento;
	}

	public ContaPoupanca() {

	}

	public Integer getIdContaPoupança() {
		return idContaPoupança;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

}
