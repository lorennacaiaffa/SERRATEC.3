package br.com.residencia.contas;

import java.util.HashMap;
import java.util.Map;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.enums.TipoConta;

public class ContaPoupanca extends Conta {

	private Integer idContaPoupança;
	private Double rendimento;

	public static Map<String, Conta> mapaContaPoupancas = new HashMap<>();

	public ContaPoupanca(TipoConta tipo, Integer idConta, String senhaConta, String numeroAgencia, String numeroConta,
			Double saldo, String dataAbertura, Boolean status, Integer idContaPoupança, Double rendimento) {
		super(tipo, idConta, senhaConta, numeroAgencia, numeroConta, saldo, dataAbertura, status);
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

	@Override
	public void sacar(double valor) throws ContaException {
		if (valor <= 0) {

			throw new ContaException("O valor digitado para saque é inválido!");

		} else {

			if (this.getSaldo() > 0 && this.getSaldo() >= valor) {

				this.setSaldo(this.getSaldo() - valor);

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f%n", valor, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");

				// LeituraEscrita.comprovanteSaque(usuario, valor);
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

			this.setSaldo(this.getSaldo() + valor);

			// Usamos printf para limitar as casas decimais
			System.out.println("\nOperação realizada com sucesso!\n");
			System.out.printf("Valor depositado: R$%.2f%n", valor, "\n");
			System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");
		}
		
	}

	@Override
	public void transferir(Conta destino, double valor) throws ContaException {
		if (valor < 0) {

			throw new ContaException("O valor digitado para transferência é inválido!");

		} else {

			if (this.getSaldo() >= 0 && this.getSaldo() >= valor) {

				this.saldo(this.getSaldo() - valor);
				destino.saldo(this.getSaldo() + valor);

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.println("--------------------------");
				System.out.println("Conta destinatária: ");
				System.out.printf("Agência: " + destino.getNumeroAgencia() + "\n");
				System.out.printf("Número: " + destino.getNumeroConta() + "\n");
				System.out.println("--------------------------");
				System.out.printf("Valor transferido: R$%.2f%n", valor, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");
			} else {
				System.out.println("Valor digitado excede o saldo disponível!");
			}

		}

	}
	@Override
	public String toString() {
		return "ContaPoupanca \nidContaPoupança: " + idContaPoupança + "rendimento: " + rendimento + 
				"\nidConta: " + getIdConta() + "\nnumeroAgencia: " + getNumeroAgencia()+ "\nnumeroConta: " + getNumeroConta()+ 
				"\nsaldo: " + getSaldo() + "\ndataAbertura: " + getDataAbertura();
	}

}
