package JPA_Factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface JPAFactory {
	
	EntityManager getEntityManager();
	
	EntityTransaction getEntityTransaction();
	

}
