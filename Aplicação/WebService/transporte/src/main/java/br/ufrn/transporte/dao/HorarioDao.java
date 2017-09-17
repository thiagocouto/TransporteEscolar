package br.ufrn.transporte.dao;

import java.util.List;

import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;

public interface HorarioDao {
	
	/**
	 * Lista os horários por Dia da Semana e Tipo de Horário.
	 * 
	 * @param diaSemana 
	 * @param tipoHorario
	 * 
	 * @return Lista de Horários
	 */
	List<Horario> listarHorariosDiaSemanaTipoHorario(DiaSemana diaSemana, TipoHorario tipoHorario);
}