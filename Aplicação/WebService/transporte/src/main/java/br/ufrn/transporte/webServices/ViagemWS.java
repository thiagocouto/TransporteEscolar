package br.ufrn.transporte.webServices;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufrn.transporte.model.Viagem;
import br.ufrn.transporte.service.ViagemService;
import br.ufrn.transporte.service.impl.ViagemServiceImpl;
import br.ufrn.transporte.util.DateUtils;
import br.ufrn.transporte.util.JsonUtils;

@Path("viagem") 
public class ViagemWS {
	
	private ViagemService viagemService;
	
	public ViagemWS() {
		super();
		this.viagemService = new ViagemServiceImpl();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("gerarViagens")
	public void gerarViagens(String json) throws ParseException {
		String dtInicio = JsonUtils.obterDadoJson(json, "dtInicio");
		String dtFim = JsonUtils.obterDadoJson(json, "dtFim");
		viagemService.gerarViagens(DateUtils.stringAAAAMMDDToDate(dtInicio), DateUtils.stringAAAAMMDDToDate(dtFim));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listar")
	public List<Viagem> listarViagens() {
		return viagemService.listarViagens();
	}

}
