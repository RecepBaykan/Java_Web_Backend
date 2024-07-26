public class Q008_Interface_Same_Default_Concrete_Metot_Dimond_Problems{
	
	/*
	 * İki veya daha fazla farklı interface'de, aynı concrete metot var ise ve bu farklı interface
	 * tek bir sınıfta uygunlanırsa, hangi metodu kullanacak?
	 * 
	 * 
	 * Buna elmas sorunu diyorlar.
	 * |
	 * Peki elmas ne alaka? Bu durumum şemalandırıken elmas'a benzer bir yapı
	 * çıkmıştır
	 * 
	 * 						InterfaceB.hello					
	 * 								|
	 * interfaceA.hello				|				interfaceC.hello
	 * 				\				|					/
	 * 				 \				|				   /
	 * 				  \				|				  /
	 * 				   \			|				 /
	 * 					\			|				/
	 * 					 \			|			   /
	 * 					  \			|			  /
	 *   				   \		|			 /
	 * 						\		|			/
	 * 						 \		|		   /
	 * 						  \	  	|		  /
	 * 							classD.hello()
	 * 
	 * Bir de bu elmas sorunun diğer hali, interface'lerin kalıtımı 
	 * ile olan halidir.
	 * 
	 * Aynı default concrete metot isimlerine sahip alt ve üst sınıfların
	 * oluşturduğu sorun.
	 * 
	 * Çünkü bu iki
	 * 
	 * interface A{
	 * 		default void hello(){
	 * 		}
	 * }
	 * 
	 * interface B extends A{
	 * 		default void hello(){
	 * 		}
	 * }
	 * 
	 * * interface C extends B{
	 * 		default void hello(){
	 * 		}
	 * }
	 * 
	 * class D implements A, B, C{
	 * 
	 * }
	 * 
	 * Büyük resmi görelim;
	 * 
	 * 	  					InterfaceB.hello
	 * 					  /			|		\
	 * 				     /			|		 \
	 *					/ 			|		  \
	 * 				   /			|		   \
	 * 				  /				|			\
	 * 				 /				|			 \	
	 * 				/				|			  \	
	 *   interfaceA.hello			|			    interfaceC.hello
	 * 				\				|					/
	 * 				 \				|				   /
	 * 				  \				|				  /
	 * 				   \			|				 /
	 * 					\			|				/
	 * 					 \			|			   /
	 * 					  \			|			  /
	 *   				   \		|			 /
	 * 						\		|			/
	 * 						 \		|		   /
	 * 						  \	  	|		  /
	 * 							classD.hello()
	 * 
	 * Tıpkı bir elmasa benzedi.
	 * 
	 * Peki bu sorunu nasıl çözeriz?
	 * 
	 * Sorunu anladığımıza göre burada bizim JVM'e yol göstermemiz gerekecektir.
	 * 
	 * Interface'lerin uygulanacağı sınıfta bu soruna yol açan metodunda
	 * public halinde yazmamız ve hangi interface'in default metodunu kullanmak
	 * istiyorsak onu super anahtar ile çağırmamız gerekir.
	 * 
	 * Yani sorun aslında hangi Interface'in default concrete metodu kullanılacak
	 * 
	 */
	
	public static void main(String[] args) {
		ClassOne classOne = new ClassOne();
		classOne.say();
	}

}



interface A{
	default void hello() {
		System.out.println("A hello");
	}
}

interface B extends A{
	default void hello() {
		System.out.println("B hello");
	}
}

interface C extends B{
	default void hello() {
		System.out.println("C hello");
	}
}

class ClassOne implements A,B, C, a,b,c{
	
	// Eğer bir durum belirtmezsek bu sınıfın hello metodunu
	// çağırırsa C'nin concrete metodunu getirir.
	// İnterface'leri kalıtıldığı içince ve Sınıfta uygulandığında bu durum 
	//böyledir
	
	
	@Override
	public void say() {
		a.super.say();
		
	}

}


interface a{
	default void say() {
		System.out.println("a interface'i say metodu çalıştu");
	}
}


interface b{
	default void say() {
		System.out.println("b interface'i say metodu çalıştu");
	}
}


interface c{
	default void say() {
		System.out.println("c interface'i say metodu çalıştu");
	}
}






