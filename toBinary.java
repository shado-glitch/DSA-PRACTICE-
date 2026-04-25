public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.toBinary(50));
		
	}
}
/*
 
😊 To convert an integer to binary manually:
- Divide the number by 2.
- Record the remainder (0 or 1).
- Repeat with the quotient until you get 0.
- Read the remainders in reverse order.

Example: 5
- 5 ÷ 2 = 2, remainder 1
- 2 ÷ 2 = 1, remainder 0
- 1 ÷ 2 = 0, remainder 1
- Binary: 101
 */
 
 
 class Solution{
     static String toBinary(int num){
             String binary = "";
             if( num == 0){ return "0";}
             while(num > 0){
                 binary = (num % 2) + binary;
                 num /= 2;                
             }
             
         
       return binary; 
     }
     
     
     
 }