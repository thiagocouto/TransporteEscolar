package br.ufrn.transporte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contrato {
	
	@Id
	@GeneratedValue
	private Long id;
}
