package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharUsingSet {

	public static void main(String[] args) {
		
		
		String companyName = "prabpu";
		
		char[] charArray = companyName.toCharArray();
		
		System.out.println(charArray);

		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (Character ch : charArray) {
		
			unique.add(ch);
			
		}
		
				System.out.println("The Unique Set is : "+unique);
			
			
		
	}

}
