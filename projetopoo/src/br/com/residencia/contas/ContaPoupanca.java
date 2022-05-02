package br.com.residencia.contas;

import java.util.HashMap;
import java.util.Map;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.enums.TipoConta;

public class ContaPoupanca extends Conta {

	private Integer idContaPoupan�a;
	private Double rendimento;

	public static Map<String, Conta> mapaContaPoupancas = new HashMap<>();

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

	@Override
	public void sacar(double valor) throws ContaException {
		if (valor <= 0) {

			throw new ContaException("O valor digitado para saque � inv�lido!");

		} else {

			if (this.getSaldo() > 0 && this.getSaldo() >= valor) {

				this.setSaldo(this.getSaldo() - valor);

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f%n", valor, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");

				// LeituraEscrita.comprovanteSaque(usuario, valor);
			} else {
				System.out.println("Valor digitado excede o saldo dispon�vel!");
			}

		}

	}

	@Override
	public void depositar(double valor) throws ContaException {
		if (valor < 0) {

			throw new ContaException("O valor digitado para dep�sito � inv�lido!");

		} else {

			this.setSaldo(this.getSaldo() + valor);

			// Usamos printf para limitar as casas decimais
			System.out.println("\nOpera��o realizada com sucesso!\n");
			System.out.printf("Valor depositado: R$%.2f%n", valor, "\n");
			System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");
		}
		
	}

	@Override
	public void transferir(Conta destino, double valor) throws ContaException {
		if (valor < 0) {

			throw new ContaException("O valor digitado para transfer�ncia � inv�lido!");

		} else {

			if (this.getSaldo() >= 0 && this.getSaldo() >= valor) {

				this.saldo(this.getSaldo() - valor);
				destino.saldo(this.getSaldo() + valor);

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.println("--------------------------");
				System.out.println("Conta destinat�ria: ");
				System.out.printf("Ag�ncia: " + destino.getNumeroAgencia() + "\n");
				System.out.printf("N�mero: " + destino.getNumeroConta() + "\n");
				System.out.println("--------------------------");
				System.out.printf("Valor transferido: R$%.2f%n", valor, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.getSaldo(), "\n");
			} else {
				System.out.println("Valor digitado excede o saldo dispon�vel!");
			}

		}

	}
	@Override
	public String toString() {
		return "ContaPoupanca \nidContaPoupan�a: " + idContaPoupan�a + "rendimento: " + rendimento + 
				"\nidConta: " + getIdConta() + "\nnumeroAgencia: " + getNumeroAgencia()+ "\nnumeroConta: " + getNumeroConta()+ 
				"\nsaldo: " + getSaldo() + "\ndataAbertura: " + getDataAbertura();
	}

}
