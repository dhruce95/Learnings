package IntegerPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddNumbersFromOneListToOther {
	
	public static void main(String[] args) {
		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(5);
//		list1.add(3);
//		list1.add(8);
//		ArrayList<Integer> list2 = new ArrayList<>();
//		list2.add(2);
//		list2.add(4);
		
		List<Integer> list1 = List.of(new Integer[] {3,5,8});
		List<Integer> list2 = List.of(new Integer[] {2,4});
		
		list1.stream().collect(Collectors.toCollection(() -> list2));
//		list2.stream() stream().collect(Collectors.toList());
		list2.forEach(System.out::println);
		
	}
	

}
