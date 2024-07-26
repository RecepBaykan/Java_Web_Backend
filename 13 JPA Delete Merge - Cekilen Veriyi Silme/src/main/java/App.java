
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

		// Transaction başlangıcı
		transaction.begin();
		
		// Öğrenci bilgeleri silme
		
		entityManager.remove(student1);

		// Transaction bitişi
		transaction.commit();

	}

}
