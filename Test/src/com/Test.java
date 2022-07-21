package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		/*
		 * System.out.println(IntStream .range(1, 5) .sum());
		 */
//		System.out.println();
		
		
		/*
		 * Stream.of("Abc","Def","Xyz","Aaa") .sorted() .findFirst()
		 * .ifPresent(System.out::println);
		 */
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Al");
		list.add("Ankit");
		list.add("Kaushal");
		list.add("Brent");
		list.add("Sarika");
		list.add("Amanda");
		list.add("Sam");
		list.add("Shivika");
		list.add("Hans");
		list.add("Shiva");
		
		list.stream().filter(s-> s.startsWith("S")).forEach(s->System.out.print(s));		
		
//		list.stream()
//			.filter(x->x.startsWith("S"))
//			.sorted(Comparator.reverseOrder())
//			.forEach(System.out::println);
		
//		list.stream()
//			.map(String::toLowerCase)
//			.filter(x->x.startsWith("a"))
//			.forEach(System.out::println);
		
		String str = "my name is lovely";
		
		
		
		Map<Character, Long> abc = str.chars()
			.filter(c -> Character.isWhitespace(c) == false) // ignoring space
			.mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//			.entrySet()
//			.stream()
//			.max(Map.Entry.comparingByValue())
//			.map(p -> Pair.of(p.getKey(), p.getValue()));
//			.orElse(Pair.of(Character.MIN_VALUE, -1L));
		System.out.println(abc);
		
//		str.chars()
//			.forEach(x-> abc.get(x) == 2);
//			.collect();
		
	}

}
