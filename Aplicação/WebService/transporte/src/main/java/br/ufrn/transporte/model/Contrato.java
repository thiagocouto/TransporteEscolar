package br.ufrn.transporte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_contrato")
public class Contrato {
	
	@Id
	@GeneratedValue
	@Column(name="id_contrato")
	private Long id;
}
