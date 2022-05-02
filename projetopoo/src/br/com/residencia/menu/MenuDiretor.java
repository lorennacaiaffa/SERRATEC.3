package br.com.residencia.menu;

import java.util.InputMismatchException;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.principal.Principal;

public class MenuDiretor {

	static Integer inputOpcao;

	static LeituraEscrita leituraEscrita = new LeituraEscrita();
	static Principal principal = new Principal();

	public static void menuDiretor(Diretor diretor)
			throws InputMismatchException, NullPointerException, ContaException {

		try {
			System.out.println(diretor.getTipoUsuario() + ": " + diretor.getNome());
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Lista de clientes dos gerentes");
			System.out.println("[2] Relatório individual de clientes dos gerentes");
			System.out.println("[3] Sair");
			inputOpcao = Integer.parseInt(Principal.sc.next());

			switch (inputOpcao) {
			case 1:
				Principal.escolhaGerente(diretor);
				
				principal.pulaLinha();
				break;
			case 2:
//				Principal.relarotio(gerente);
//				menuGerente(gerente);
//				principal.pulaLinha();
				
				break;
			case 3:
				principal.limpaTela();
				principal.menuInterativo();
				break;
			default:
				
				System.out.println("Opção inválida!");
				
			}

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuDiretor(diretor);
		}
	}
}
