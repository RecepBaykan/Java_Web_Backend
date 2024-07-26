

public class Q003_Abstract_Class_Constructer {
	
	/*
	 * Abstract sınıfların, constructer'ı var mıdır?
	 * 
	 * Evet vardır.
	 * 
	 * Ya bizler tanımlarız yada tanımlamazsak JVM boş bir yapıcı
	 * constructer atar.
	 * 
	 * 
	 * Peki soyut sınıfın nesnesi oluşturulmazken neden bir constructer (yapıcı)
	 * metodu vardır?
	 * 
	 * Constructer ile ilgili bilmemiz gerekenler, o sınıfın verilerini başlatmaktır.
	 * Soyut sınıfın verileri de olabilir.
	 * 
	 * 
	 * Abstract sınıflar, türetilen nesne oldukları için yapıcı metotlarına
	 * erişmesi otomatik olur. Yani alt sınıfın ilk satırı her zaman abstract sınıfının 
	 * constructer (yapıcı) metodudur.
	 * 
	 * Alt sınıfın constructer metodunda da super anahtarı ile de çağrılabilir.
	 * ama eğer super anahtarı ile çağrılarsa, alt sınıfın construceter'ın ilk derlenecek satırı muhakkak
	 * super ilk satır olmalı. Yoksa hata verir.
	 * 
	 * Ne olursa olsun, ilk önce üst sınıfın yani superclass'ın constructer'ı
	 * çağrılır.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		DemoClass demoClass = new DemoClass();
		
		System.out.println(demoClass.a);
		
	}
	

}


abstract class MyAbstractClass{
	
	int a;
	
	public MyAbstractClass() {
		
		a = 10;
		System.out.println("Abstract sınıfın Constructer metodu çalıştı");
	}
	
}


class DemoClass extends MyAbstractClass{
	
	public DemoClass() {
	// TODO Auto-generated constructor stub
		System.out.println("DemoClass Constructer çalıştı");
}
	
}



