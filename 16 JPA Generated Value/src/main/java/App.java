import java.util.Date;

import model.Book;
import repostoryImpl.BookRepositoryImpl;


public class App {

	public static void main(String[] args) {


		Book book = new Book("Uçan Kuşlar 2", "Gerilim", "Recep Baykan", new Date());
		
		BookRepositoryImpl bookRepositoryImpl = new BookRepositoryImpl();
		
		bookRepositoryImpl.save(book);
		
		

	}

}
