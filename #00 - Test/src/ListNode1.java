
public class ListNode1 {

	public static void main(String[] args) {

		int[] list1 = { 2, 4, 9 };
		int[] list2 = { 5, 6, 4, 9 };

		ListNode listNode = new ListNode();
		ListNode listNode2 = new ListNode();

		ListNode temp1 = listNode;
		ListNode temp2 = listNode2;

		for (int i = 0; i < list1.length; i++) {

			temp1.val = list1[i];

			if (i != list1.length - 1) {
				temp1.next = new ListNode();
				temp1 = temp1.next;
			}
		}

		for (int i = 0; i < list2.length; i++) {

			temp2.val = list2[i];

			if (i != list2.length - 1) {
				temp2.next = new ListNode();
				temp2 = temp2.next;
			}
		}

		ListNode node = addTwoNumbers(listNode, listNode2);

		while (node != null) {

			System.out.print(node.val  + " ");
			node = node.next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode node = new ListNode();
		ListNode tempNode = node;
		int elde = 0;

		while (l1 != null && l2 != null) {

			node.val = elde + l1.val + l2.val;
			elde = 0;
			if (node.val > 9) {

				node.val = node.val - 10;
				elde++;
			}

			if (l1.next == null && l2.next == null) {

				if (elde == 1) {
					node.next = new ListNode();
					node = node.next;
					node.val = elde;
					

				}

				l1 = l1.next;
				l2 = l2.next;

			} else {

				if (l1.next == null) {
					l1.next = new ListNode();
					System.out.println("l1.next Boş");
				}

				if (l2.next == null) {
					l2.next = new ListNode();
					
				}

				l1 = l1.next;
				l2 = l2.next;

			}

			if (l1 != null || l2 != null) {

				node.next = new ListNode();
				node = node.next;

			}

		}

		node = tempNode;

		return node;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}