

public class Main {

	
static class ListNode {

	int val;
	ListNode next;
	
    ListNode(int x) { val = x; }

}


public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

	ListNode dummyHead = new ListNode(0);

	ListNode p = l1, q = l2, curr = dummyHead;

    int carry = 0;

    while (p != null || q != null) {

        int x = (p != null) ? p.val : 0;

        int y = (q != null) ? q.val : 0;

        int sum = carry + x + y;

        carry = sum / 10;

        curr.next = new ListNode(sum % 10);

        curr = curr.next;

        if (p != null) p = p.next;

        if (q != null) q = q.next;

    }

    if (carry > 0) {

        curr.next = new ListNode(carry);

    }

    return dummyHead.next;

	}


	public static void main(String[] args) {    
			
		ListNode root1 = new ListNode(1);
		root1.next = new ListNode(5);
		root1.next.next = new ListNode(7);
		
		ListNode root2 = new ListNode(3);
		root2.next = new ListNode(9);
		root2.next.next = new ListNode(2);
		
		ListNode res = addTwoNumbers(root1,root2);
		
		while(res != null) {
			
			System.out.print(res.val+"->");
			res = res.next;
			
		}
		
	}
	
}

