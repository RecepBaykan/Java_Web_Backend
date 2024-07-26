package repositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import repository.JpaFactory;

public class JPAFactorImpl implements JpaFactory {

	private EntityManager entity;
	private EntityTransaction transaction;

	public JPAFactorImpl() {
		// TODO Auto-generated constructor stub
		
	
		this.entity = getEntityManager();
		this.transaction = getEntityTransaction();
	}

	@Override
	public EntityManager getEntityManager() {

		if (this.entity == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLCreate");
			this.entity = factory.createEntityManager();
		}

		return entity;
	}

	@Override
	public EntityTransaction getEntityTransaction() {

		if (transaction == null) {
			this.transaction = this.entity.getTransaction();
		}

		return this.transaction;
	}

	

}
