package repositoryImpl;

import model.Pet;
import repository.ObjectRepository;

public class PetRepository extends JPAFactorImpl implements ObjectRepository<Pet, Integer> {

	public PetRepository() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void save(Pet model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pet model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Pet model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pet find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
