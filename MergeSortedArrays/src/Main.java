import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//	static int[] arr1 = new int[] {1,1,1,1,1,1,1,1,1,1,4,4};
//	static int[] arr2 = new int[] {1,3,4,4,4,4,4,4,4,4,4};
	
//	static int[] arr1 = new int[] {};
//	static int[] arr2 = new int[] {1};
	
//	static int[] arr1 = new int[] {3};
//	static int[] arr2 = new int[] {1,2,4};
	
	static int[] arr1 = new int[]{2,2,2,2};
	static int[] arr2 = new int[]{2,2,2};

//	static int[] arr1 = new int[] {1};
//	static int[] arr2 = new int[] {2,3};
	
//	static int[] arr1 = new int[] {3};
//	static int[] arr2 = new int[] {1,2,4};
	
	static int count;
	
	public static void main(String[] args) {
		
		count = arr1.length + arr2.length;
		
		List<Integer> list = mergeSorted( arr1 , arr2 );
		System.out.println(list.toString());
		
	}
	
	
	public static List<Integer> mergeSorted(int[] arr1, int[] arr2) {
		
		
		int len1= arr1.length;
		int len2 = arr2.length;
		
		//System.out.println(len1);
		//System.out.println(len2);
		
		if( len1 == 0 ) {return Arrays.stream(arr2).boxed().collect(Collectors.toList()); }
		if( len2 == 0 ) {return Arrays.stream(arr1).boxed().collect(Collectors.toList()); }
		
//		if( Arrays.stream(arr2).boxed().collect(Collectors.toList()).size()==count) { return Arrays.stream(arr2).boxed().collect(Collectors.toList()); }

	    List<Integer> list = new ArrayList<>();
	    
		int i,j;
		
		for( i=0,j=0 ; i<len1 && j<len2 ; ) {
			
			if(arr1[i]<arr2[j]) {
				
				//if(!list.contains(arr1[i]))
				//{
				list.add(arr1[i]);
				
				if( list.size() == count ) {
					return list;
				}
				
				//}
				i++;
				
			}else if(arr1[i]>arr2[j]){
				
				//if(!list.contains(arr2[j]))
				//{
				list.add(arr2[j]);
				
				if( list.size() == len1+len2 ) {
					return list;
				}
				
				//}
				j++;
				
			}else if(arr1[i]==arr2[j]) {
				
				//if(!list.contains(arr2[j]))
				//{
				list.add(arr2[j]);
				
				if( list.size() == count ) {
					return list;
				}
				
				list.add(arr2[j]);
				
				if( list.size() == count ) {
					return list;
				}
				
				//}
				i++;
				j++;
				
			}
		}

		//
	
		if( (i>j && arr2.length-1 >= j) ) {
			
			while(arr2.length > j)
			{
				//if(!list.contains(arr2[j]))
				//{
				list.add(arr2[j]);
				//}
				j++;
			}
			
		}else if(j>i && arr1.length-1 >= i) {
			
			while(arr1.length > i)
			{
			
			//if(!list.contains(arr1[i]))	
			//{
			list.add(arr1[i]);
			//}
			i++;
			}	
			
		}
		///
		if(i==j && len1<=len2) {
			
			while(arr2.length > j)
			{
			
			//if(!list.contains(arr1[i]))	
			//{
			list.add(arr2[j]);
			//}
			j++;
			}
			}else if( i==j && len2<=len1 ) {
				
				while(arr1.length > i)
				{
				
				//if(!list.contains(arr1[i]))	
				//{
				list.add(arr1[i]);
				//}
				i++;
				
				}	
			}
			//
		
		if( list.size() == count ) {
			return list;
		}
		
		//
		if( !(len1 == i && len2 ==j) ) {
			
			if( i < len1 && i < count )
			{
				
//				if(i==1) {
//					
//					list = mergeSorted( Arrays.copyOfRange(arr1,i,len1+1) , list.stream().mapToInt(k->k).toArray() );
//					
//				}
//				else {
				
				int [] arr = new int[list.size()];
				for(int k =0 ; k < list.size(); k++) {
					arr[k] = list.get(k);
				}
				
				list = mergeSorted( Arrays.copyOfRange(arr1,i,len1) , arr );
				
				//}
				
			} else if( j < len2 && j < count ) {
				
				//int [] arr = new int[list.size()];
				//if( j==1) {j--;}
				
//				if(j==1) {
//					
//				list = mergeSorted( Arrays.copyOfRange(arr2,j,len2+1) , list.stream().mapToInt(k->k).toArray() );
//				
//				}
//				else {
				
				
				int [] arr = new int[list.size()];
				for(int k =0 ; k < list.size(); k++) {
					arr[k] = list.get(k);
				}
					
				
				list = mergeSorted( Arrays.copyOfRange(arr2,j,len2) , arr );
	
//				}
				
			}
			
		}
		
		return list;
		
	}
	
}
		
		//legacy
					
//		//if( !(len1 == i && len2 ==j) ) {
//		
//		//if(len1 > len2) {
//			
//			for(; i < len1 ; i++) {
//				//if(!list.contains(arr1[i]))
//				//{
//				list.add(arr1[i]);
//				//}
//			}
//			
//		//}
//		//else if(len2 > len1) {
//			
//			for(; j < len2 ; j++) {
//				//if(!list.contains(arr2[j]))
//				//{
//				list.add(arr2[j]);
//				//}
//			}
//			
//		//}
//		//}
//		
//		Collections.sort(list);
		
			