package br.ufrn.transporte.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufrn.transporte.dao.ViagemDao;
import br.ufrn.transporte.dao.impl.ViagemDaoImpl;
import br.ufrn.transporte.model.Viagem;

@Path("viagem") 
public class ViagemWS {
	
private ViagemDao viagemDao;
	
	public ViagemWS() {
		super();
		this.viagemDao = new ViagemDaoImpl();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listar")
	public List<Viagem> listarViagens() {
		return viagemDao.listarViagens();
	}

}
