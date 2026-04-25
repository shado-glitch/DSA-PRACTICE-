public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.nFactorial(5));
		
	}
}

// Write a Program to Find Factorial of a
//Number in Java.

class Solution{
    static int nFactorial(int n){
    int product = 1;
    for( int i = 1; i <= n ; ++i){
            product = product * i; 
     }   
       return product;
    }  
    
}
