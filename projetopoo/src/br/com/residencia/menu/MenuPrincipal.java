package br.com.residencia.menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.model.Usuario;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.principal.Principal;

public class MenuPrincipal {
	double inputValor;
	static String inputCpf;
	int operacao;
	static Integer inputAgencia, inputConta;

	public static void menuPrincipal(Cliente usuario, Conta conta)
			throws InputMismatchException, NullPointerException, ContaException, IOException {
		Principal principal = new Principal();

		try {

			principal.pulaLinha();
			
			System.out.println("[1]\tSaldo");
			System.out.println("[2]\tSaque");
			System.out.println("[3]\tDeposito");
			System.out.println("[4]\tTransferencia");
			System.out.println("[5]\tSair");
			principal.imprimeLinhaHorizontal();

			System.out.print("Digite a opção desejada: ");
			int opcaoOperacao = Principal.sc.nextInt();
			Double inputValor;

			switch (opcaoOperacao) {
			case 1:
				principal.imprimeLinhaHorizontal();
				System.out.println(conta.getSaldo());				
			case 2:
				principal.imprimeLinhaHorizontal();
				System.out.print("Digite o valor que deseja sacar: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				conta.sacar(inputValor);

				LeituraEscrita.comprovanteSaque(conta, inputValor);

				principal.pulaLinha();

				break;
			case 3:
				principal.imprimeLinhaHorizontal();
				System.out.print("Digite o valor que deseja depositar: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				conta.depositar(inputValor);

				LeituraEscrita.comprovanteDeposito(conta, inputValor);

				principal.pulaLinha();

				break;
			case 4: 
				principal.imprimeLinhaHorizontal();
				System.out.print("Digite a agencia destinatária: ");		
				inputAgencia = Integer.parseInt(Principal.sc.next());		
				System.out.print("\nDigite a conta destinátaria: ");
				inputConta = Integer.parseInt(Principal.sc.next());
				System.out.print("\nDigite a quantia que deseja transferir: ");
				inputValor = Double.parseDouble(Principal.sc.next());
				
				Conta contaDestino = Conta.mapaContas.get(inputConta);
				while (contaDestino == null) {					
				principal.imprimeLinhaHorizontal();
				System.out.println("Destinátario ou valor inválido.");
				System.out.print("Digite a agencia destinatária: ");		
				inputAgencia = Integer.parseInt(Principal.sc.next());		
				System.out.print("\nDigite a conta destinátaria: ");
				inputConta = Integer.parseInt(Principal.sc.next());
				System.out.print("\nDigite a quantia que deseja transferir: ");
				inputValor = Double.parseDouble(Principal.sc.next());
				
				contaDestino = Conta.mapaContas.get(inputConta);
				
				}
				
				conta.transferir(contaDestino, inputValor);
				conta.sacar(inputValor);
				
			case 5:
				principal.limpaTela();
				principal.menuInterativo();
				break;

			default:

				principal.pulaLinha();
				System.out.println("Opção inválida!");

			}

			menuPrincipal(usuario, conta);

		} catch (

		ContaException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuPrincipal(usuario, conta);
		}
	}
}