package week3.day3;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		
		
		int num [] = {3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		
		Set<Integer> dup = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			dup.add(num[i]);
		
		}
		
		System.out.println(dup);

	}

}
