public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.countVowels("Onkgopotse"));
		
	}
}

class Solution{
    
    static int countVowels( String str){
        
        String vowels ="AEIOUaeuio";
        int count = 0;
        for(int i =0; i < str.length( );++i){
            if(vowels.indexOf(str.charAt(i)) != -1){
            count ++;
            }
            
        }
        
        
        return count;
    }
    
    
}