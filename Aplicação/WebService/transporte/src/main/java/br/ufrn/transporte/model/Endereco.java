package br.ufrn.transporte.model;

public class Endereco {
	
	private String bairro;
	
	private String complemento;
	
	private Localizacao localizacao;
	
	private String logradouro;
	
	private String numero;
	
	public Endereco(){};

	public Endereco(String bairro, String complemento, Localizacao localizacao,
			String logradouro, String numero) {
		this.bairro = bairro;
		this.complemento = complemento;
		this.localizacao = localizacao;
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
