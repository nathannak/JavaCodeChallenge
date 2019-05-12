
public class Main {
	
	public static void main(String[] args) {

		//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		//Output: 7 -> 0 -> 8
		//Explanation: 342 + 465 = 807.
		
		Node root 			= new Node(1);
		root.next 			= new Node(2);
		root.next.next 		= new Node(3);
		root.next.next.next = new Node(4);
		
		Node node = reverseLL(root);
		
		while(node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
		
		System.out.print("null");
		
	}
	

public static Node reverseLL(Node root) {
	
	Node curr = root;
	Node prev = null;
	Node next = null;
	
	while(curr != null) {
		
		next = curr.next;
		
		curr.next = prev;
		
		prev=curr;
		curr=next;
		
	}
	
	return prev;

}

static class Node {
	
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
		next=null;
	}
	
}

}


