import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Adress;
import model.Book;
import model.Contact;
import model.User;
import repository.UserRepository;
import repostoryImpl.BookRepositoryImpl;
import repostoryImpl.UserRepositoryImpl;

public class App {

	public static void main(String[] args) {
		UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();

		
		List<String> phoneNumbers = new ArrayList<String>();
		phoneNumbers.add("+90 546 850 2765");
		phoneNumbers.add("+90 544 557 5524");

		Adress adres1 = new Adress("Menekşe Caddesi", "Polatlı", "06900");

		Adress adres2 = new Adress("İnönü Caddesi", "Ankara", "06");

		List<Adress> adresler = new ArrayList<Adress>();

		adresler.add(adres1);
		adresler.add(adres2);

		Map<String, String> mail = new HashMap();

		mail.put("kişisel", "recep.baykan97@gmail.com");
		mail.put("iş", "dmental123@gmail.com");

		Contact contact = new Contact(phoneNumbers, mail, "nontius.com");
		User user = new User("Recep", "Baykan", contact, adresler, new Date());

		List<String> phoneNumbers2 = new ArrayList<String>();
		phoneNumbers2.add("+90 11111");
		phoneNumbers2.add("+90 22222");
		Adress adres3 = new Adress("Kral Caddesi", "Arnavut", "33");

		Adress adres4 = new Adress("Süper Caddesi", "Ankara", "33");

		List<Adress> adresler2 = new ArrayList<Adress>();

		adresler2.add(adres3);
		adresler2.add(adres4);

		Map<String, String> mail2 = new HashMap();

		mail2.put("kişisel", "+90 4324 444");
		mail2.put( "iş", "koyu_salazar@gmail.com");

		Contact contact2 = new Contact(phoneNumbers, mail2,"kral.com");
		User user2 = new User("Ali", "Veli", contact2, adresler2, new Date());

		userRepositoryImpl.save(user);
		userRepositoryImpl.save(user2);
		
		
		String recepBaykanIsEpostasi =  userRepositoryImpl.find(1).getContact().getEmail().get("iş");
		System.out.print(recepBaykanIsEpostasi);
	}
	
	


}
