package br.ufrn.transporte.service;

import java.util.List;

import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.Passageiro;

public interface PassageiroService {
	
	/**
	 * Insere um passageiro
	 */
	void inserirPassageiro(Passageiro passageiro);
	
	/**
	 * Atualiza um passageiro
	 * 
	 * @param passageiro
	 */
	void atualizarPassageiro(Passageiro passageiro);
	
	/**
	 * Lista os passageiros
	 * 
	 * @return Lista de passageiros
	 */
	List<Passageiro> listarPassageiros();
	
	/**
	 * Lista os passageiros por horário
	 * 
	 * @param horario
	 * 
	 * @return lista de passageiros conforme parâmetro
	 */
	List<Passageiro> listarPassageirosHorario(Horario horario);
}
