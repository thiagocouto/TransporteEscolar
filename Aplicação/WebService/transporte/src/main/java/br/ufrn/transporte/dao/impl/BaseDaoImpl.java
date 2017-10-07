package br.ufrn.transporte.dao.impl;

import javax.persistence.EntityManager;

import br.ufrn.transporte.util.JPAUtil;

public class BaseDaoImpl<T> {
	
	protected EntityManager em = JPAUtil.getEntityManager();
	
	protected void insert(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}
	
}
