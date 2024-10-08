package repostoryImpl;

import javax.persistence.EntityManager;

import JPA_Factory.JPAFactory;
import JPA_FactoryImpl.JPAFactorImpl;
import model.Book;
import repository.BookRepository;

public class BookRepositoryImpl extends JPAFactorImpl implements BookRepository {

	public BookRepositoryImpl() {

		super();
	}

	@Override
	public void save(Book book) {

		getEntityTransaction().begin();

		getEntityManager().persist(book);

		getEntityTransaction().commit();

	}

	@Override
	public void delete(Book book) {
		getEntityTransaction().begin();

		getEntityManager().remove(book);

		getEntityTransaction().commit();

	}

	@Override
	public Book find(int id) {

		
		
		return getEntityManager().find(Book.class, id);
	}

	@Override
	public Book update(Book book) {
		
		getEntityTransaction().begin();

		getEntityManager().merge(book);

		getEntityTransaction().commit();
		
		return getEntityManager().merge(book);


	}

}
