package br.com.residencia.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.contas.Conta;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.principal.Principal;

public class MenuGerente {
	static Integer inputOpcao;

	static Principal principal = new Principal();
	
	public static void menuGerente(Gerente gerente)
			throws InputMismatchException, NullPointerException, ContaException {

	try {
		System.out.println(gerente.getTipoUsuario() + " " + gerente.getNome());
		System.out.println("Escolha uma opção:");
		System.out.println("[1] Lista de clientes");
		System.out.println("[2] Relatório individual de clientes");
		System.out.println("[3] Sair");
		inputOpcao = Integer.parseInt(Principal.sc.next());
		
		switch (inputOpcao) {
		case 1:
			Principal.contas(gerente);
			menuGerente(gerente);
			principal.pulaLinha();
			break;
		case 2:
			Principal.relarotio(gerente);
			menuGerente(gerente);
			principal.pulaLinha();
			
			break;
		case 3:
			principal.limpaTela();
			principal.menuInterativo();
			break;
		default:
			
			System.out.println("Opção inválida!");
			
		}
		
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
		menuGerente(gerente);
	}
	
	}
}
