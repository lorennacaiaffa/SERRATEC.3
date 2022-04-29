package br.com.residencia.principal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.contas.Conta;
import br.com.residencia.menu.MenuPrincipal;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Pessoa;

public class Principal {
	
public char operacao;
	public double valor;
	public String inputCpf;
	public String inputSenha;
	public static Scanner sc = new Scanner(System.in); 
	

	public void menuInterativo() throws ContaException, NullPointerException, InputMismatchException {
		try {

			imprimeLinhaHorizontal();
			
			System.out.println("========== Bem-vindo(a) ao <Heli/Code> ========\n");
			System.out.print("Digite seu CPF: ");
			inputCpf = sc.next();
			System.out.print("Digite sua senha: ");
			inputSenha = sc.next();

			Pessoa usuario = Pessoa.mapaPessoas.get(inputCpf);

			Conta conta = Conta.mapaContas.get(inputCpf);
			
			while (usuario == null || !(usuario.equals(inputSenha))) {
				System.out.println("CPF e/ou Senha incorreto(s)\n\n");

				System.out.print("Digite seu CPF: ");
				inputCpf = sc.next();
				System.out.print("Digite sua senha: ");
				inputSenha = sc.next();

				usuario = Pessoa.mapaPessoas.get(inputCpf);
				
				conta = Conta.mapaContas.get(inputCpf);

			}

			limpaTela();
			subMenu(usuario, conta);

			imprimeLinhaHorizontal();

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuInterativo();
		}
		sc.close();
	}

	// SUBMENU
	public void subMenu(Pessoa usuario, Conta conta)
			throws ContaException, NullPointerException, InputMismatchException, IOException {

		try {

			imprimeLinhaHorizontal();
			System.out.println("Bem-vindo(a) a sua conta digital, " + usuario.getNome() + "!\n" + conta.getSaldo());
			imprimeLinhaHorizontal();
			System.out.println("Digite o n�mero correspondente � opera��o desejada :");

			MenuPrincipal.menuPrincipal(usuario, conta);

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			subMenu(usuario, conta);
		}
	
	MenuPrincipal.menuPrincipal(usuario, conta);
	}
	
	public void pulaLinha() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}

	public void limpaTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	public void imprimeLinhaHorizontal() {
		System.out.println("--------------------------------------------------");
	}
}
