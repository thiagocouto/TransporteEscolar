package br.ufrn.transporte.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeradorTabelas {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("transporte");
		factory.close();
	}
}
