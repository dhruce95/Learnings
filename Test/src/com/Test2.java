package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		Stream<String> data = Files.lines(Paths.get("./resource/data.txt"));
		data
			.map(x->x.split(","))
			.filter(x->x.length==3)
			.filter(x->Integer.parseInt(x[1])>15)
			.forEach(x->System.out.println(x[0]+","+x[1]+","+x[2]));
		data.close();
		
		Stream<String> data2 = Files.lines(Paths.get("./resource/data.txt"));
		Map<String, Integer> map = new HashMap<>(); 
		map = data2
			.map(x->x.split(","))
			.filter(x->x.length==3)
			.filter(x->Integer.parseInt(x[1])>15)
			.sorted()
			.collect(Collectors.toMap(
					x->x[0], 
					x->Integer.parseInt(x[1])));
		
		data2.close();
		for(String key: map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
