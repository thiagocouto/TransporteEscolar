package br.ufrn.transporte.dao.impl;

import java.util.List;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.factory.PassageiroFactory;
import br.ufrn.transporte.model.Passageiro;

public class PassageiroDaoImpl implements PassageiroDao{
	
	@Override
	public void inserirPassageiro(Passageiro passageiro) {
		PassageiroFactory.inserirPassageiro(passageiro);
	}
	
	@Override
	public List<Passageiro> listarPassageiros() {
		return PassageiroFactory.listarPassageiros();
	}
	
}
