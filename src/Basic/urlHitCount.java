package Basic;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class urlHitCount {
	
	  public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
	        return wordCounts.entrySet()
	                .stream()
	                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	        
	    }

	static void fun() {
		String arr[] = { "fb", "google", "fb", "orkut" };

		Map<String, Integer> mp = new HashMap<String, Integer>();

		for (String k : arr) {
			if (mp.containsKey(k)) {

				mp.put(k, mp.get(k) + 1);

			} else {

				mp.put(k, 1);
			}

		}
		System.out.println(sortByValue(mp));
		//System.out.println(mp.get("fb"));
		Map<String, Integer> sorted = mp
				.entrySet()
		        .stream()
		        .sorted(comparingByValue())
		        .collect(
		            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
		                LinkedHashMap::new));
		 
		    System.out.println("map after sorting by values: " + sorted);
		    
		    
		    Map<String, Integer> sorted1= mp.entrySet()
	        .stream()
	        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	        .collect(
	            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
	                LinkedHashMap::new));
	 
	    System.out.println("map after sorting by values in descending order: "
	        + sorted1);
		
		

	}

	public static void main(String[] args) {
		fun();

	}

}
