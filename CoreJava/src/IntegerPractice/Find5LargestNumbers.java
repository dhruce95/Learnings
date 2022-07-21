package IntegerPractice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find5LargestNumbers {
	//Input: {1,54,5,99,9,2,3,11,29,0,213}
	//Output: {213,11,99,54,29}
	public static void main(String[] args) {
		int i = 5;
		System.out.println((""+i) instanceof String);
		int[] input = {1,54,5,99,9,2,3,11,29,0,213};
		calculate(List.of(new Integer[] {1,54,5,99,9,2,3,11,29,0,213}));
	}
	
	public static void calculate(List<Integer> list) {
//		list.stream().sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);
		List<Integer> li = list.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
		System.out.println("Ans::"+li.indexOf(li.get(1)));
		li.forEach(System.out::println);
	}

}
