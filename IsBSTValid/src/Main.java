import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//THERE IS A BETTER SOLUTION FOR THIS: http://www.java2novice.com/java-interview-programs/validate-binary-search-tree-bst/

public class Main {
	
	static List<Integer> list;

	public static void main(String[] args) {
				Node root = new Node(5);
				root.left = new Node(4);
				root.left.left = new Node (3);
				root.right = new Node(6);
				
				list = new ArrayList<>();
				
				// do in order traversal and  check if it's sorted
				inOrderTraversal(root);
				
				
				System.out.print(list.toString());
				
				for(int i =1; i < list.size(); i++) {
					
					if(list.get(i-1) > list.get(i)) {
						System.out.println("NOT BST");
					}
					
				}
				
	}
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			left = null;
			right=null;
		}
		
	}
	
	public static void inOrderTraversal(Node root){
		
		if(root==null) {
			return;
		}

		inOrderTraversal(root.left);
		
		//q.offer(root.data);
		list.add(root.data);
		System.out.println(root.data);
	
		inOrderTraversal(root.right);
		
	}

}
