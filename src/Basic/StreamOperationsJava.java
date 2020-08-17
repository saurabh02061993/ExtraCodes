package Basic;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperationsJava {

	public static void main(String[] args) {
		
		//firstExample
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
		
		
		//SecondExample
		IntStream.range(1, 10).skip(5).forEach(x->System.out.print(x+" "));
		System.out.println();
		
		//third: print sum of the given 1 to 10 elements
		System.out.println(IntStream.range(1, 11).sum());
		System.out.println();
		
		
		
		//4. streamOF
			Stream.of("Saurabh","Ramandeep", "Mandeep").sorted().findFirst().ifPresent(System.out::print);
			System.out.println();
			System.out.println();
			
			String[] schoolbag = { "Books", "Pens", "Pencils", "Notebooks" };
			Arrays.stream(schoolbag).filter(x->x.startsWith("P")).sorted().forEach(System.out::println);
			System.out.println();
			
			

	}

}
