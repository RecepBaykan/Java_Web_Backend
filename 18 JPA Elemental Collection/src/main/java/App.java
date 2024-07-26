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
		
		
		List<String> phoneNumbers2 = new ArrayList<String>();
		phoneNumbers2.add("+90 533 333 1233");
		phoneNumbers2.add("+90 134 124 4422");
		
		Contact contact2 = new Contact(phoneNumbers2 , "dmental123@gmail.com", "nontius.com");
		User user2 = new User("Hüdaverdi", "Bayrak", contact2, new Date());
		
		UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();
		
		userRepositoryImpl.save(user); 
		userRepositoryImpl.save(user2); 
		

	}

}
