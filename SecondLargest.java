public class Main {
	public static void main(String[] args) {
	
	 System.out.println( Solution.secondLargest(new int[ ] {9,10}));
		
		
		
	}
}

class Solution{
	 static int secondLargest(int[ ] array){
		int max = Integer. MIN_VALUE;
		for(int num : array){
			if( num > max){
				max = num;	
			}
		}
			
		int secondMax = Integer. MIN_VALUE;
		for(int i = 0; i < array.length; ++i){
			if( array[ i ] > secondMax && array[ i ] != max){
				secondMax = array[ i ];
		
			}
			
		}
		
		if( secondMax != 0){
		
	    	return secondMax;
		}else{
			return -1;
		}
	}
	
	
}