package JPA_FactoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import JPA_Factory.JPAFactory;

public class JPAFactorImpl implements JPAFactory {

	private EntityManager entityManager;
	private EntityTransaction transaction;

	public JPAFactorImpl() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLCreate");
		this.entityManager = factory.createEntityManager();
		this.transaction = this.entityManager.getTransaction();
	
	}
	
	
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}
	
	
	@Override
	public EntityTransaction getEntityTransaction() {
		// TODO Auto-generated method stub
		return transaction;
	}
}
