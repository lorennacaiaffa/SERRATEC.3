package br.com.residencia.enums;

public enum TipoUsuario {
	CLIENTE("cliente", 1), GERENTE("gerente", 2), DIRETOR("diretor", 3), PRESIDENTE("presidente", 4), FUNCIONARIO("funcionario", 5);

	private final Integer idTipoUsuario;
	private final String tipoUsuario;

	TipoUsuario(String tipoUsuario, Integer idTipoUsuario) {
		this.tipoUsuario = tipoUsuario;
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public Integer getIdTipoUsuario() {
		return this.idTipoUsuario;
	}
}
