package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class NGTest {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Jigar");
		map.put(25, "Dhruv");
		map.put(11, "Bob");
		map.put(19, "Jigar");
		map.put(34, "Jessy");
		
		TreeMap<Integer, String> treemap = new TreeMap<>(map);
		
		System.out.println(treemap);
		Map m =
		treemap.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));
		
		System.out.println(m);
	}

}
