package br.ufrn.transporte.model;

public enum DiaSemana {
	
	DOMINGO(1, "Manhã"),
	SEGUNDA(2, "Segunda"),
	TERCA  (3, "Terça"),
	QUARTA (4, "Quarta"),
	QUINTA (5, "Quinta"),
	SEXTA  (6, "Sexta"),
	SABADO (7, "Sábado");
	
	private Integer codigo;
    private String descricao;

    DiaSemana(Integer codigo, String descricao) {
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
