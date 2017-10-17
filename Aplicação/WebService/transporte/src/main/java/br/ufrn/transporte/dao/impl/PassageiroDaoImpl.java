package br.ufrn.transporte.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.model.Horario;
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
		String hql = "SELECT p FROM Passageiro p "
				   + "ORDER BY p.nome";
		TypedQuery<Passageiro> query = em.createQuery(hql, Passageiro.class);
		return query.getResultList();
	}
	
	@Override
	public List<Passageiro> listarPassageirosHorario(Horario horario) {
		String hql = "SELECT p FROM Passageiro p "
				   + "LEFT JOIN FETCH p.agenda a "
				   + "LEFT JOIN FETCH a.horarios h "
				   + "WHERE h.id in :idHorario";
		TypedQuery<Passageiro> query = em.createQuery(hql, Passageiro.class);
		query.setParameter("idHorario", horario.getId());
		return query.getResultList();
	}
}
