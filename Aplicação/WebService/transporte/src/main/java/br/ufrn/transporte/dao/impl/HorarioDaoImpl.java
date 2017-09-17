package br.ufrn.transporte.dao.impl;

import java.util.List;

import br.ufrn.transporte.dao.HorarioDao;
import br.ufrn.transporte.factory.HorarioFactory;
import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;

public class HorarioDaoImpl implements HorarioDao{

	@Override
	public List<Horario> listarHorariosDiaSemanaTipoHorario(
			DiaSemana diaSemana, TipoHorario tipoHorario) {
		return HorarioFactory.listarHorariosDiaSemanaTipoHorario(diaSemana, tipoHorario);
	}
	

}
