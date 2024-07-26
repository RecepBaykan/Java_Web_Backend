package repositoryImpl;

import model.User;
import repository.ObjectRepository;

public class UserRepositoryImpl extends JPAFactorImpl implements ObjectRepository<User, Integer> {

	
	public UserRepositoryImpl() {
		
		super();
		
	}
	
	@Override
	public void save(User model) {

		getEntityTransaction().begin();

		getEntityManager().persist(model);

		getEntityTransaction().commit();

	}

	@Override
	public void delete(User model) {

		getEntityTransaction().begin();

		getEntityManager().remove(model);

		getEntityTransaction().commit();

	}

	@Override
	public void update(User model) {

		getEntityTransaction().begin();

		getEntityManager().merge(model);

		getEntityTransaction().commit();

	}

	@Override
	public User find(Integer id) {
		
		return getEntityManager().find(User.class, id);
		
	}

}
