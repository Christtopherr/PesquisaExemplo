package br.univel;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProducer {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");

	@Produces
	@RequestScoped // notice I want a request scoped bean
	public EntityManager entityManager() {
		return factory.createEntityManager();
	}

	/**
	 * How to close properly my current entityManager on Spring?
	 */
	public void close(@Disposes EntityManager manager) {
		manager.close();
	}

}