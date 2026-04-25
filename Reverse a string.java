import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(Solution.reversedString("hello  world"));
		/*
		String someThing;
		
		Scanner james = new Scanner(System.in);
		someThing =  james.nextLine();
		
		String reversedSentence = "";
		
		String[] words = someThing.split(" ");
		
		for (int j = 0; j < words.length - 1; j++) {
			
			reversedSentence = reversedSentence + word[ j ] + " ";
		//	reversedSentence += words[ j ] + " ";
		}
		
		System.out.println(reversedSentence);
		
		james.close();
	*/
    }
    
}

class Solution{
	
	static String reversedString(String sentence ){ 
	
	String[ ] sentenceList = sentence.split(" ");
	String reversed= "";
	
	for(int i = sentenceList.length -1;i >=0;--i){
		reversed = reversed + sentenceList[ i ] + " ";
		
	}
	return reversed.trim();
	
	}
	
}