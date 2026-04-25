public class Main {
	public static void main(String[] args) {
		
	System.out.println( Solution. revereString("HELLO WORLD"));
		
	}
}

class Solution{
    
    static String revereString( String sentence){
         String[ ] sentence_split = sentence.split(" ");
         String output = "";
        for( String word : sentence_split){
            
            output = word + " " + output ;
            
        }
        
        return output;
    }
    
    
}