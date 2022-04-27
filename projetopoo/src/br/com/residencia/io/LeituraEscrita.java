package br.com.residencia.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.residencia.agencias.Agencia;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enderecos.Endereco;
import br.com.residencia.enums.TipoConta;
import br.com.residencia.enums.TipoUsuario;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.pessoas.Presidente;

public class LeituraEscrita {
	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";

	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nome = sc.nextLine();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome));
		System.out.println("Escreva algo: ");
		while (true) {
			String linha = sc.nextLine();// pula a linha
			if (linha.equals("/fim"))
				break;
			buffWrite.append(linha);
			buffWrite.newLine();
		}

		buffWrite.close();
		sc.close();
	}

	public static void leitor(String path) throws IOException {

		List<ContaCorrente> contaCorrente = new ArrayList<>();
		List<ContaPoupanca> contaPoupanca = new ArrayList<>();
		List<Cliente> cliente = new ArrayList<>();
		List<Gerente> gerente = new ArrayList<>();
		List<Diretor> diretor = new ArrayList<>();
		List<Presidente> presidente = new ArrayList<>();
		List<Endereco> endereco = new ArrayList<>();
		List<Agencia> agencia = new ArrayList<>();

		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {

				String[] vetor = linha.split(";");

				if (vetor[0].equalsIgnoreCase("Corrente")) {
					contaCorrente.add(new ContaCorrente(TipoConta.CORRENTE, Integer.parseInt(vetor[1]), vetor[2], vetor[3], vetor[4], Double.parseDouble(vetor[5]), vetor[6], Boolean.parseBoolean(vetor[7]), Integer.parseInt(vetor[8]), Double.parseDouble(vetor[9]), Double.parseDouble(vetor[10])));
				} else if (vetor[0].equalsIgnoreCase("Poupanca")) {
					contaPoupanca.add(new ContaPoupanca(TipoConta.POUPANCA, Integer.parseInt(vetor[1]), vetor[2], vetor[3], vetor[4], Double.parseDouble(vetor[5]), vetor[6], Boolean.parseBoolean(vetor[7]), Integer.parseInt(vetor[8]), Double.parseDouble(vetor[9])));
				} else if (vetor[0].equalsIgnoreCase("Cliente")) {
					cliente.add(new Cliente(TipoUsuario.CLIENTE, vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]), Integer.parseInt(vetor[10]), Integer.parseInt(vetor[11]), vetor[12]));
				} else if (vetor[0].equalsIgnoreCase("Gerente")) {
					gerente.add(new Gerente(TipoUsuario.GERENTE, vetor[1],vetor[2], vetor[3], vetor[4],vetor[5], vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]), vetor[10], Double.parseDouble(vetor[11]), Integer.parseInt(vetor[12]),Integer.parseInt(vetor[13])));
				} else if (vetor[0].equalsIgnoreCase("Diretor")) {
					diretor.add(new Diretor(TipoUsuario.DIRETOR, vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]), vetor[10], Double.parseDouble(vetor[11]), Integer.parseInt(vetor[12]), Integer.parseInt(vetor[13])));
				} else if (vetor[0].equalsIgnoreCase("Presidente")) {
					presidente.add(new Presidente(TipoUsuario.PRESIDENTE, vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]), vetor[10], Double.parseDouble(vetor[11]), Integer.parseInt(vetor[12])));
				} else if (vetor[0].equalsIgnoreCase("Endereco")) {
					endereco.add(new Endereco(Integer.parseInt(vetor[1]), vetor[2], vetor[3], Integer.parseInt(vetor[4]), vetor[5], vetor[6], vetor[7], vetor[8]));
				} else if (vetor[0].equalsIgnoreCase("Agencia")) {
					agencia.add(new Agencia(Integer.parseInt(vetor[1]), Integer.parseInt(vetor[2]), Integer.parseInt(vetor[3]), Integer.parseInt(vetor[4])));
				} else {
					break;
				}

			}

		}
		buffRead.close();
	}
}
