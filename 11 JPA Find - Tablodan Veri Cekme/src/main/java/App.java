
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

		if (student1 != null) {
			System.out.println(student1.toString());
		} else {
			System.err.println("Öğrenci bulunamadı");
		}

		Student student2 = entityManager.find(Student.class, "2");

		if (student2 != null) {
			System.out.println(student2.toString());
		} else {
			System.err.println("Öğrenci bulunamadı");
		}

		Student student3 = entityManager.find(Student.class, "13");

		if (student3 != null) {
			System.out.println(student3.toString());
		} else {
			System.err.println("Öğrenci bulunamadı");
		}
		


	}

}
