package br.ufrn.transporte.dao;

import java.util.List;

import br.ufrn.transporte.model.Viagem;

public interface ViagemDao {
	
	/**
	 * Lista as viagens
	 * 
	 * @return Lista de viagens
	 */
	List<Viagem> listarViagens();
}