import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-1,-2,-3,3};
		find3Sum(arr);

	}
	
	public static void find3Sum(int[] arr){
		
		
		Arrays.sort(arr);
		
		for(int i=0 ; i < arr.length; i++) {
			
			if(i != 0 && arr[i]==arr[i-1]) {continue;}
			
			int j = i + 1;
			int k = arr.length-1;
			
			while(j <= k) {
				
				
				if(arr[i]+arr[j]+arr[k]==0) {
					
					System.out.println((arr[i] + " " + arr[j] + " " + arr[k]));
					j++;
					
					while(j<k && arr[j]==arr[j-1]) {j++;};
					
				}
				else if (arr[i]+arr[j]+arr[k] < 0) {
					j++;
				}else {
					k--;
				}
				
				
			}
		}
		
	}

}
