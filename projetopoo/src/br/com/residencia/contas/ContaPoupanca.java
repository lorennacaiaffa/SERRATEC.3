package br.com.residencia.contas;

public class ContaPoupanca extends Conta {

	private Integer idContaPoupan�a;
	private Double rendimento;

	public ContaPoupanca(Integer idContaPoupan�a, Double rendimento) {
		super();
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
