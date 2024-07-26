package OOP_PILLIAR;

public class Interface {
	
	/* Interface;
	 * Bir Interface, bir sınıfın şablonudur.
	 * Statik sabitler ve soyut metodular içerir
	 * Bir sınıfın ne yapması gerektiğini belirtir
	 * ama nasıl yapacağınız belirtmez.
	 * 
	 * Bir interface, uygulanacak sınıflar arasında bir
	 * sözleşme gibidir.
	 * 
	 * Interface tam bir soyutlama elde etmek için
	 * kullanılır.
	 * 
	 * Bir arayüzdeki tüm metotlar, public, abstracttır
	 * 
	 * Bir ayaryüzdeki tüm sabitler public static ve finaldir.
	 * 
	 * Interface'teki tüm metotlara sınıfa uygulanmak zorunda
	 * 
	 * Ayrıca çok kalıtım da Interface'ler ile yapılır
	 * 
	 * Peki iki farklı interface'in aynı somut default metodu varsa 
	 * ve bu iki farklı interface'i tek bir sınıfa uygularsak
	 * o sınıf hangi metotodu kullanır?
	 * 
	 * Cevap: Interface'lerin uygulandığı sınıf, aynı isimdeki somut metodu
	 * override ederek sınıfa ekler ve birinden birini yada ikisini superclass ile 
	 * çağırmaya olanak tanır.
	 * 
	 * Yada ayrı ayrı casting yaparak instance üzerinden elde edilebilir.
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Notification notification = new Notification();
		
		notification.sayHello();
		notification.printMessage();
		notification.sendMessage();
		
		notification.sameMethod();
		notification.sameAbstractMetot();
		
		((IHello) notification).sameMethod();;
		((IMessage) notification).sameMethod();
		
	}

}

class Notification implements IHello, IMessage{

	@Override
	public void printMessage() {
		System.out.println("Mesaj gösterildi");
		
	}

	@Override
	public void sendMessage() {
		System.out.println("Mesaj gönderildi");
		
	}

	@Override
	public void sayHello() {
		/* IHello içindeki name değişkeni statictir 
		 * her yerden erişilir.
		 */
		System.out.println("Hello " + IHello.name);
		
	}

	@Override
	public void sameMethod() {
		System.out.println("Sınıf metodu");
	}

	@Override
	public void  sameAbstractMetot() {
		
		System.out.println("Merhaba");
	}

	@Override
	public void abstractOrContretMetot() {
		System.out.println("Merhaba bu sınıf içindeki metottur");
	}

	
	
	
	
	
}




interface IHello{
	String name = "User";
	
	void sayHello();
	default void hay() {
		System.out.println("mera");
	}
	
	default void sameMethod() {
		System.out.println("Merhaba Ihello sameMetodu");
	}
	
	void sameAbstractMetot();
	
	void abstractOrContretMetot();
	
}

interface IMessage {
	
	void printMessage();
	
	void sendMessage();
	
	default void sameMethod() {
		System.out.println("Merhaba IMessage samemetodu");
	}
	
	void sameAbstractMetot();
	
	default void abstractOrContretMetot() {
		System.out.println("Merhaba bu IMessageMetodudur");
	}
	
	
}




