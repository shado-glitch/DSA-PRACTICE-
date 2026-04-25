public class Main {
	public static void main(String[] args) {

		int [] swapped = Solution.swapVariables(
		5,6);
		
		System.out.println(swapped[0] + ", "+ swapped[1]);
	}
}


class Solution{
    static int[] swapVariables( int a , int b){
        
        return new int[ ] { b,a} ;
        
    }
    
}