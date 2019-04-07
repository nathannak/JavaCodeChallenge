import java.util.LinkedList;
import java.util.Queue;

public class Main {
		
	public static void main(String[] args) {
		
		Queue<Node> q = new LinkedList<>();
		
		Node root = new Node(4);
		root.next = new Node(7);
		root.next.next = new Node(5);
		root.next.next.next = new Node(3);
		root.next.next.next.next = new Node(1);
		
		nthElementToTheEnd(root, 2);
		
	}
	
	static void nthElementToTheEnd(Node root, int n) {
		
		Node node = root;
		Node node_copy = root;
		
		for(int i=0 ; i < n ; i++) {
			node_copy = node_copy.next;
		}
		
		while(node_copy.next != null) {
			node_copy = node_copy.next;
			node = node.next; 
		}
		
		System.out.println(node.data);
		
	}
	
	
	
	static class Node {
		
		int data;
		
		Node(int data){
			this.data = data;
		}
	
		Node next = null;
	
	}
	
	
	
}