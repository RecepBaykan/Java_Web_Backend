

public class ReverseChar {

	public static void main(String[] args) {

		char[] c = { 'h', 'e', 'l', 'l', 'o' };

		reverse(c);
	}

	public static void reverse(char[] s) {

		int left = 0;
		int right = s.length -1;
		
		char temp = 0;
		
		
		while(left<right) {
			
			temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			
			left ++;
			right --;
			
			
		}
		
		for(char c: s) {
			
			System.out.println(c);
		}
		
	
	}
}
