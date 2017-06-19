package br.ufrn.transporte.dao;

import java.util.List;

import br.ufrn.transporte.model.Passageiro;

public interface PassageiroDao {
	
	/**
	 * Lista os passageiros
	 * 
	 * @return Lista de passageiros
	 */
	List<Passageiro> listarPassageiros();
}