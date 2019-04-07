import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("civil"));
		System.out.println(isPalindrome("livci"));
		System.out.println(isPalindrome("ivicc"));;

	}
	
	public static boolean isPalindrome(String str) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		boolean res=true;
		
		for( int i = 0 ; i < str.length() ; i++ ) {
			
			if(map.containsKey(str.charAt(i))) {
				
				int temp = map.get(str.charAt(i));
				temp++;
				
//				Integer temp = new Integer(map.get(str.charAt(i)));
//				temp +=1;
				
				map.put(str.charAt(i), temp );
								
			}else {
				map.put(str.charAt(i), 1);
			}
		
		}
		//
		boolean showMercy = true;
		
		for (Integer value : map.values()) {
		    if(value%2 != 0 && !showMercy)
		    {
		    	res = false;
		    }
		    else if(value%2 != 0 && showMercy) {
		    	showMercy= false;
		    }
		}
		
		return res;
	
	}
	//
	
	

}
