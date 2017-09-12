package br.ufrn.transporte.services;

import java.io.InputStream;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufrn.transporte.dao.PassageiroDao;
import br.ufrn.transporte.dao.impl.PassageiroDaoImpl;
import br.ufrn.transporte.model.Passageiro;


@Path("passageiro") 
public class PassageiroWS {
	
	/**
	Method	Endpoints		Notes
	GET	    /passageiro		Get all passageiros data
	GET	    /passageiro/1	Get single passageiro
	POST	/passageiro		Post data
	PUT	    /passageiro/1	Update data
	DELETE	/passageiro/1	Delete data
	*/

	
	private PassageiroDao passageiroDao;
	
	public PassageiroWS() {
		super();
		this.passageiroDao = new PassageiroDaoImpl();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserirPassageiro(Passageiro passageiro) {
		passageiroDao.inserirPassageiro(passageiro);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Passageiro> listarPassageiros() {
		return passageiroDao.listarPassageiros();
	}
	
	
}
