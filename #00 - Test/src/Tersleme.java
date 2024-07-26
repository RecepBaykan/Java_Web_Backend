import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tersleme {

	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode node = new ListNode();
		ListNode temp = head;
		node  = temp;
		List<Integer> vals = new ArrayList<Integer>();
		

		while(head != null) {
			vals.add(head.val);
			head = head.next;
		}
		
		Collections.sort(vals);
		head = temp;
		
		for(Integer i : vals) {
			head.val = i;
            System.out.println(head.val);
			head = head.next;
		}
		head = temp;
		
		
		
		while(head != null) {
			vals.add(head.val);
			head = head.next;
		}
		
		Collections.sort(vals);
		head = temp;
		
		for(Integer i : vals) {
			head.val = i;
			head = head.next;
		}
		head = temp;
		
		while(head != null) {
			
			if(head.val % k == 0) {
				int tempVal = head.val;
				while(tempVal >1) {
					
					temp.val = tempVal;
					tempVal --;
					temp = temp.next;
					
				}
			}
			head = head.next;
		}
		
		
		
		return node;
	}

	
	
	
}
