import java.util.Date;

import model.Book;
import model.Contact;
import model.User;
import repository.UserRepository;
import repostoryImpl.BookRepositoryImpl;
import repostoryImpl.UserRepositoryImpl;


public class App {

	public static void main(String[] args) {

		Contact contact = new Contact("+90 546 875 10 10", "recep.baykan97@gmail.com", "nontius.com");
		User user = new User("Recep", "Baykan", contact, new Date());
		
		UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();
		
		userRepositoryImpl.save(user); 
		

	}

}
