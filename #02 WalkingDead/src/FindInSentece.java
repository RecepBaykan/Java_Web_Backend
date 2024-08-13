public class FindInSentece {
	
	static String sentence = "Whether it’s simple sentences for "
			+ "\nthose just learning the English language or "
			+ "\nphrasing for an academic paper, this easy-to-"
			+ " \nuse sentence "
			+ "\ngenerator will help you choose your words with "
			+ "\nconfidence.\r\n"
			+ "\r\n"
			+ "With our sentence examples, seeing a word within "
			+ "\nthe context of a sentence helps you better "
			+ "\n understand  it and know how"
			+ "\n to use it correctly. From long to short, simple to "
			+ "\ncomplex, this tool can assist you with how to use words "
			+ "\nthat may have more than one meaning.";
	
	public static void main(String[] args) {
		
		
		
		int countS = 0;
		for(var c :  sentence.toCharArray()) {
			
			if(c == 's') {
				countS++;
			}
		}
		
		System.out.println("--------------------");
		System.out.println("Some chars counts");
		System.out.println("s char: " + countS);
	}

}
