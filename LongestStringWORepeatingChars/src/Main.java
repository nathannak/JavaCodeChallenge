
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

//		System.out.println(lengthOfLongestSubstring("abcabcbb",0));		
//		System.out.println(lengthOfLongestSubstring("pwwkew",0));
		System.out.println(lengthOfLongestSubstring("bbbbc"));
//		System.out.println(lengthOfLongestSubstring("anviaj"));
//		System.out.println(lengthOfLongestSubstring("dvdf"));

	}
	
	public static int lengthOfLongestSubstring(String str) {
	
        int n = str.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[str.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[str.charAt(j)] = j + 1;
        }
        
        return ans;
        
	}

}



//MY SOLUTION KEPT FOR LEGACY:

//public static int lengthOfLongestSubstring(String str,int len) {
//	
//	if(str.length() == 0) {return len;}
//	
//	HashSet<Character> set = new HashSet<>();
//	
//	for(int i=0; i < str.length(); i++) {
//		
//		if( set.contains( str.charAt(i) )) {
//			
//			len = Math.max(len,set.size());
//
//			set = new HashSet<>();
//			set.add(str.charAt(i));
//			
//		}else {
//			
//			set.add( str.charAt(i) );
//			len = Math.max(len,set.size());
//			
//		}
//		
//	}
//	
//	len = lengthOfLongestSubstring(str.substring(1),len);
//    return len;
//
//}

