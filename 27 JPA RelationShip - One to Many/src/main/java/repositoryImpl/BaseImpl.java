package repositoryImpl;

import model.BaseModel;
import model.User;
import repository.ObjectRepository;

public class BaseImpl extends JPAFactorImpl implements ObjectRepository<BaseModel, Integer>{

	public BaseImpl() {
		
		super();
		
	}
	
	@Override
	public void save(BaseModel model) {

		getEntityTransaction().begin();

		getEntityManager().persist(model);

		getEntityTransaction().commit();

	}

	@Override
	public void delete(BaseModel model) {

		getEntityTransaction().begin();

		getEntityManager().remove(model);

		getEntityTransaction().commit();

	}

	@Override
	public void update(BaseModel model) {

		getEntityTransaction().begin();

		getEntityManager().merge(model);

		getEntityTransaction().commit();

	}

	@Override
	public BaseModel find(Integer id) {
		
		return getEntityManager().find(BaseModel.class, id);
		
	}
}
