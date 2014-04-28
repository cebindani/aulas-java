package com.dxt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dxt.domain.BaseEntity;
import com.dxt.util.EntityManagerFactoryWrapper;

public class Genericdao {
	
	public EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
	
	public void salvar(BaseEntity be){
		em.getTransaction().begin();
		if(be.Id==null){
			em.persist(be);
		}else{
			em.merge(be);
		}
		em.getTransaction().commit();
	}
	
	public <T extends BaseEntity> List<T> buscaTodos(Class<T> clazz){
		 TypedQuery<T> qry = em.createQuery("FROM " + clazz.getSimpleName(), clazz);
		 return qry.getResultList();
	}


	public void exclui(BaseEntity obj){
		
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
	}
	
	public Genericdao() {		
	}

}
