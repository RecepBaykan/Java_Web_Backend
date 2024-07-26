import java.util.Date;

import model.Pet;
import model.User;
import repositoryImpl.BaseImpl;
import repositoryImpl.UserRepositoryImpl;

public class App {

	public static void main(String[] args) {

		UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();

		
		Pet pet = new Pet();
		pet.setName("SuperCat");
		pet.setType("Kedi");


		User user = new User();

		user.setName("Veli");
		user.setSurname("Deli");
		user.setBirthOfDay(new Date());
		user.setPet(pet);

		
		BaseImpl baseImpl = new BaseImpl();
		
		baseImpl.save(pet);
		baseImpl.save(user);
		
		

	}

}
