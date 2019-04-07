import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; next=null; }
 }

class Solution {

    public ListNode addTwoNumbers(ListNode n1, ListNode n2) {
        
		int mul=1;

		int num1 = 0;

		int num2 = 0;

		while(n1!= null) {

			num1 += (n1.val)*mul;

			mul *= 10;

			n1 = n1.next;

		}
		
		mul=1;

		while(n2 != null) {

			num2 += (n2.val)*mul;

			mul *= 10;

			n2 = n2.next;

		}
		
		int num = num2+num1;
        
        //
        
        int num_copy = num;

		ListNode root = new ListNode(num%10);
        
		num /= 10;

		ListNode root_copy = root;

		while(num_copy>= 10) {

			root.next = new ListNode(num%10);

			root = root.next;
			
			num /= 10;

			num_copy /= 10; 
			
		}

		return root_copy;
        
    }
    
}

public class MainClass {
    
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
    	
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new Solution().addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
        
    }
    
}