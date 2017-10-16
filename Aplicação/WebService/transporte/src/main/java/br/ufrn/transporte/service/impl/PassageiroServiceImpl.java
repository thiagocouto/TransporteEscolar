package br.ufrn.transporte.service.impl;

import java.util.List;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.dao.impl.PassageiroDaoImpl;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.Passageiro;
import br.ufrn.transporte.service.PassageiroService;

public class PassageiroServiceImpl implements PassageiroService{
	
	private PassageiroDao passageiroDao;
	
	public PassageiroServiceImpl() {
		this.passageiroDao = new PassageiroDaoImpl();
	}
	
	@Override
	public void atualizarPassageiro(Passageiro passageiro) {
		this.passageiroDao.atualizarPassageiro(passageiro);;
	}
	
	@Override
	public void inserirPassageiro(Passageiro passageiro) {
		this.passageiroDao.inserirPassageiro(passageiro);;
	}
	
	@Override
	public List<Passageiro> listarPassageiros() {
		return this.passageiroDao.listarPassageiros();
	}
	
	@Override
	public List<Passageiro> listarPassageirosHorario(Horario horario) {
		return this.passageiroDao.listarPassageirosHorario(horario);
	}
	
}
