import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperations {
	
	public static void main(String[] args) {
		
		int[] a = {3,4,5};
		System.out.println(minOperations(a));
	}

	public static int minOperations(int[] nums) {

		
		List<Integer> deletedList =  new ArrayList<Integer>();

		for(int i :nums) {
			
			deletedList.add(i);
			
		}
		
		for(int i : deletedList) {
			
			for(int j = 0; j< deletedList.size(); j++) {
				
				if(i == deletedList.get(j)) {
					deletedList.remove(i);
					deletedList.remove(j);
				}
				
			}
		}
		
		
		if(deletedList.size() == 1) {
			return deletedList.get(0);
		}else {
			
			return -1;
		}
		
	}

}
