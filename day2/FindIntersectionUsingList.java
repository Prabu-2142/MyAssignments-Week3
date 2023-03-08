package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		
		System.out.println(array1);
		
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		System.out.println(array2);
		
		Object[] ar1 = array1.toArray();
		Object[] ar2 = array2.toArray();
		
		for (int i = 0; i < ar1.length; i++) {
			
			for (int j = 0; j <ar2.length; j++) {
				
				if(ar1[i] == ar2[j]) {
					
					System.out.println(ar1[i]);
				}
			}
			
		}
		
	}

}
