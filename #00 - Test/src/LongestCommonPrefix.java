import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));
		
	}
	
	
	public static String longestCommonPrefix(String[] strs) {
		
		
		//Kontrol et
		
		if(strs == null || strs.length < 1) {
			
			return "";
		}
		
		
		// Elemanları büyükten küçüğe sırala;
		Arrays.sort(strs);
		
		/*
		 * 
		 * Eğer ilk eleman ile son eleman aynı harf ile başlıyorsa
		 * ortadaki elemanlarda aynı harfle başlıyordur demektir
		 * 
		 */
		
		String first = strs[0];
		String last = strs[strs.length-1];
		
		int indis = 0;
		
		while(indis < first.length()) {
			
			if(first.charAt(indis)== last.charAt(indis)) {
				
				indis++;
			}else {
				break;
			}
		}
		
		
		return first.substring(0, indis);
		
		
	}
	
	
	
	public static String longestCommonPrefix2(String[] strs) {

		String s = "";
		
		int enKucukIndis = strs[0].length();
		
		for(int i = 0; i<strs.length; i++) {
			
			if(strs[i].length() < enKucukIndis) {
				
				enKucukIndis = strs[i].length();
			}
		}
		
		for(int i = 0; i<enKucukIndis; i++) {
			
			char c = strs[0].charAt(i);
			boolean a = true;
			boolean kir = false;
			
			for(int j =1; j<strs.length; j++) {
				
				if(strs[j].charAt(i) != c) {
					a = false;
					kir = true;
					break;
				}
				
			}
			
			if(a) {
				
				s += String.valueOf(c);
			}
			
			if(kir) {
				break;
			}
			
			
		}
		
		return s;
	}
	
}
