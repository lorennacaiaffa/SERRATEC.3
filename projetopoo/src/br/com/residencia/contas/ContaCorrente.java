package br.com.residencia.contas;

import java.util.HashMap;
import java.util.Map;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.enums.TipoConta;
import br.com.residencia.tributos.Tributo;

public class ContaCorrente extends Conta implements Tributo {

	private Integer idContaCorrente;
	private Double chequeEspecial;
	private Double taxa;

	private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
	private Double totalTributado = 0.0;

	public static Map<String, Conta> mapaContaCorrentes = new HashMap<>();
//	Set<Integer> agencias = new HashSet<>();

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

	public Integer getTotalSaques() {
		return totalSaques;
	}

	public void setTotalSaques(Integer totalSaques) {
		this.totalSaques = totalSaques;
	}

	public Integer getTotalDepositos() {
		return totalDepositos;
	}

	public void setTotalDepositos(Integer totalDepositos) {
		this.totalDepositos = totalDepositos;
	}

	public Integer getTotalTransferencias() {
		return totalTransferencias;
	}

	public void setTotalTransferencias(Integer totalTransferencias) {
		this.totalTransferencias = totalTransferencias;
	}

	public Double getTotalTributado() {
		return totalTributado;
	}

	public void setTotalTributado(Double totalTributado) {
		this.totalTributado = totalTributado;
	}

	@Override
	public void sacar(double valor) throws ContaException {
		if (valor < 0) {
			throw new ContaException("O valor digitado para saque é inválido!");
		} else {
			double valorTributado = tributarSaque(valor);
			if (this.getSaldo() - valorTributado >= 0) {
				this.setSaldo(this.getSaldo() - valorTributado);
				this.totalTributado += Tributo.SAQUE;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f%n", valor, "\n");
				System.out.printf("Taxa para saque: R$%.2f%n", Tributo.SAQUE, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");
				++totalSaques;
			} else {
				System.out.println("Valor digitado excede o saldo disponível!");
			}
		}
	}

	@Override
	public void depositar(double valor) throws ContaException {
		if (valor < 0) {
			throw new ContaException("O valor digitado para depósito é inválido!");
		} else {
			double valorTributado = tributarDeposito(valor);
			if (this.getSaldo() - Tributo.DEPOSITO >= 0) {
				this.saldo(this.getSaldo() + valorTributado);
				this.totalTributado += Tributo.DEPOSITO;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.printf("Valor depositado: R$%.2f%n", valor, "\n");
				System.out.printf("Taxa para depósito: R$%.2f%n", Tributo.DEPOSITO, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");
				++totalDepositos;
			}
		}
	}

	@Override
	public void transferir(Conta destino, double valor) throws ContaException {
		if (valor <= 0) {
			throw new ContaException("O valor digitado para transferência é inválido!");

		} else {

			double valorTributado = tributarTransferencia(valor);

			if (this.getSaldo() - valorTributado >= 0) {
				this.saldo(this.getSaldo() - valorTributado);
				destino.setSaldo(destino.getSaldo() + valor);
				this.totalTributado += Tributo.TRANSFERENCIA;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.println("--------------------------");
				System.out.println("Conta destinatária: ");
				System.out.printf("Agência: " + destino.getNumeroAgencia() + "\n");
				System.out.printf("Número: " + destino.getNumeroConta() + "\n");
				System.out.println("--------------------------");
				System.out.printf("Valor transferido: R$%.2f%n", valor, "\n");
				System.out.printf("Taxa para transferência: R$%.2f%n", Tributo.TRANSFERENCIA, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");

				++totalTransferencias;
			} else {
				System.out.println("Valor digitado excede o saldo disponível!");
			}

		}

	}

	@Override
	public double tributarSaque(double valor) {
		return valor + Tributo.SAQUE;
	}

	@Override
	public double tributarDeposito(double valor) {
		return valor - Tributo.DEPOSITO;
	}

	@Override
	public double tributarTransferencia(double valor) {
		return valor + Tributo.TRANSFERENCIA;
	}

	@Override
	public String toString() {
		return "ContaCorrente [idContaCorrente=" + idContaCorrente + ", chequeEspecial=" + chequeEspecial + ", taxa="
				+ taxa + "]";
	}
}
