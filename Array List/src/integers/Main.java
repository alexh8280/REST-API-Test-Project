package integers;
import java.util.*;


public class Main {
	
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		numbers.add(14);
		numbers.add(32);
		numbers.add(8);
		numbers.add(12);
		numbers.add(3);
		numbers.add(21);
		
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		ListIterator<Integer> iterate = numbers.listIterator();
		while (iterate.hasNext()) {
		if (iterate.next() % 2 == 0) {
			iterate.remove();
		}}
		System.out.println(numbers);
		
		
		
		
		
	}
	
}
