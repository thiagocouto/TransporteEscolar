package br.ufrn.transporte.model;

public enum TipoHorario {
	
	IDA(1, "Ida"),
	VOLTA(2, "Volta");
	
	private Integer codigo;
	
	private String descricao;

	private TipoHorario(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
