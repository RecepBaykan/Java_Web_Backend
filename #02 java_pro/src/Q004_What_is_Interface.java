

public class Q004_What_is_Interface {

	/*
	 * Interface (arayüz) nedir?
	 * 
	 * Java'da bir Interface (arayüz), sınıfın bir taslağıdır.
	 * 
	 * Interface bir sınıfın ne yapacağını belirtir ama nasıl yapacağını söylemez.
	 * 
	 * Interface, tam bir abstraction yani soyutlama yapmak için kullanılır
	 * 
	 * Interface'deki metotlar public ve abstract metotlardır Java 8 ile birlikte
	 * default ve statict metotlar bulunabilir
	 * 
	 * Interface'deki değişkenler ise sabittir olup public, static ve finaldir.
	 * 
	 * Interface'deki abstract metotlar, sınıf içinde uygulanmalıdır.
	 * 
	 * implement = uygulamak
	 * 
	 * Ayrıca Interface'ler ile çoklu kalıtım yapılabilir
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		// Interface'in değişkenleri static olduğu için erişilir.
		System.out.println(Interface.value);
		
		// Interface'in static metotlarına da erişilir
		System.out.println(Interface.staticConcreteMetotTwo());
		Interface.staticConreteMetot();
		
		Remote remote = new Remote();
		
		remote.status();
		
		remote.power();
		
		for(int i = 0; i<5; i++) {
			remote.channelUp();
			remote.volumeUp();
		}
		
		remote.volumeDown();
		
		remote.status();
		remote.power();
		remote.status();
		remote.power();
		remote.status();
		
		
	}
	

}

// Interface tanımı
interface Interface {

	// Değişken tanımı
	/*
	 * Aşağıdaki değişkenler hem statik hem finaldir
	 * farklı yazılış biçimlerini gösterdim
	 * 
	 */
	int value = 10;
	final int finalValue = 4;
	static int staticValue = 4;

	// Bu olmaz
	// int value; çünkü finaldir.

	// Abstract metotlar
	void abstractMetot();

	void abstractMetotTwo(String s);

	int abstractMetotThree();

	// default concrete metotlar
	
	default void concreteMetot() {

	}

	default int concreteMetotTwo() {

		return 0;

	}

	// static concrete metotlar
	/*
	 * 
	 * Aşağıdaki metotlar statictir
	 * erişim belirleyicileri ile başka 
	 * java dosyaları içinde de kullanılabilir
	 * 
	 */
	static void staticConreteMetot() {

	}

	static int staticConcreteMetotTwo() {
		return 0;
	}
}


// TV kumandası örneğin
interface IRemote{
	
	void power();
	
	void volumeDown();
	
	void volumeUp();
	
	void mute();
	
	void channelUp();
	
	void channelDown();
	
	
}



class Remote implements IRemote{
	
	boolean power;
	int volume = 0;
	int channel = 0;

	@Override
	public void power() {
		
		power = (!power) ? true : false;
		
		if(power) {
			System.out.println("TV açıldı");
		}else {
			System.out.println("Tv kapandı");
			channel = 0;
			volume  = 0;
		}
		
		
		
	}

	@Override
	public void volumeDown() {
		volume --;
		
	}

	@Override
	public void volumeUp() {
		volume ++;
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		volume = 0;
		
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channel++;
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channel--;
		
		
	}
	
	
	void status() {
		if(power) {
			System.out.println("TV açık");
			System.out.println("Kanal: "  + channel);
			System.out.println("Ses: " + volume);
		}else {
			System.out.println("TV kapalı");
		}
	}
}






