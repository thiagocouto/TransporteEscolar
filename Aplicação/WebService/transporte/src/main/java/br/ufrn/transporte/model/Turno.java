package br.ufrn.transporte.model;

public enum Turno {
	
	MANHA(1, "Manhã"),
	TARDE(2, "Manhã"),
	NOITE(3, "Manhã");
	
	private Integer codigo;
    private String descricao;

    Turno(Integer codigo, String descricao) {
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
