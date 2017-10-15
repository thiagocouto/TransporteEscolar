package br.ufrn.transporte.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="tb_agenda")
public class Agenda {
	
	@Id
    @Column(name="id_agenda")
	@GeneratedValue
	private Long id;
	
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(name="tb_agenda_horario", 
    joinColumns= {@ JoinColumn(name="id_agenda")}, 
    inverseJoinColumns= {@JoinColumn(name="id_horario")})
	private List<Horario> horarios;
	
	@Version
	@Column(name="id_versao")
	private Integer version;
	
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
