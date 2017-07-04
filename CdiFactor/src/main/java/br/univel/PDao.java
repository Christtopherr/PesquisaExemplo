package br.univel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped // similar to singleton on Spring
public class PDao {

	@Inject
	private EntityManager manager;

	public void save(Produto product) {
		this.manager.getTransaction().begin();
		this.manager.persist(product);
		this.manager.getTransaction().commit();
	}

}