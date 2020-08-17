package PracticeCodes;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String s="ppppppxzzzabcabcabcdabceabcabc";
		char[] chr= s.toCharArray();
		
		Map<Character, Integer> mp = new LinkedHashMap<Character,Integer>();
		for(char c: chr) {
			
			if(mp.containsKey(c)) {
				
				mp.put(c, mp.get(c) + 1);
			}
			else {
			mp.put(c, 1);
			}
			
		}
		System.out.println(mp);
		for(Map.Entry<Character, Integer> l: mp.entrySet()) {
			int m=l.getValue();
			if (m==1) {
				
				System.out.println("First no repeating char is :  "+l.getKey());
				break;
			}
			
			
		}
		

	}

}
