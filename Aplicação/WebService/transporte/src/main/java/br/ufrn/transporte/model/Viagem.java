package br.ufrn.transporte.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="tb_viagem")
public class Viagem {
	
	@Id
	@GeneratedValue
	@Column(name="id_viagem")
	private Long id;
	
	@Temporal(TemporalType.TIME)
	@Column(name="dt_fim")
	private Date fim;
	
	@ManyToOne
	@JoinColumn(name="id_horario")
	private Horario horario;
	
	@Temporal(TemporalType.TIME)
	@Column(name="dt_inicio")
	private Date inicio;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="tb_passageiro_viagem", 
    joinColumns= {@ JoinColumn(name="id_viagem")}, 
    inverseJoinColumns= {@JoinColumn(name="id_passageiro")})
	private List<Passageiro> passageiros;
	
	@Enumerated
	@Column(name="lt_statusViagem")
	private StatusViagem statusViagem;
	
	@Version
	@Column(name="id_versao")
	private Integer version;

	/*
	 * Verificar a possibilidade de gravar o trajeto da viagem.
	 */
	//private String trajeto;
	
	public Viagem() {}
	
	public Viagem(Long id, Date fim, Horario horario, Date inicio,
			List<Passageiro> passageiros, StatusViagem statusViagem) {
		super();
		this.id = id;
		this.fim = fim;
		this.horario = horario;
		this.inicio = inicio;
		this.passageiros = passageiros;
		this.statusViagem = statusViagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	public StatusViagem getStatusViagem() {
		return statusViagem;
	}

	public void setStatusViagem(StatusViagem statusViagem) {
		this.statusViagem = statusViagem;
	}
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
