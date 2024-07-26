
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Student;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitMySQL");

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		// Öğrenci bulma
		Student student1 = entityManager.find(Student.class, "1");
		
		// Öğrenci bilgileri güncelleme
		student1.setSurname("Kral");

		// Transaction başlangıcı
		transaction.begin();
		
		// Öğrenci bilgeleri güncelleme
		
		entityManager.merge(student1);

		// Transaction bitişi
		transaction.commit();

	}

}
