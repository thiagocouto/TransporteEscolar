package br.ufrn.transporte.factory;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.transporte.model.Endereco;
import br.ufrn.transporte.model.Passageiro;

public class PassageiroFactory {
	
	private static List<Passageiro> listPassageiro = new ArrayList<Passageiro>();
	
	static {
		Endereco endereco = new Endereco();
		endereco.setBairro("Ponto Novo");
		endereco.setLogradouro("Rua Arnaldo Pereira Souza");
		endereco.setNumero("580");
		
		Passageiro passageiro = new Passageiro();
		passageiro.setNome("Thiago Couto de Almeida");
		passageiro.setTelefone("79997068119");
		passageiro.setEmail("thiagocoutoalmeida@gmail.com");
		passageiro.setEndereco(endereco);
		
		Passageiro passageiro2 = new Passageiro();
		passageiro2.setNome("Thiago Couto de Almeida");
		passageiro2.setTelefone("79997068119");
		passageiro2.setEmail("thiagocoutoalmeida@gmail.com");
		passageiro2.setEndereco(endereco);
		
		listPassageiro.add(passageiro);
		listPassageiro.add(passageiro2);		
	}
	
	
	public static void inserirPassageiro(Passageiro passageiro) {
		listPassageiro.add(passageiro);
	}
	
	public static List<Passageiro> listarPassageiros(){
		return listPassageiro;
	}



}
