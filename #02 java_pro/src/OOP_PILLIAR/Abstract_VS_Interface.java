package OOP_PILLIAR;

public class Abstract_VS_Interface {
	
	/*
	 * 
	 * Abstract hem soyut hem de somut metotlar içerebilir.
	 * Interface Java 8'den sonra sadece soyut metotlar
	 * içeriyordu
	 * 
	 * 
	 * 
	 * Abstract'ta değişkenler static, static,final, 
	 * final olmayan şekilde olabilir. bunu belirtmemiz
	 * gerekir.
	 * Interface'de ise sadece static ve  finaldir belirtmeye
	 * gerek yoktur.
	 * 
	 * 
	 * Her ne kadar Java8'den sonra concrete (somut, gövdeli),
	 * metot yazılsada Interface'i Abstract'tan ayıran en önemli
	 * özellik, Interface ile çoklu kalıtıma izin verilir.
	 * 
	 * Lakin arayüzde uygulanan somut default metotlar, sürekli değişme
	 * uğruyorsa onu soyut olarak kullanmak ve sınıfta uygulamak
	 * daha anlamlı olur
	 * 
	 * Bu yüzden Interface tam soyutlama yapar.
	 * 
	 * 
	 * Peki Java 8'de neden default gövdeli metotlar 
	 * Interface'e geldi?
	 * 
	 * 1. Cevap; Mevcut arayüzün özelliklerini genişletmek için
	 * getirildi.
	 * 
	 * Şimdi diyelim 100 sınıfa aynı Interface uyguladık. 
	 * Interface'de yeni bir soyut metot tanıtırsak 100 sınıfta
	 * patlar. Bunun için tek bir default ve somut metot tanım-
	 * larız. Böylelikle isteyen sınıf uygular isteryen sınıf
	 * uygulamaz. Bir zorunluluk olmadığı gibi de patlama olmaz.
	 * 
	 * 
	 */
	
	

}
