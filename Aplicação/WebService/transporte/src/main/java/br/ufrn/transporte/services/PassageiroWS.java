package br.ufrn.transporte.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.dao.impl.PassageiroDaoImpl;
import br.ufrn.transporte.model.Passageiro;


@Path("passageiro") 
public class PassageiroWS {
	
	private PassageiroDao passageiroDao;
	
	public PassageiroWS() {
		super();
		this.passageiroDao = new PassageiroDaoImpl();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listar")
	public List<Passageiro> listarPassageiros() {
		return passageiroDao.listarPassageiros();
	}
	
}
