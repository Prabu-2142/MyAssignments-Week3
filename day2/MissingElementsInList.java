package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsInList {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,7,6,8};
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			arr.add(num[i]);
		}
		
		Collections.sort(arr);
		System.out.println(arr);
		
		
		for (int i = 0; i < arr.size(); i++) {
			
			Integer a = arr.get(i);
			if(a!= i+1) {
				System.out.println("The missing elemenmt is :" +(i+1));
				 break;
			}
		
			}
			
		

	}

}
