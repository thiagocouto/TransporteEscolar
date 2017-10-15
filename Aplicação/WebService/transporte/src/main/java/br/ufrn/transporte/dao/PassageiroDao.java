package br.ufrn.transporte.dao;

import java.util.List;

import br.ufrn.transporte.model.Passageiro;

public interface PassageiroDao {
	
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
}