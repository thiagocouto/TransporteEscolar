package br.ufrn.transporte.model;

public class Passageiro {
	
	//private Agenda agenda;
	
	//private Contrato contrato;
	
	private String email;
	
	private Endereco endereco;
	
	private String nome;
	
	private String telefone;
	
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
	
	public Passageiro(String email,
			Endereco endereco, String nome, String telefone) {
		super();
		this.email = email;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
	}

//	public Agenda getAgenda() {
//		return agenda;
//	}
//
//	public void setAgenda(Agenda agenda) {
//		this.agenda = agenda;
//	}
//
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

}
