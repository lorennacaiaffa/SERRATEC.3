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

	public static List<Cliente> clientes = new ArrayList<>();
	public static List<ContaCorrente> contaCorrentes = new ArrayList<>();
	public static List<ContaPoupanca> contaPoupancas = new ArrayList<>();
	public static List<Gerente> gerentes = new ArrayList<>();
	public static List<Diretor> diretores = new ArrayList<>();
	public static List<Presidente> presidentes = new ArrayList<>();
	public static List<Endereco> enderecos = new ArrayList<>();
	public static List<Agencia> agencias = new ArrayList<>();

	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nome = sc.nextLine();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome));
		System.out.println("Escreva algo: ");
		while (true) {
			String linha = sc.nextLine();
			if (linha.equals("/fim"))
				break;
			buffWrite.append(linha);
			buffWrite.newLine();
		}

		buffWrite.close();
		sc.close();
	}

	public static void leitor(String path) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";
		

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] vetor = linha.split(";");
//				List<String> lista = new ArrayList<>();
//				for(int i = 0; i < vetor.length; i ++) {
//				lista.add(vetor[i]);
//				}
//					
//				if (lista.get(0).equalsIgnoreCase("Corrente")) {
//					contaCorrente.add(new ContaCorrente(TipoConta.CORRENTE, Integer.parseInt(lista.get(1)), lista.get(2), lista.get(3), lista.get(4), Double.parseDouble(lista.get(5)), lista.get(6), Boolean.parseBoolean(lista.get(7)), Integer.parseInt(lista.get(8)), Double.parseDouble(lista.get(9)), null));
//					lista.clear();
				
				if (vetor[0].equalsIgnoreCase("Corrente")) {
					contaCorrentes.add(new ContaCorrente(TipoConta.CORRENTE, Integer.parseInt(vetor[1]), vetor[2],
							vetor[3], vetor[4], Double.parseDouble(vetor[5]), vetor[6], Boolean.parseBoolean(vetor[7]),
							Integer.parseInt(vetor[8]), Double.parseDouble(vetor[9]), Double.parseDouble(vetor[10])));
				} else if (vetor[0].equalsIgnoreCase("Poupanca")) {
					contaPoupancas.add(new ContaPoupanca(TipoConta.POUPANCA, Integer.parseInt(vetor[1]), vetor[2],
							vetor[3], vetor[4], Double.parseDouble(vetor[5]), vetor[6], Boolean.parseBoolean(vetor[7]),
							Integer.parseInt(vetor[8]), Double.parseDouble(vetor[9])));
				} else if (vetor[0].equalsIgnoreCase("Cliente")) {
					clientes.add(new Cliente(TipoUsuario.CLIENTE, vetor[1], vetor[2], vetor[3], vetor[4], vetor[5],
							vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]),
							Integer.parseInt(vetor[10]), Integer.parseInt(vetor[11]), vetor[12]));
				} else if (vetor[0].equalsIgnoreCase("Gerente")) {

					gerentes.add(new Gerente(TipoUsuario.GERENTE, vetor[1], vetor[2], vetor[3], vetor[4], vetor[5],
							vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]),
							vetor[10], Double.parseDouble(vetor[11]), Integer.parseInt(vetor[12]),
							Integer.parseInt(vetor[13])));

					gerente.add(new Gerente(TipoUsuario.GERENTE, vetor[1], vetor[2], vetor[3], vetor[4],vetor[5], vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]), vetor[10], Double.parseDouble(vetor[11]), Integer.parseInt(vetor[12]),Integer.parseInt(vetor[13])));

				} else if (vetor[0].equalsIgnoreCase("Diretor")) {
					diretores.add(new Diretor(TipoUsuario.DIRETOR, vetor[1], vetor[2], vetor[3], vetor[4], vetor[5],
							vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]), Integer.parseInt(vetor[9]),
							vetor[10], Double.parseDouble(vetor[11]), Integer.parseInt(vetor[12]),
							Integer.parseInt(vetor[13])));
				} else if (vetor[0].equalsIgnoreCase("Presidente")) {
					presidentes.add(new Presidente(TipoUsuario.PRESIDENTE, vetor[1], vetor[2], vetor[3], vetor[4],
							vetor[5], vetor[6], LocalDate.parse(vetor[7]), Integer.parseInt(vetor[8]),
							Integer.parseInt(vetor[9]), vetor[10], Double.parseDouble(vetor[11]),
							Integer.parseInt(vetor[12])));
				} else if (vetor[0].equalsIgnoreCase("Endereco")) {
					enderecos.add(new Endereco(Integer.parseInt(vetor[1]), vetor[2], vetor[3],
							Integer.parseInt(vetor[4]), vetor[5], vetor[6], vetor[7], vetor[8]));
				} else if (vetor[0].equalsIgnoreCase("Agencia")) {
					agencias.add(new Agencia(Integer.parseInt(vetor[1]), Integer.parseInt(vetor[2]),
							Integer.parseInt(vetor[3]), Integer.parseInt(vetor[4])));
				} else {
					break;
				}

			} else {
				break;
			}
		}
	
		buffRead.close();
	}
}
