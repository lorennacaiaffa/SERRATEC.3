package br.com.residencia.poo_project.pessoas;

import java.util.Date;

public class Cliente extends Pessoa {

	Integer idCliente;
	Integer idGerente;
	public Cliente(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado, String nome, String cpf, String telefone, String email, Date dataNascimento,
			Integer idCliente, Integer idGerente) {
		super(idEndereco, cep, rua, complemento, numero, bairro, cidade, estado, nome, cpf, telefone, email,
				dataNascimento);
		this.idCliente = idCliente;
		this.idGerente = idGerente;
	}
	
	

}