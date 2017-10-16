package br.ufrn.transporte.service.impl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufrn.transporte.dao.ViagemDao;
import br.ufrn.transporte.dao.impl.ViagemDaoImpl;
import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.Passageiro;
import br.ufrn.transporte.model.StatusViagem;
import br.ufrn.transporte.model.Viagem;
import br.ufrn.transporte.service.HorarioService;
import br.ufrn.transporte.service.PassageiroService;
import br.ufrn.transporte.service.ViagemService;
import br.ufrn.transporte.util.DateUtils;

public class ViagemServiceImpl implements ViagemService{
	
	private HorarioService horarioService;
	private PassageiroService passageiroService; 
		
	private ViagemDao viagemDao;
	
	public ViagemServiceImpl() {
		this.horarioService = new HorarioServiceImpl();
		this.passageiroService = new PassageiroServiceImpl();
		this.viagemDao = new ViagemDaoImpl();
	}
	
	@Override
	public List<Viagem> listarViagens() {
		return this.viagemDao.listarViagens();
	}
	
	@Override
	public void gerarViagens(Date dtInicio, Date dtFim) {
		Map<DiaSemana, List<Horario>> map = obterMapDayWeekHorario(dtInicio, dtFim);
		List<Viagem> viagens = new ArrayList<Viagem>();
		
		for (Map.Entry<DiaSemana, List<Horario>> entry : map.entrySet()){
			for (Horario horario : entry.getValue()) {
				List<Passageiro> passageiros = passageiroService.listarPassageirosHorario(horario);
				viagens.add(this.obterViagem(horario, passageiros));
			}
		}
		
		viagemDao.inserirViagem(viagens);
	}

	private Viagem obterViagem(Horario horario, List<Passageiro> passageiros) {
		Viagem viagem = new Viagem();
		viagem.setHorario(horario);
		viagem.setPassageiros(passageiros);
		viagem.setStatusViagem(StatusViagem.PLANEJADA);
		return viagem;
	}

	private Map<DiaSemana, List<Horario>> obterMapDayWeekHorario(Date dtInicio, Date dtFim) {
		Map<DiaSemana, List<Horario>> map = new HashMap<DiaSemana, List<Horario>>(); 
		
		LocalDate lcDtInicio = DateUtils.convertDateToLocalDate(dtInicio);
		LocalDate lcDtFim = DateUtils.convertDateToLocalDate(dtFim);
		
		while (!lcDtInicio.isAfter(lcDtFim)){
			DiaSemana diaSemana = DiaSemana.convertDayOfWeekToDiaSemana(lcDtInicio.getDayOfWeek());
			if(map.get(diaSemana) == null){
				List<Horario> horarios = horarioService.listarHorariosDiaSemana(diaSemana);
				map.put(diaSemana, horarios);
			}
			lcDtInicio = lcDtInicio.plusDays(1);
		}
		
		return map;
	}
	
}
