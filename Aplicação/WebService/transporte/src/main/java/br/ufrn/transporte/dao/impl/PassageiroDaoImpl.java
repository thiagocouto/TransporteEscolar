package br.ufrn.transporte.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.factory.PassageiroFactory;
import br.ufrn.transporte.model.Passageiro;

public class PassageiroDaoImpl implements PassageiroDao{

	@Override
	public List<Passageiro> listarPassageiros() {
		return PassageiroFactory.listarPassageiros();
	}
	
	
}
