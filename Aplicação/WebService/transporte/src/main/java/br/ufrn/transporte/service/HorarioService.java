package br.ufrn.transporte.service;

import java.util.List;

import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;

public interface HorarioService {
	
	/**
	 * Lista os horários por Dia da Semana.
	 * 
	 * @param diaSemana 
	 * 
	 * @return Lista de Horários
	 */
	List<Horario> listarHorariosDiaSemana(DiaSemana diaSemana);
	
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
