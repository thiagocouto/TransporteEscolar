package br.ufrn.transporte.model;

public class Horario {
	
	private DiaSemana diaSemana;
	
	private String hora;
	
	private TipoHorario tipoHorario;
	
	private Turno turno;
	
	public Horario() {}
	
	public Horario(DiaSemana diaSemana, String hora, TipoHorario tipoHorario,
			Turno turno) {
		super();
		this.diaSemana = diaSemana;
		this.hora = hora;
		this.tipoHorario = tipoHorario;
		this.turno = turno;
	}

	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public TipoHorario getTipoHorario() {
		return tipoHorario;
	}

	public void setTipoHorario(TipoHorario tipoHorario) {
		this.tipoHorario = tipoHorario;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
}
