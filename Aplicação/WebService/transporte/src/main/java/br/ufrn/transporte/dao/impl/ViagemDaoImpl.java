package br.ufrn.transporte.dao.impl;

import java.util.Collection;
import java.util.List;

import br.ufrn.transporte.dao.ViagemDao;
import br.ufrn.transporte.model.Viagem;

public class ViagemDaoImpl extends BaseDaoImpl<Viagem> implements ViagemDao{

	@Override
	public void inserirViagem(Collection<Viagem> viagens) {
		this.insert(viagens);
	}
	
	@Override
	public List<Viagem> listarViagens() {
		return null;
	}
	
}
