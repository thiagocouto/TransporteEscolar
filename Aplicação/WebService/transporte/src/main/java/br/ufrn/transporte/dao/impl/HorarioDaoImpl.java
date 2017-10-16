package br.ufrn.transporte.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import br.ufrn.transporte.dao.HorarioDao;
import br.ufrn.transporte.factory.HorarioFactory;
import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;

public class HorarioDaoImpl extends BaseDaoImpl<Horario> implements HorarioDao{
	
	@Override
	public List<Horario> listarHorariosDiaSemana(DiaSemana diaSemana) {
		String hql = "SELECT h FROM Horario h "
				   + "WHERE h.diaSemana = :diaSemana";
		TypedQuery<Horario> query = em.createQuery(hql, Horario.class);
		query.setParameter("diaSemana", diaSemana);
		return query.getResultList();
	}
	
	@Override
	public List<Horario> listarHorariosDiaSemanaTipoHorario(
			DiaSemana diaSemana, TipoHorario tipoHorario) {
		return HorarioFactory.listarHorariosDiaSemanaTipoHorario(diaSemana, tipoHorario);
	}

}
