package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import domain.BaseEntity;
import util.EntityManagerFactoryWrapper;

public class GenericDAO {
	
	public EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
	
	public void salvar(BaseEntity b){
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		
		
	}
	
	public <T extends BaseEntity> List<T> buscaTodos(Class<T> clazz){
		 TypedQuery<T> qry = em.createQuery("FROM " + clazz.getSimpleName(), clazz);
		 return qry.getResultList();
	}

	
	public GenericDAO() {
		// TODO Auto-generated constructor stub
	}

}
