
public class ReverseSignedAndUnsignedInterger {

	
	
	public static void main(String[] args) {
		
		System.out.println(reverse(1534236469

));
	}
	
	
	public static int reverse(int x) {
		
		boolean negatif = false;
		
		if(x<0) {
			negatif = true;
			x = x * (-1);
		}
		
		try {
			x = Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());
		}catch (Exception e) {
		
			x = 0;
		}
		
		if(negatif) {
			x = x*(-1);
		}
		
	
		
		if( x > Integer.MAX_VALUE ||  x <Integer.MIN_VALUE){
			
			x = 0;
		}
		
		return x;
	}
}
