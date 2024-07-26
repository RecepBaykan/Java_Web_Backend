import java.util.Date;

import model.Book;
import repostoryImpl.BookRepositoryImpl;


public class App {

	public static void main(String[] args) {


		Book book = new Book("Süper Adam 2", "Gerilim-Trajedi", "JJ Rowling ve Recep Baykan", new Date());
		
		BookRepositoryImpl bookRepositoryImpl = new BookRepositoryImpl();
		
		bookRepositoryImpl.save(book);
		
		

	}

}
