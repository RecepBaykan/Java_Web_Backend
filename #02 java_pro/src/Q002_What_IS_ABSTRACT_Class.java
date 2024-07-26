

public class Q002_What_IS_ABSTRACT_Class {

	/*
	 * Abstract Class (soyut sınıf) nedir?
	 * 
	 * abstract anahtarı ile tanımlanan sınıflar, abstract (soyut sınıf) olarak
	 * bilinir.
	 * 
	 * Abstract sınıflar, abstract metotlar (soyut, gövdesiz) ve concrete (somut,
	 * gövdeli) metotlar içerebilir.
	 * 
	 * Abstract sınıflar örneklendirilemez. Başka bir sınıf tarafından, abstract
	 * sınıfa genişletilme olamadığı sürece kullanılamayacağı anlamına gelir.
	 * 
	 * Abstract class içindeki abstract (soyut) metotlar da abstract anahtarı ile
	 * belirtilir.
	 * 
	 * Abstract sınıftan genişletilen sınıflar, abstract class'ın, abstract
	 * metotlarını da uygulanmak zorundadır.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	// TV Kumandası ve İşlevlerini gösteren bir Abstract sınıf örneği.
	/*
	 * Örneğimizde İşlevleri işaretleyen bir abstract sınıf inşa ettik Sonra
	 * işlevleri uygulaayan bir normal sınıf inşa ettik Daha sonra abstract sınıftan
	 * türetilen normal sınıf içinde abstract metotlar işlendi
	 * 
	 */
	public static void main(String[] args) {

		RemoteTV remoteTV = new RemoteTV();

		remoteTV.status();
		remoteTV.power(remoteTV.power);
		
		remoteTV.status();
		
		remoteTV.batteryStatus();
		
		for(int i = 0; i<10; i++) {
			remoteTV.channelUp();
		}
		
		
		for(int i = 0; i<5; i++) {
			remoteTV.volumeUP();
		}
		
		remoteTV.status();
		
		
		remoteTV.power(remoteTV.power);
		remoteTV.status();
	
		remoteTV.power(remoteTV.power);
		remoteTV.status();
		
	}

}

// Abstract class tanımlama
abstract class AbstractClass {

	// Abstract metot tanımı
	abstract void abstractMethod();

	// Abstract sınıf içinde concret(gövdeli metot tanımı)
	// Normal metot yani
	void concreteMethod() {
		// işlemler
	}

}

// Abstract metotu kalıtımla kullanma;
class subClass extends AbstractClass {

	@Override
	void abstractMethod() {
		// işlemler

	}

}

//Gerçek dünya örneği
abstract class RemoteButton {

	// Power
	abstract void power(boolean power);

	// VolumeUp
	abstract void volumeUP();

	// VolumeDown
	abstract void volumeDown();

	// ChannelUp
	abstract void channelUp();

	// ChannelDown
	abstract void channelDown();

	// BatteryStatus
	void batteryStatus() {
		System.out.println("Battery is full");
	}

}

class RemoteTV extends RemoteButton {
	int volumeLevel;
	int channelLevel;
	boolean power;

	@Override
	void power(boolean power) {
		power = (!power) ? true : false;
		this.power = power;

		if (!power) {
			System.out.println("TV kapanma sinyali gönderildi");
			channelLevel = 0;
			volumeLevel = 0;
		}else {
			System.out.println("TV açma sinyali gönderildi");
		}

	}

	@Override
	void volumeUP() {
		// TODO Auto-generated method stub
		this.volumeLevel++;
	}

	@Override
	void volumeDown() {
		this.volumeLevel--;
	}

	@Override
	void channelUp() {
		// TODO Auto-generated method stub
		this.channelLevel++;
	}

	@Override
	void channelDown() {
		// TODO Auto-generated method stub
		this.channelLevel--;
	}

	public void status() {

		if (!power) {
			System.out.println("TV Kapalı");
		} else {
			System.out.println("TV Açık");
			System.out.println("Kanal: " + channelLevel);
			System.out.println("Ses: " + volumeLevel);
		}
	}
}
