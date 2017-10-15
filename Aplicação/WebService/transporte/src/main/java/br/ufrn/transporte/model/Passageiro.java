package br.ufrn.transporte.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="tb_passageiro")
public class Passageiro {
	
	@Id
	@GeneratedValue
	@Column(name="id_passageiro")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "id_agenda")
	private Agenda agenda;
	
	//private Contrato contrato;
	
	@Column(name="tx_email")
	private String email;
	
	@Embedded
	private Endereco endereco;
	
	@Column(name="tx_nome")
	private String nome;
	
	@Column(name="tx_telefone")
	private String telefone;
	
	@Enumerated
	@Column(name="lt_turno")
	private Turno turno;
	
	@Version
	@Column(name="id_versao")
	private Integer version;
	
	public Passageiro() {}
	
//	public Passageiro(Agenda agenda, Contrato contrato, String email,
//			Endereco endereco, String nome, String telefone) {
//		super();
//		this.agenda = agenda;
//		this.contrato = contrato;
//		this.email = email;
//		this.endereco = endereco;
//		this.nome = nome;
//		this.telefone = telefone;
//	}
	
	public Passageiro(Long id, Agenda agenda, String email, Endereco endereco,
			String nome, String telefone, Turno turno) {
		super();
		this.id = id;
		this.agenda = agenda;
		this.email = email;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.turno = turno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

//	public Contrato getContrato() {
//		return contrato;
//	}
//
//	public void setContrato(Contrato contrato) {
//		this.contrato = contrato;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
