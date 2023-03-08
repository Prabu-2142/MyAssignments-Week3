package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestlist {

	public static void main(String[] args) {
		 
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		
		Collections.sort(arr);
		
		System.out.println("The second largest number is : "+arr.get(4));
		

	}

}
