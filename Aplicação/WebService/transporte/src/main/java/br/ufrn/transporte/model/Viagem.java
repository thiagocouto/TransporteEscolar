package br.ufrn.transporte.model;

import java.util.Date;
import java.util.List;

public class Viagem {
	
	private Date fim;
	
	private Horario horario;
	
	private Date inicio;
	
	private List<Passageiro> passageiros;
	
	private StatusViagem statusViagem;

	/*
	 * Verificar a possibilidade de gravar o trajeto da viagem.
	 */
	//private String trajeto;
	
	public Viagem() {}
	
	public Viagem(Date fim, Horario horario, Date inicio,
			List<Passageiro> passageiros, StatusViagem statusViagem) {
		super();
		this.fim = fim;
		this.horario = horario;
		this.inicio = inicio;
		this.passageiros = passageiros;
		this.statusViagem = statusViagem;
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
}
