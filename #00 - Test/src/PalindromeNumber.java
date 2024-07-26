
public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(-121));
		
		System.out.println();
		
		

	}

	public static boolean isPalindrome(int x) {

		boolean a = false;
		int bolunen = x;
		int sayac = 0;
		int sayi = 0;
		int tempSayi = x;
		int modAlinanSayi = 0;

		try {
			while (bolunen / 10 != 0 && x>=0) {
				
				bolunen /= 10;
				
				sayac ++;
				
			}
			sayac++;
			
			//System.out.println("Basamak sayisi: " + sayac);
			
			

		} catch (Exception e) {
			
		}
		
		if(x>=0) {
		
			a = true;
			
			for(int i = 1; i<=sayac; i++) {

				modAlinanSayi = tempSayi % ((int)(Math.pow(10, i)));
				
			
				tempSayi -= modAlinanSayi;
				//System.out.println("Sayının son hali " + tempSayi);
				
				
				if(i >1) {
					modAlinanSayi  /= (int)(Math.pow(10, i-1));
				}
					//System.out.println("Mod" + (int)(Math.pow(10, i)) + " " + modAlinanSayi);
				
				sayi += modAlinanSayi * ((int)(Math.pow(10, sayac - i)));
				//System.out.println(sayi);
				
			}
			
			
			if(sayi == x) {
				a = true;
			}else {
				
				a = false;
			}
			
			
			
		
			
			
			
				
				
				
			
		}
		

		return a;

	}
}
