package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


class ABC implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}

public class Demo1 {
	
	public static void main(String[] args) {
		
		
		//basicDemo1();
		someIntermidiateOperation();
	}
	
	
	public static void someIntermidiateOperation()
	{
		Stream<Integer> myStream = Stream.of(15,74,0,58,9); // creation of stream
		
		/*
		int result = myStream.min(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
			
		}).get();
		
		*/
		int result = myStream.min((o1,o2) -> o1-o2).get();
		System.out.println(result);
		
	}
	
	
	public static void basicDemo1()
	{
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(102);
		list.add(120);
		list.add(112);
		
		// approach 1 
		ABC abc = new ABC();
		list.stream().forEach(abc);
		
		// --- approach 2
		System.out.println("\n\n---------------------------------------------");
		list.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
		
		
		// --- approach 3
		System.out.println("\n\n---------------------------------------------");

		list.stream().forEach((t)->{
				System.out.println(t);
		});
		
		// --- approach 4
		System.out.println("\n\n---------------------------------------------");
		list.stream().forEach((t)->System.out.println(t));

	}

}
