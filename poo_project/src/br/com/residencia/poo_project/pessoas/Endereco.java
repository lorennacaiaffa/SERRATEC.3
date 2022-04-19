package br.com.residencia.poo_project.pessoas;

public class Endereco {

	Integer idEndereco;
	String cep;
	String rua;
	String complemento;
	Integer numero;
	String bairro;
	String cidade;
	String estado;
	public Endereco(Integer idEndereco, String cep, String rua, String complemento, Integer numero, String bairro,
			String cidade, String estado) {
		super();
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.rua = rua;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
}
