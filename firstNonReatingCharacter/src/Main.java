import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String str= "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0; i < str.length(); i++) {

		if(map.containsKey(str.charAt(i))) {
		        map.put( str.charAt(i), 1+map.get(str.charAt(i)) );
		}       
	    else 
	    	{
		       map.put( str.charAt(i), 1 );
	    	}
		}
			
		
		char res=0;
		boolean res_bool = false;
			   
		Iterator it = map.entrySet().iterator();
			   
	    while (!res_bool && it.hasNext()) {
	                            
	    	Map.Entry pair = (Map.Entry)it.next();

			if((int)pair.getValue()==1) {
				
			        	res = (char)pair.getKey();
			        	res_bool = true;
			        	break;
			        	
			 	}
	                           
			}
	           
			    if(res_bool) {
			    	//return res;
			    	System.out.println(res);
			    }else {
			    	//return '_';
			    	System.out.println("NO RESULTS");
			    }
		
	}

}
