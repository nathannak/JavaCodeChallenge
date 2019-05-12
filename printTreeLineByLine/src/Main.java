import java.util.LinkedList;
import java.util.Queue;

public class Main{

  
static class BinaryTree 
{ 

	Node root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
  
}

static class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
}

public static void printLevel(Node root) {
	
	Queue<Node> q = new LinkedList<>();
	
	if(root==null)
		return;
	
	q.add(root);
	
	while(q.size() !=0) {
		
		int size = q.size();
		
		while(size>0) {
			
			Node node = q.remove();
			System.out.print(node.key+ " ");
			
			if(node.left != null)
				q.add(node.left);
			
			if(node.right != null)
				q.add(node.right);
			
			size--;
		
		}
		
	}
	
}


  

  
    // Driver method 
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        
        printLevel(tree.root);

    } 
} 
