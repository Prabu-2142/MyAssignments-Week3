package week3.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMap {

	public static void main(String[] args) {
		
		String name = "amazon development Center";
		
		char[] charArray = name.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				
				Integer add = map.get(charArray[i]);
				map.put(charArray[i], add+1);
			}
			
			else {
				
				map.put(charArray[i], 1);
			}
			
		}
		System.out.println(map);
	}

}
