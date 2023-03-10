package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {

		int num [] = {1,5,1,3,7,4,2,2,8,9,10};

		Set<Integer> miss = new HashSet<Integer>();

		for (int i = 0; i < num.length; i++) {
			miss.add(num[i]);
			}
		
		System.out.println(miss);
		
		for (int j= 0; j<miss.size();j++) {
			
			if(!miss.contains(j+1)) {
				
				System.out.println((j+1));
			}
		}
			
	}

}
