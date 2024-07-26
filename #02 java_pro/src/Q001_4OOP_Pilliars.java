

public class Q001_4OOP_Pilliars {

	/*
	 * Orient Object Programing'in en önemli 4 özelliği nelerdir?
	 * 
	 * 1. Abstraction (soyutlama)
	 * 2. Encapsulation (kapsülleme)
	 * 3. Inheritance (Kalıtım)
	 * 4. Polymorphisim (Çok biçimlilik)
	 *
	 *
	 *
	 */
	
	// ------- 1. Abstraction -------- //
	/*
	 * Abstraction (Soyutlama); 
	 * Kullanıcıya sadece işlevselliğini bildiren implementasyon detaylarını
	 * gizleme sürecidir.
	 * 
	 * implementasyon: Bir planın, düşüncenin eyleme geçirilmesi demektir.
	 * 
	 * Gerçek dünya örnekleri;
	 * 1. TV Kumandası: TV'yi açmak için güç düğmesine basarsınız ama kızıl ötesinin
	 * dalga boyutunu, hızını ve TV'nin sinyali nasıl aldığı kısmını bilmeyiz. Sadece
	 * işlevini yerine getiririz.
	 * 
	 * 2. Araba Vitesleri: Araba vitesini değiştiririz ama bu işlemin nasıl gerçekleştiğini
	 * bilmeyiz.
	 * 
	 * Yani aslında ne yapacağını söyleriz ama nasıl yapılacağınız bilmek zorunda değiliz.
	 * 
	 * Java'da iki türü abstratcion vardır
	 * 
	 * 1. Abstract class
	 * 2. Interface
	 * 
	 */
	
	//------------------------------------//
	
	// ------ 2. Encapsulation (Kapsülleme) ------- //
	
	/*	
	 * Encapsulation (kapsülleme);
	 * Verileri ve metotları bir sınıf içinde bağlama sürecidir.
	 * Bir sınıfın temel detaylarını erişim kontrol belirleyicileri
	 * kullanarak gösterebiliriz.
	 * Bu yüzden Encapsulation(kapsülleme) istenen seviyede bir Abstraction'dır.
	 * 
	 * Erişim kontrol belirleyicileri: private, protected, public.
	 * 
	 * 
	 * Örnek; Bir bean tüm verileri private idir ve dış dünyaya bunların erişimi
	 * için bir public metotları tanımlanır.
	 * 
	 * 
	 * 
	 */
	
	
	// --------------------------------------------------------------------------- //
	
	// ------------- 3. Inheritance (kalıtım) -------------------------//
	
	/*
	 * Inheritance(kalıtım) kullanmak, sınıflar arasında baba-oğul ilişkisi tanımlamak
	 * demektir. Böylece üst (baba) sınıfta tanımlanan kodu alt (oğul) sınıfta kullanılabilir
	 * anlamına gelir.
	 *
	 * Kodun yeniden kullanılabiliriği, zaten en büyük avantajdır.
	 * 
	 * Java sınıflar arasında çoklu kalıtıma izin vermez, interfaces(arayüzler) ile izin verir.
	 * 
	 *
	 * 
	 * 
	 * 
	 */
	
	//---------------------------------------------------------------------------//
	
	
	// -------------- 4. Polymorphizim(Çok biçimlilik) -------------------------//
	
	/*Polymorphizim(çok biçimlikik):
	 * Poly -> çok, morphizim -> biçimlilik anlamına gelir.
	 * Polymorphizim, bir nesnenin veya fonksiyonun farklı biçimler alması sürecidir.
	 * 
	 * 
	 * İki türü vardır;
	 * 1. Derleme zamanı Polymorphizm (Method overloadding)(Aşırı yükleme):
	 * Method overloadding (aşırı yükleme), aynı sınıftaki iki metodunda veya daha fazla
	 * metodun farklı argümanlar alması sonucu derleme sırasında kullanımı kararlaştırılan metotlardır.
	 * Çünkü nerede ne biçimde çağrıldığına göre derleme sırasında kullanımı kararlaştırılır.
	 * 
	 * 2. Çalışma Zamanı Polymorphizim (Metot override)(aşırı yazma):
	 * Metot override (aşırı yazma) bir üst sınıfın, alt sınıfta aynı isimde ve parametrede
	 * metotları olması durumunda ortaya çıkabilen durumdur. Bunun için özel implementasyon 
	 * sağlanmalıdır.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
