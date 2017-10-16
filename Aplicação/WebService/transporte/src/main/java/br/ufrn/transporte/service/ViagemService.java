package br.ufrn.transporte.service;

import java.util.Date;
import java.util.List;

import br.ufrn.transporte.model.Viagem;

public interface ViagemService {
	
	/**
	 * Gerar viagens
	 * 
	 * @param dtInicio
	 * @param dtFim
	 */
	void gerarViagens(Date dtInicio, Date dtFim);
	
	/**
	 * Lista as viagens
	 * 
	 * @return Lista de viagens
	 */
	List<Viagem> listarViagens();
}
