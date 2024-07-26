
public class ScoreOfString {
	
	public static void main(String[] args) {
		
		System.out.println(sintcoreOfString("goxoq"));
	}
	
	 public static int  sintcoreOfString(String s) {
	     
			 
			 int score = 0;
			 int scoreTemp = 0;
			 
			 
			 for(int i = 1; i< s.length(); i++) {
				 
				 scoreTemp = scoreTemp + Integer.valueOf(s.charAt(i)) -  Integer.valueOf(s.charAt(i-1));
				 if(scoreTemp < 0) {
					 scoreTemp = -1*scoreTemp;
				 }
				 
				 score = score + scoreTemp;
			 }
			 
			 
			 return score;
			 
			 
		 
	    }

}
