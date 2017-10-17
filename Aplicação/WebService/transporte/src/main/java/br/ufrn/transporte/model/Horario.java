package br.ufrn.transporte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="tb_horario")
public class Horario {
	
	@Id
    @Column(name="id_horario")
	@GeneratedValue
	private Long id;
	
	@Enumerated
	@Column(name="lt_diaSemana")
	private DiaSemana diaSemana;
	
	@Column(name="tx_hora")
	private String hora;
	
	@Enumerated
	@Column(name="lt_tipoHorario")
	private TipoHorario tipoHorario;
	
	@Enumerated
	@Column(name="lt_turno")
	private Turno turno;
	
	@Version
	@Column(name="id_versao")
	private Integer version;
	
	public Horario() {}
	
	public Horario(DiaSemana diaSemana, String hora, TipoHorario tipoHorario,
			Turno turno) {
		super();
		this.diaSemana = diaSemana;
		this.hora = hora;
		this.tipoHorario = tipoHorario;
		this.turno = turno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
