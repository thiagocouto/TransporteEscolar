package br.ufrn.transporte.webServices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.ufrn.transporte.model.DiaSemana;
import br.ufrn.transporte.model.Horario;
import br.ufrn.transporte.model.TipoHorario;
import br.ufrn.transporte.service.HorarioService;
import br.ufrn.transporte.service.impl.HorarioServiceImpl;


@Path("horario") 
public class HorarioWS {
	
	private HorarioService horarioService;
	
	public HorarioWS() {
		super();
		this.horarioService = new HorarioServiceImpl();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Horario> listarHorariosDiaSemanaTipoHorario(
			@QueryParam("diaSemana") DiaSemana diaSemana, 
			@QueryParam("tipoHorario") TipoHorario tipoHorario) {
		return horarioService.listarHorariosDiaSemanaTipoHorario(diaSemana, tipoHorario);
	}
	
}
