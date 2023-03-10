package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		
		String str = "PayPal India";
		
		char[] charArray = str.toCharArray();
		
		//for(int i = 0; i<charArray.length;i++) {

			//System.out.print(charArray[i]);
			
		//}
		
		
		Set<Character> chset = new LinkedHashSet<Character>();
		
		Set<Character> dupset = new LinkedHashSet<Character>();
		
		for (Character c=0; c<charArray.length; c++) {
			
			if(!chset.add(charArray[c])) {
				
				dupset.add(charArray[c]);
			        
			}
			
			
		}
		
		System.out.println(dupset);	
	}

}
