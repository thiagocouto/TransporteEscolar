package br.ufrn.transporte.model;

import java.util.List;

public class Agenda {
	
	private List<Horario> horarios;

	public Agenda(){};
	
	public Agenda(List<Horario> horarios) {
		super();
		this.horarios = horarios;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
	
}
