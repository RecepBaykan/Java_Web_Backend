package repostoryImpl;

import JPA_FactoryImpl.JPAFactorImpl;
import model.User;
import repository.UserRepository;

public class UserRepositoryImpl extends JPAFactorImpl implements UserRepository{

	
	public UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void save(User user) {
		getEntityTransaction().begin();

		getEntityManager().persist(user);

		getEntityTransaction().commit();
		
	}

	@Override
	public void delete(User user) {
		getEntityTransaction().begin();

		getEntityManager().remove(user);

		getEntityTransaction().commit();
		
	}

	@Override
	public User find(int id) {
		
		getEntityTransaction().begin();

		User user = getEntityManager().find(User.class, id);
		getEntityTransaction().commit();
		
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
