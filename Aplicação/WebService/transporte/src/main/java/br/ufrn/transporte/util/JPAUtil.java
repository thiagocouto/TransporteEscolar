package br.ufrn.transporte.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("transporte");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
