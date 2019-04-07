
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,1,6,0,20};
		doInsertionSort(arr);
		
		for(int item : arr) {
			System.out.print(item+" ");
		}

	}
	
    public static void doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
        	
            for(int j = i ; j > 0 ; j--){
            
            	if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            	
            }
        }
        
        // no need to return the array,  
        // return input;
        
    }


}
