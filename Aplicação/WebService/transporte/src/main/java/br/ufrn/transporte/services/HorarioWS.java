package br.ufrn.transporte.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.ufrn.transporte.dao.HorarioDao;
import br.ufrn.transporte.dao.impl.HorarioDaoImpl;
import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;


@Path("horario") 
public class HorarioWS {
	
	private HorarioDao horarioDao;
	
	public HorarioWS() {
		super();
		this.horarioDao = new HorarioDaoImpl();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Horario> listarHorariosDiaSemanaTipoHorario(
			@QueryParam("diaSemana") DiaSemana diaSemana, 
			@QueryParam("tipoHorario") TipoHorario tipoHorario) {
		return horarioDao.listarHorariosDiaSemanaTipoHorario(diaSemana, tipoHorario);
	}
	
	
}
