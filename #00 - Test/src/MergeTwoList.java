import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoList {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		
		ListNode[] l = {list1, list2};

			if (list1 == null && list2 == null) {
				return null;
				
			}else {
				
				return alt(l);
			}

			
			
		
		
		
		
		
		
		
	

	}
	
	
	public ListNode alt(ListNode[] lists) {

		try {
			
			if(lists.length == 0) {
				return null;
			}
			
			
			
			ListNode listNode = new ListNode();
			ListNode tempList = listNode;
			List<Integer> vals = new ArrayList<Integer>();
			
	
			int sayac = 0;
			for(int i = 0; i<lists.length; i++) {
				
				if(lists[i] == null) {
					sayac ++;
					continue;
				}
				
				while(lists[i] !=null) {
					
					vals.add(lists[i].val);
					lists[i] = lists[i].next;
					
				}
			}
			
			if(sayac == lists.length) {
				return null;
			}
			
			
				Collections.sort(vals);
				
			for(int i = 0; i<vals.size(); i++) {
				
				
				tempList.val = vals.get(i);
				if(i<vals.size() -1) {
					tempList.next = new ListNode();
					tempList = tempList.next;
				}
			}
				
				
			
			
			
			
			return listNode;
			
		}catch(Exception e) {
			return new ListNode();
		}
		
	}
}

class ListNode {

	ListNode next;
	int val;
}