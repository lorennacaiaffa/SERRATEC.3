package br.com.residencia.operacoes;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.contas.Conta;

    public interface Operacoes {

	void sacar(double valor) throws ContaException;

	void depositar(double valor) throws ContaException;

	void transferir(Conta destino, double valor) throws ContaException;

}