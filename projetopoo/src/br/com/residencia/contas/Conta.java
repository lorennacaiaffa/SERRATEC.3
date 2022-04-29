package br.com.residencia.contas;


import java.util.HashMap;
import java.util.Map;
import br.com.residencia.enums.TipoConta;
import br.com.residencia.operacoes.Operacoes;

public abstract class Conta implements Operacoes {

	private TipoConta tipo;
	private Integer idConta;
	private String senhaConta;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;
	private String dataAbertura;
	private Boolean status;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();
//	Set<Integer> agencias = new HashSet<>();

	public Conta(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status) {
		super();
		this.tipo = tipo;
		this.idConta = idConta;
		this.senhaConta = senhaConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.setSaldo(saldo);
		this.dataAbertura = dataAbertura;
		this.status = status;
	}

	public Conta() {

	}

	public TipoConta getTipo() {
		return tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public String getSenha() {
		return senhaConta;
	}

	public void setSenha(String senhaConta) {
		this.senhaConta = senhaConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setSatatus(Boolean status) {
		this.status = status;
	}

	public Double saldo(double saldo) {
		return this.getSaldo();
	}

	@Override
	public String toString() {
		return "Conta [tipo=" + tipo + ", idConta=" + idConta + ", senhaConta=" + senhaConta + ", numeroAgencia="
				+ numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + getSaldo() + ", dataAbertura=" + dataAbertura
				+ ", status=" + status + "]";
	}

}