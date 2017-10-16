package br.ufrn.transporte.service.impl;

import java.util.List;

import br.ufrn.transporte.dao.HorarioDao;
import br.ufrn.transporte.dao.impl.HorarioDaoImpl;
import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;
import br.ufrn.transporte.service.HorarioService;

public class HorarioServiceImpl implements HorarioService{
	
	private HorarioDao horarioDao;
	
	public HorarioServiceImpl() {
		this.horarioDao = new HorarioDaoImpl();
	}

	@Override
	public List<Horario> listarHorariosDiaSemana(DiaSemana diaSemana) {
		return this.horarioDao.listarHorariosDiaSemana(diaSemana);
	}

	@Override
	public List<Horario> listarHorariosDiaSemanaTipoHorario(
			DiaSemana diaSemana, TipoHorario tipoHorario) {
		return this.horarioDao.listarHorariosDiaSemanaTipoHorario(diaSemana, tipoHorario);
	}

}
