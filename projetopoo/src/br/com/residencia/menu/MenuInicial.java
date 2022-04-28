package br.com.residencia.menu;

import java.util.Scanner;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.pessoas.Cliente;

public class MenuInicial {

	Scanner scan = new Scanner(System.in);
	Cliente clienteLogado = null;

		public void login() {
		String login, senha;
		
		do {
			System.out.println("\t\t\t===== Bem-vindo ao Banco <Heli/Code> =====\n");
			System.out.print("\t\t\tDigite seu CPF: ");
			login = scan.next();
			System.out.print("\t\t\tDigite sua senha: ");
			senha = scan.next();
			for(Cliente cliente : LeituraEscrita.clientes) {
				if(cliente.getCpf().equals(login) && cliente.senhaCliente().equals(senha)) {
					clienteLogado = cliente;
					System.out.println("Olá, " + cliente.getNome());
					break;
				}
			}
			if(clienteLogado == null) {
				System.out.println("CPF ou senha inválidos");
			}
			
			System.out.println("\n\t\t*********************************************************\n");
		} while (clienteLogado == null);

		menu();
		
		
//		switch(clienteLogado.getTipoUsuario()) {
//		}
		}

	

		public void menu() {
			int resp;
			Conta contaCorrente = new ContaCorrente();
			Conta contaPoupanca = new ContaPoupanca();
			do {
				System.out.println("\t\t\t\tEscolha uma opção:\n");
				System.out.println("\t[1] Saldo\t[2] Sacar\t[3] Depositar\t[4]Transferir\t[5] Sair");
				resp = scan.nextInt();
				

				switch (resp) { // Saldo. O sistema deverá imprimir o saldo na tela do terminal; 

				case 1: {

					if (clienteLogado.getIdConta().equals(contaCorrente.getIdConta())) 
						System.out.println(contaCorrente.getSaldo());
					if (clienteLogado.getIdConta().equals(contaPoupanca.getIdConta()))
						System.out.println(contaPoupanca.getSaldo());
				break;
				}
				case 2: {
					if (clienteLogado.getIdConta().equals(contaCorrente.getIdConta())) 
							contaCorrente.sacar(resp);
				
					if (clienteLogado.getIdConta().equals(contaPoupanca.getIdConta()))
							contaPoupanca.sacar(resp);
				
					break;
				}
				case 3: {
					if (clienteLogado.getIdConta().equals(contaCorrente.getIdConta())) 
						contaCorrente.depositar(resp);
			
				if (clienteLogado.getIdConta().equals(contaPoupanca.getIdConta()))
						contaPoupanca.depositar(resp);
					break;
				}
				case 4: {
//					if (usuarioLogado.getIdConta().equals(contaCorrente.getIdConta())) 
//						contaCorrente.transferir(resp);
//			
//				if (usuarioLogado.getIdConta().equals(contaPoupanca.getIdConta()))
//						contaPoupanca.transferir(resp);
//					break;
				}
				case 5: {
				break;
				}
				

				}
				if (resp < 0 || resp > 5) {
					System.out.println("Escolha uma opção válida.");
				}

			} while (resp < 0 || resp > 5);

			scan.close();

		}
	}