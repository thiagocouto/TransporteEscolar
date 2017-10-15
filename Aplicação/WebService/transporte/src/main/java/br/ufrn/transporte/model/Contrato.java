package br.ufrn.transporte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="tb_contrato")
public class Contrato {
	
	@Id
	@GeneratedValue
	@Column(name="id_contrato")
	private Long id;
	
	@Version
	@Column(name="id_versao")
	private Integer version;
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
