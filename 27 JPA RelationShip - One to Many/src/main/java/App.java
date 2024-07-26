import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		pet.setName("Denny");
		pet.setType("Köpek");
		
		Pet pet2 = new Pet();
		pet2.setName("Roger");
		pet2.setType("Köpek");
		
		
		Pet pet3 = new Pet();
		pet3.setName("Misty");
		pet3.setType("Kedi");
		
		Pet pet4 = new Pet();
		pet4.setName("216");
		pet4.setType("Balık");
		
		User user = new User();
		
		user.setName("Recep");
		user.setSurname("Baykan");
		user.setBirthOfDay(new Date());
		List<Pet> pets = new ArrayList<Pet>();
		
		pets.add(pet);
		pets.add(pet2);
		
		user.setPet(pets);
		
		User user2 = new User();
		user2.setName("İbiş");
		user2.setSurname("Karamolla");
		user2.setBirthOfDay(new Date());
		
		List<Pet> pets2 = new ArrayList<Pet>();
		pets2.add(pet3);
		pets2.add(pet4);
		
		user2.setPet(pets2);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQLCreate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();
		
		entityTransaction.begin();
		
		manager.persist(user);
		manager.persist(user2);
		
		entityTransaction.commit();
	
		
	}

}
