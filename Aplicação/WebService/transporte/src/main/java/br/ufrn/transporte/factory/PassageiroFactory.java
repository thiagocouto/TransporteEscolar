package br.ufrn.transporte.factory;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.transporte.model.Passageiro;

public class PassageiroFactory {
	
	public static List<Passageiro> listarPassageiros(){
		List<Passageiro> listPassageiro = new ArrayList<Passageiro>();
		Passageiro passageiro = new Passageiro();
		passageiro.setNome("Maria");
		listPassageiro.add(passageiro);
		return listPassageiro;
	}
}
