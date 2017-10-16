package br.ufrn.transporte.dao;

import java.util.Collection;
import java.util.List;

import br.ufrn.transporte.model.Viagem;

public interface ViagemDao {
	
	/**
	 * Insere um passageiro
	 */
	void inserirViagem(Collection<Viagem> viagens);
	
	/**
	 * Lista as viagens
	 * 
	 * @return Lista de viagens
	 */
	List<Viagem> listarViagens();
}