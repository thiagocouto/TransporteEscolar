package br.ufrn.transporte.dao.impl;

import java.util.Collection;

import javax.persistence.EntityManager;

import br.ufrn.transporte.util.JPAUtil;

public class BaseDaoImpl<T> {
	
	protected EntityManager em = JPAUtil.getEntityManager();
	
	protected void insert(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}
	
	protected void insert(Collection<T> list) {
		em.getTransaction().begin();
		for (T t : list) {			
			em.persist(t);
		}
		em.getTransaction().commit();
	}
	
	protected void update(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
	}
	
}
