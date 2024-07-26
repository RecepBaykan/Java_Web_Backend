

public class Q007_Why_HAS_INTERFACE_CONCRETE_METHOD {

	/*
	 * Interface'ler neden concrete metotlara sahiptir.
	 * 
	 * Bir örnek üzerinden düşünelim;
	 * 
	 * 100 sınıf var ve hepsi bir interface'i kullanıyor.
	 * Interface'den yeni bir abstract metot eklersek eğer
	 * 100 sınıfta patlar ve syntax hatası olur. Tek tek
	 * uğraşılması ve üzerine düşülmesi gerekir.
	 * 
	 * Bu tür durumları yönetilebilir kılmak için default concrete
	 * metotlar getirilmiştir.
	 * 
	 * Interface'de tanımlanan default metotlar, hiçbir sınıfın uygulamak
	 * zorunda olmadığı metotlardır.
	 * 
	 * İster 100 sınıf kullanabilir istenilirse sınıflar bu default metotodu
	 * geçersiz kılıp kendi istedikleri uygulamayı kullanabilir
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * Aşağıdaki kod normal şartlarda çalışıyor. Eclipse'ten kaynaklanan 
	 * bir sorun olabilir.
	 * 
	 * 
	 */
	/*
	public static void main(String[] args) {
		
		ClassOne classOne = new ClassOne();
		
		classOne.method();
		
		ClassTwo classTwo = new ClassTwo();
		
		classTwo.method();
		
	}
	
	*/
}
/*
interface Interface{
	
	default void method(){
		System.out.println("Bu Interface içindeki default method");
	}
}


class ClassOne implements Interface{
	
	
	
}


class ClassTwo implements Interface{
	
	
	 public void method() {
		System.out.println("Sınıf içinde ezilmiş metot");
	}
}
*/





