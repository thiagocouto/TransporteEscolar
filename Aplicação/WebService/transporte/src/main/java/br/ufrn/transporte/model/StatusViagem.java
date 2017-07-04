package br.ufrn.transporte.model;

public enum StatusViagem {
	
	PLANEJADA(1, "Planejada"),
	ANDAMENTO(2, "Em andamento"),
	REALIZADA(3, "Realizada"),
	CANCELADA(4, "Cancelada");
	
	private Integer codigo;
	
	private String descricao;

	private StatusViagem(Integer codigo, String descricao) {
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
