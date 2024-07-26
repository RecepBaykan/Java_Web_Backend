

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
		
		
		// Transaction başlangıcı
		transaction.begin();
		
		// Öğrenci oluşturma
		
		Student student = new Student("1", "Recep", "Baykan", new Date(), "Okulan yeni başladı", true);
		Student student2 = new Student("2", "Veli", "İleri", new Date(), "Okulan yeni başladı", true);
		Student student3 = new Student("3", "Ayşe", "Düz", new Date(), "Okulan yeni başladı", true);
		Student student4 = new Student("4", "Merve", "Geri", new Date(), "Okulan yeni başladı", true);
		
		entityManager.persist(student);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
		
		
		//Transaction bitişi
		transaction.commit();
		
	

		
	}

}
