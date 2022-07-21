package zalando;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

public class Task3 {
	public static void main(String[] args) {

		String[] str1 = new String[] { "039", "4", "14", "32", "", "34", "7" };
		String[] str2 = new String[] { "801234567", "180234567", "0", "189234567", "891234567", "98", "9" };
		String[] str3 = new String[] { "5421", "245", "1452", "0345", "", "53", "354" };
		findNoOfEmployee(str1);
		findNoOfEmployee(str2);
		findNoOfEmployee(str3);
	}

	public static void findNoOfEmployee(String[] arr) {

		Map<Integer, List<Integer>> map = dayWiseEmployeeList(arr);
		System.out.println(map);

		List<String> uniquePairOfDays = getUniquePairOfDays();

		Map<String, Set<Integer>> finalMap = new HashMap<>();
		
		uniquePairOfDays.stream().forEach(n -> {
			String[] st = n.split("-");
			Set<Integer> newSet = new HashSet<>();
			for (String s : st) {
				if (map.get(Integer.parseInt(s)) != null)
					newSet.addAll(map.get(Integer.parseInt(s)));
			}
			finalMap.put(n, newSet);
		});
		System.out.println("finalMap::"+finalMap);
		finalMap.entrySet().stream()
				.sorted(Comparator.comparingInt(e -> ((Set<Integer>) ((Entry) e).getValue()).size()).reversed())
				.map(e -> e.getValue()).limit(1).map(f -> f.size()).forEach(System.out::println);

	}

	private static List<String> getUniquePairOfDays() {
		List<String> uniquePairOfDays = new ArrayList<>();
		IntStream.rangeClosed(0, 9).forEach(x -> {
			IntStream.rangeClosed(x, 9)
				.filter(d -> d != x)
				.forEach(y -> {
				uniquePairOfDays.add(x + "-" + y);
			});
		});
		return uniquePairOfDays;
	}

	private static Map<Integer, List<Integer>> dayWiseEmployeeList(String[] arr) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			char[] ch = arr[i].toCharArray();
			for (char z : ch) {
				List<Integer> li = new ArrayList<>();
				int temp = Integer.parseInt("" + z);
				if (map.get(temp) != null) {
					li = map.get(temp);
				}
				li.add(i);
				map.put(temp, li);
			}
		}
		return map;
	}
}
