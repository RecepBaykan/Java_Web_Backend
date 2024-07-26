import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Book;
import model.Contact;
import model.User;
import repository.UserRepository;
import repostoryImpl.BookRepositoryImpl;
import repostoryImpl.UserRepositoryImpl;


public class App {

	public static void main(String[] args) {

		List<String> phoneNumbers = new ArrayList<String>();
		phoneNumbers.add("+90 546 850 2765");
		phoneNumbers.add("+90 544 557 5524");
		Contact contact = new Contact(phoneNumbers , "recep.baykan97@gmail.com", "nontius.com");
		User user = new User("Recep", "Baykan", contact, new Date());
		
		
		
		UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();
		
		userRepositoryImpl.save(user); 
 
		

	}

}
