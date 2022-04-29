package br.com.residencia.menu;

import java.io.IOException;
import java.util.InputMismatchException;

import br.com.residencia.contaException.ContaException;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enums.TipoConta;
import br.com.residencia.enums.TipoUsuario;
import br.com.residencia.io.LeituraEscrita;
import br.com.residencia.model.Usuario;
import br.com.residencia.principal.Principal;
import br.com.residencia.tributos.Tributo;

public class MenuRelatorio {
Principal principal = new Principal();
	int teste;
	int operacao;
	MenuPrincipal menuPrincipal = new MenuPrincipal();

	public static void menuRelatorio(Integer integer, Usuario usuario, Conta conta)
			throws IOException, InputMismatchException, NullPointerException, ContaException {

		Principal principal = new Principal();

		principal.pulaLinha();

		if (conta.getTipo().equals(TipoConta.CORRENTE)) {
			System.out.println("[1]\tTributação conta corrente");
		} else {
			System.out.println("[1]\tSimulacao de rendimento");
		}
		if (integer >= 2) {
			System.out.println("[2]\tNúmero de contas da sua agencia");
		}
		System.out.println("[3]\tVoltar");
		imprimeLinhaHorizontal();

		System.out.print("Digite a opção desejada: ");
		int operacao = Principal.sc.nextInt();

		principal.pulaLinha();

		switch (operacao) {

		case 1:

			if (conta.getTipo().equals(TipoConta.CORRENTE.getTipoConta())) {

				System.out.printf("O total gasto com operações foi de R$%.2f%n",
						((ContaCorrente) conta).getTotalTributado());
				System.out.printf("O valor cobrado para cada saque é de R$%.2f%n", Tributo.SAQUE);
				System.out.println("Total de saques realizados: " + ((ContaCorrente) conta).getTotalSaques());
				System.out.printf("O valor cobrado para cada deposito é de R$%.2f%n", Tributo.DEPOSITO);
				System.out.println("Total de depósitos realizados: " + ((ContaCorrente) conta).getTotalDepositos());
				System.out.printf("O valor cobrado para cada tranferência é de R$%.2f%n", Tributo.TRANSFERENCIA);
				System.out.println(
						"Total de transferências realizadas: " + ((ContaCorrente) conta).getTotalTransferencias());

				//LeituraEscrita.relatorioTributacaoContaCorrente(conta);

			} else {

				int inputDias;
				double inputValor;

				System.out.println("Digite o valor que deseja usar para a simulação: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				System.out.println("Digite o número de dias para a simulação: ");
				inputDias = Principal.sc.nextInt();

			//	((ContaPoupanca) conta).previsaoDeRendimento(inputValor, inputDias);

				//LeituraEscrita.relatorioRendimentoPoupanca(conta, inputValor, inputDias);

			}

			selecaoRelatorio(conta, usuario);

			break;

		case 2:

			int total = 0;
			for (String cpf : Conta.mapaContas.keySet()) {
				if (Conta.mapaContas.get(cpf).getNumeroAgencia().equals(conta.getNumeroAgencia())) {

					System.out.println(Conta.mapaContas.get(cpf));
					total++;
				}

			}
			System.out.println("Total de contas: " + total);

			LeituraEscrita.relatorioContasPorAgencia(conta);

			selecaoRelatorio(conta, usuario);

			break;

		case 3:

			principal.limpaTela();
		//	MenuPrincipal.menuPrincipal(usuario, conta);
			break;

		default:

			principal.pulaLinha();
			System.out.println("Opção inválida!");
			selecaoRelatorio(conta, usuario);

		}

	}

	public static void selecaoRelatorio(Conta conta, Usuario usuario)
			throws InputMismatchException, NullPointerException, ContaException, IOException {

		if (usuario.getTipo().equals(TipoUsuario.CLIENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(TipoUsuario.CLIENTE.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getTipo().equals(TipoUsuario.GERENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(TipoUsuario.GERENTE.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getTipo().equals(TipoUsuario.DIRETOR.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(TipoUsuario.DIRETOR.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getTipo().equals(TipoUsuario.PRESIDENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(TipoUsuario.PRESIDENTE.getIdTipoUsuario(), usuario, conta);
		}
	}

	public static void imprimeLinhaHorizontal() {
		System.out.println("--------------------------------------------------");
	}

}

