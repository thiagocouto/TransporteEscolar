package br.ufrn.transporte.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.factory.PassageiroFactory;
import br.ufrn.transporte.model.Passageiro;

public class PassageiroDaoImpl extends BaseDaoImpl<Passageiro> implements PassageiroDao{
	
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
	
	
	public static void main(String[] args) {
		PassageiroDao passageiroDao = new PassageiroDaoImpl();

		List<Passageiro> passageiros = PassageiroFactory.listarPassageiros();
		for (Passageiro passageiro : passageiros) {
			passageiroDao.inserirPassageiro(passageiro);
		}
	}
}
