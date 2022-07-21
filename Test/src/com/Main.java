package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = getPeople();
		
//		List<Person> females = people.stream()
//			.filter(x->x.getGender().equals(Gender.FEMALE))
//			.collect(Collectors.toList());
		
//		females.forEach(System.out::println);
		
//		people.stream()
//			.sorted(Comparator.comparing(Person::getAge).reversed())
//			.forEach(System.out::println);
		
		Map<Object, Object> map = people.stream()
			.filter(x->x.getName().startsWith("A"))
			.collect(Collectors.toMap(Person::getName, Person::getAge));
		System.out.println("map"+map);
	}
	
	private static List<Person> getPeople(){
		return List.of(
				new Person("James Bond", 20, Gender.MALE),
				new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE),
				new Person("Alex Boz", 14, Gender.MALE),
				new Person("Jaime Goa", 99, Gender.MALE),
				new Person("Anna Cook", 7, Gender.FEMALE),
				new Person("Zelda Brown", 120, Gender.FEMALE)
		);
	}
}
