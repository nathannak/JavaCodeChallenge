import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	
	  static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	  static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	    	
	public static void main(String[] args) {
			
		addNum(3);
		addNum(5);
		addNum(8);
		addNum(9);
		addNum(10);
		addNum(11);
		addNum(1);
		
		System.out.println(MedianFinder());
		
	}
	
	public static Integer MedianFinder() {

	        if(minHeap.size() > maxHeap.size()){
	            return minHeap.peek();
	        }else {
	            return (minHeap.peek()+maxHeap.peek())/2;
	        }
	}
	
	public static void addNum(int num) {
		
		minHeap.offer(num);
    	maxHeap.offer(minHeap.poll());

    	if(minHeap.size()<maxHeap.size()){
    		minHeap.offer(maxHeap.poll());
    	}
    	
	}

}