package br.com.residencia.principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.residencia.agencias.Agencia;
import br.com.residencia.contaException.ContaException;
import br.com.residencia.contas.Conta;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.menu.MenuDiretor;
import br.com.residencia.menu.MenuGerente;
import br.com.residencia.menu.MenuPrincipal;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.pessoas.Funcionario;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.pessoas.Presidente;

public class Principal {

	public char operacao;
	public double valor;
	public String inputCpf;
	public String inputSenha;
	private Diretor diretor;
	private Cliente usuario;
	private Presidente presidente;

	public static Scanner sc = new Scanner(System.in);
	private Gerente gerente;

	public void menuInterativo() throws ContaException, NullPointerException, InputMismatchException {
		try {

			imprimeLinhaHorizontal();
			System.out.print("Digite seu CPF: ");
			inputCpf = sc.next();
			System.out.print("Digite sua senha: ");
			inputSenha = sc.next();

			usuario = Cliente.mapaClientes.get(inputCpf);
			Conta conta = Conta.mapaContas.get(inputCpf);
			if (usuario.getSenhaCliente().equals(inputSenha)) {

				while (usuario == null && !(usuario.getSenhaCliente().equals(inputSenha))) {

					System.out.println("CPF e/ou Senha incorreto(s)\n\n");
					System.out.print("Digite seu CPF: ");
					inputCpf = sc.next();
					System.out.print("Digite sua senha: ");
					inputSenha = sc.next();

					usuario = Cliente.mapaClientes.get(inputCpf);
					conta = Conta.mapaContas.get(inputCpf);
				}

				limpaTela();
				subMenu(usuario, conta);

			}

			gerente = Gerente.mapaGerentes.get(inputCpf);
			if ("1234".equals(inputSenha) || "1867".equals(inputSenha) || "6894".equals(inputSenha)
					|| "1380".equals(inputSenha)) {
				while (gerente == null && !gerente.getSenha().equals(inputSenha)) {

					System.out.println("CPF e/ou Senha incorreto(s)\n\n");

					System.out.print("Digite seu CPF: ");
					inputCpf = sc.next();
					System.out.print("Digite sua senha: ");
					inputSenha = sc.next();

				}
				gerente = Gerente.mapaGerentes.get(inputCpf);
				MenuGerente.menuGerente(gerente);

				limpaTela();
			}
			diretor = Diretor.mapaDiretores.get(inputCpf);
			if ("6843".equals(inputSenha) || "1223".equals(inputSenha)) {
				while (diretor == null && !(diretor.getSenha().equals(inputSenha))) {
					System.out.println("CPF e/ou Senha incorreto(s)\n\n");

					System.out.print("Digite seu CPF: ");
					inputCpf = sc.next();
					System.out.print("Digite sua senha: ");
					inputSenha = sc.next();

					diretor = Diretor.mapaDiretores.get(inputCpf);
				}
				MenuDiretor.menuDiretor(diretor);
				limpaTela();
			}
			presidente = Presidente.mapaPresidentes.get(inputCpf);
			if (presidente.getSenha().equals(inputSenha)) {
				while (presidente == null && !(presidente.getSenha().equals(inputSenha))) {
					System.out.println("CPF e/ou Senha incorreto(s)\n\n");

					System.out.print("Digite seu CPF: ");
					inputCpf = sc.next();
					System.out.print("Digite sua senha: ");
					inputSenha = sc.next();

					presidente = Presidente.mapaPresidentes.get(inputCpf);
				}
				System.out.println(presidente.getNome());
				limpaTela();

			}

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
	public void subMenu(Cliente usuario, Conta conta)
			throws ContaException, NullPointerException, InputMismatchException, IOException {

		try {

			imprimeLinhaHorizontal();
			System.out.println("Bem-vindo(a) ao seu Banco, " + usuario.getNome() + "!\n");
			imprimeLinhaHorizontal();
			System.out.println("Digite o número correspondente à operação desejada:");

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

	public static void limpaTela() {
		for (int i = 0; i < 2; i++) {
			System.out.println();
		}
	}

	public void imprimeLinhaHorizontal() {
		System.out.println("_________________________________");
	}

	public static void inciarLeituraCliente() throws IOException {
		LeituraEscrita.leitor("entrada.txt");
		List<Cliente> clientes = LeituraEscrita.juvenal();
		List<Conta> contas = LeituraEscrita.juvenal2();
	}

	public static void inciarLeituraAgencia() throws IOException {
		LeituraEscrita.leitor("entrada.txt");
		List<Agencia> agencias = LeituraEscrita.juvenal3();
	}

	public static void inciarLeituraFuncionario() throws IOException {
		LeituraEscrita.leitor("entrada.txt");
		List<Funcionario> funcionarios = LeituraEscrita.juvenal4();
	}

	public static Integer contas(Gerente gerente) throws IOException {

		Principal.inciarLeituraCliente();
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Cliente> lista1 = LeituraEscrita.juvenal();
		for (Cliente cliente : lista1) {
			if (gerente.getIdGerente() == cliente.getIdGerente()) {
				listaClientes.add(cliente);
			}
		}
		for (int i = 0; i < listaClientes.size() / 2; i++) {
			System.out.println(listaClientes.get(i));
			System.out.println("____________________________");
		}
		return (int) listaClientes.stream().count();
	}

	public static Integer relarotio(Gerente gerente) throws IOException {

		Principal.inciarLeituraCliente();
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Cliente> lista1 = LeituraEscrita.juvenal();
		List<Conta> listaContas = new ArrayList<Conta>();
		List<Conta> lista2 = LeituraEscrita.juvenal2();
		for (Cliente cliente : lista1) {
			if (gerente.getIdGerente() == cliente.getIdGerente()) {
				listaClientes.add(cliente);
			}

			for (Conta conta : lista2) {
				if (cliente.getIdConta() == conta.getIdConta()) {
					listaContas.add(conta);

				}
			}
		}
		if (gerente.getIdGerente() == 1) {
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(0));
			System.out.println(listaContas.get(0));
			System.out.println("\n________________________________________");

			System.out.println(listaClientes.get(1));
			System.out.println(listaContas.get(4));
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(2));
			System.out.println(listaContas.get(8));
			limpaTela();
		} else if (gerente.getIdGerente() == 2) {
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(0));
			System.out.println(listaContas.get(1));
			System.out.println("\n________________________________________");

			System.out.println(listaClientes.get(1));
			System.out.println(listaContas.get(5));
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(2));
			System.out.println(listaContas.get(9));
			limpaTela();
		} else if (gerente.getIdGerente() == 3) {
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(0));
			System.out.println(listaContas.get(2));
			System.out.println("\n________________________________________");

			System.out.println(listaClientes.get(1));
			System.out.println(listaContas.get(6));
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(2));
			System.out.println(listaContas.get(10));
			limpaTela();

		} else if (gerente.getIdGerente() == 4) {
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(0));
			System.out.println(listaContas.get(3));
			System.out.println("\n________________________________________");

			System.out.println(listaClientes.get(1));
			System.out.println(listaContas.get(7));
			System.out.println("\n________________________________________");
			System.out.println(listaClientes.get(2));
			System.out.println(listaContas.get(11));
			limpaTela();
		}

		return (int) listaClientes.stream().count();

	}

	public static List<Gerente> escolhaGerente(Diretor diretor) throws IOException {
		Integer opcao;

		Principal.inciarLeituraFuncionario();
		List<Gerente> listaGerentes = new ArrayList<Gerente>();
		List<Gerente> lista1 = LeituraEscrita.juvenal5();
		List<Agencia> listaAgencias = new ArrayList<Agencia>();
		List<Agencia> lista2 = LeituraEscrita.juvenal3();
		for (Agencia agencia : lista2) {
			if (agencia.getIdDiretor() == diretor.getIdDiretor());
			listaAgencias.add(agencia);
			for (Gerente gerente : lista1) {
				if (gerente.getIdAgencia() == agencia.getIdAgencia()){
					listaGerentes.add(gerente);
				}
			}
			}
		for (int i = 0; i < listaGerentes.size() / 2; i = i + 4) {
			System.out.println(listaGerentes.get(i));
		}
		System.out.println("Digite o Id do gerente: ");
		opcao = Integer.parseInt(Principal.sc.next());
		switch (opcao) {
		case 1:
//			contas(listaGerentes.get(0));
			System.out.println(listaGerentes.size());
			System.out.println(listaGerentes);
		case 2:
			contas(listaGerentes.get(2));
		
		default:
			System.out.println("Opção inválida!");
		}

		return listaGerentes;
	}

}
