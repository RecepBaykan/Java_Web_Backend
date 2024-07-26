
public class ZigZag {

	public static void main(String[] args) {

		ZigZag zag = new ZigZag();

		String a = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers";

		/*
		 * 
		 * A i o s r h e m , t s e o i h a r t a a e e r i w g r l a
		 * plnrmiaodprs,ubroohreunefnttacneedhsmwynihrieto,iheeaalwn a d e w , a n e r e
		 * q c u s t b a e e i t d c n t n l o c
		 * 
		 * 
		 * 
		 */

		/*
		 * P A H N A L I G Y I R P S I
		 * 
		 * 
		 * PPSNG AAHI YLIN
		 */

		System.out.println(zag.convert(a, 3));

		System.out.println(a.length());
		System.out.println(zag.convert(a, 3).length());
	}
	
	
	public String convert(String s, int numRows) {
		
		String zigZag = "";
		
		
		
		
		
		
		
		return zigZag;
	}
	
	
	

	public String convert2(String s, int numRows) {
		String zigZag = "";

		boolean yCount = false;
		int siraY = 0;
		if (numRows >= 2) {

			siraY = s.length() - s.length()/numRows;
			
		}

		char[][] dizi = new char[numRows][siraY];
		int sira = 0;
		int tempX = 0;

		for (int y = 0; y < siraY; y++) {
			if (numRows <= 1 || sira >= s.length()) {
				break;
			}
			for (int x = 0; x < numRows; x++) {

				if (sira < s.length()) {

					dizi[x][y] = s.charAt(sira);

					if (x == numRows - 1) {

						yCount = true;
						tempX = x;
						sira++;
					} else {
						sira++;
					}

					while (yCount && y < siraY && sira < s.length()) {

						if (x == 1) {
							x = tempX;
							yCount = false;

						} else {

							x--;
							y++;

							dizi[x][y] = s.charAt(sira);
							sira++;
						}

					}

				}

			}

		}

		for (int x = 0; x < numRows; x++) {
			if (numRows <= 1) {
				zigZag = s;
				break;
			}
			for (int y = 0; y < siraY; y++) {

				if ((int) dizi[x][y] != 0) {

					zigZag = zigZag + String.valueOf(dizi[x][y]);
				}

			}

		}

		return zigZag;

	}

}
