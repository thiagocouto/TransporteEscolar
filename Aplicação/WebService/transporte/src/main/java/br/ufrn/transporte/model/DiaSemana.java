package br.ufrn.transporte.model;

import java.time.DayOfWeek;
import java.util.Calendar;

public enum DiaSemana {
	
	DOMINGO(Calendar.SUNDAY, "Domingo"),
	SEGUNDA(Calendar.MONDAY, "Segunda"),
	TERCA  (Calendar.TUESDAY, "Terça"),
	QUARTA (Calendar.WEDNESDAY, "Quarta"),
	QUINTA (Calendar.THURSDAY, "Quinta"),
	SEXTA  (Calendar.FRIDAY, "Sexta"),
	SABADO (Calendar.SATURDAY, "Sábado");
	
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
	
	static public DiaSemana convertDayOfWeekToDiaSemana(DayOfWeek dayWeek){
		switch (dayWeek) {
		case SUNDAY:
			return DOMINGO;
		case MONDAY:
			return SEGUNDA;
		case TUESDAY:
			return TERCA;
		case WEDNESDAY:
			return QUARTA;
		case THURSDAY:
			return QUINTA;
		case FRIDAY:
			return SEXTA;
		case SATURDAY:
			return SABADO;
		default:
			return null;
		}
	}
}
