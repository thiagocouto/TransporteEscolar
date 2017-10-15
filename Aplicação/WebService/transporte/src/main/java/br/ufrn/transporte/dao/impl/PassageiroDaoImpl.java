package br.ufrn.transporte.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.model.Passageiro;

public class PassageiroDaoImpl extends BaseDaoImpl<Passageiro> implements PassageiroDao{
	
	@Override
	public void atualizarPassageiro(Passageiro passageiro) {
		this.update(passageiro);
	}
	@Override
	public void inserirPassageiro(Passageiro passageiro) {
		this.insert(passageiro);
	}
	
	@Override
	public List<Passageiro> listarPassageiros() {
		String hql = "SELECT p FROM Passageiro p";
		TypedQuery<Passageiro> query = em.createQuery(hql, Passageiro.class);
		return query.getResultList();
	}
	
	
}
