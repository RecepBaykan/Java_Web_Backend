
public class StringToInteger {

	public static void main(String[] args) {

		System.out.println(stringToInteger("  +  413"));

	}

	public static int stringToInteger(String s) {
		int a = 0;
		String b = "";
		boolean negatif = false;
        boolean sayildi = false;
		for (int i = 0; i < s.length(); i++) {

			if(String.valueOf(s.charAt(i)).equals(" ")) {
				
				if(b.isEmpty()){
                    
                    continue;
                }else{
                    break;
                }
			}else{
                
            }
			
			
            if(String.valueOf(s.charAt(i)).equals("-") && !b.isEmpty()) {
				
				break;
				
			}
			
			if(!sayildi && String.valueOf(s.charAt(i)).equals("-")){
				
				negatif = true;
				sayildi = true;
                continue;
			}
            
         
			
			try {
				
				a = a + Integer.valueOf(String.valueOf(s.charAt(i)));
				
				b = b + String.valueOf(s.charAt(i));
				
			}catch (Exception e) {
				break;
			}
			
			
		}
		
		
		try {
			if(b.equals("")) {
				a = 0;
			}else {
				a = Integer.valueOf(b);
				if(negatif) {
					
					a = a*(-1);
				}
			}
			
		}catch (Exception e) {
			if(negatif) {
				a = Integer.MIN_VALUE;
				
			}else {
				a = Integer.MAX_VALUE;
			}
		}
		
		

		return a;
	}
}
