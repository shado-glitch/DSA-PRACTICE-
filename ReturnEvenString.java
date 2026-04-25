public class Main {
	public static void main(String[] args) {
	    
 System.out.println(Solution.returnEven("This is a java language"));	
	}
}


class Solution{
    
      static String returnEven( String sentence ){
          	
	String output = "";
String[ ] sentenceArray = sentence.split( " ");
   for( String word : sentenceArray ){
         
         if( word.length( ) % 2 == 0){
             output = output + word + " ";
         }         
   }
         
          return output;
          
      }



}