import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import model.Pet;
import model.User;
import repositoryImpl.BaseImpl;
import repositoryImpl.UserRepositoryImpl;

public class App {

	public static void main(String[] args) {

	
		
		Pet pet = new Pet();
		pet.setName("SuperCat");
		pet.setType("Kedi");
		
		Pet pet1 = new Pet();
		pet1.setName("SuperDog");
		pet1.setType("Dog");
		
		Pet pet2 = new Pet();
		pet2.setName("SuperBat");
		pet2.setType("Yarasa");


		User user = new User();

		user.setName("Veli");
		user.setSurname("Deli");
		user.setBirthOfDay(new Date());
		user.setPet(pet);
		
		User user1 = new User();

		user1.setName("Recep");
		user1.setSurname("Baykan");
		user1.setBirthOfDay(new Date());
		user1.setPet(pet1);
		
		
		User user2 = new User();

		user2.setName("Ayşe");
		user2.setSurname("Onur");
		user2.setBirthOfDay(new Date());
		user2.setPet(pet2);
		
		

		
		BaseImpl baseImpl = new BaseImpl();
		
		
		
		baseImpl.save(user);
		
	
		baseImpl.save(user1);
		
	
		baseImpl.save(user2);
		
		
		baseImpl.delete(user2);
		
	}

}
