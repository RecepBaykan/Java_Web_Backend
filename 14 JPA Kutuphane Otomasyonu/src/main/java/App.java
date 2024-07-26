import java.util.Date;

import model.Book;
import repostoryImpl.BookRepositoryImpl;

public class App {

	public static void main(String[] args) {

		
		
		BookRepositoryImpl bookRepositoryImpl = new BookRepositoryImpl();
		
		
		Book book4 = bookRepositoryImpl.find(4);
		
		
		
		
		bookRepositoryImpl.delete(book4);
		
		
		Book book2 = bookRepositoryImpl.find(2);
		
		book2.setName("Mardin'e Ziyaret");
		
		bookRepositoryImpl.update(book2);
		
		System.out.print(bookRepositoryImpl.find(0).toString());
		
		
		

	}

}
