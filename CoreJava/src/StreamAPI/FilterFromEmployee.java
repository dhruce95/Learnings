package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

//Filter 
public class FilterFromEmployee {
	public static void main(String[] args) {
		filterEmp(getEmployee());
	}
	
	public static void filterEmp(List<Employee> list) {
		List result = list.stream().filter(x->x.getCity().equals("Pune")).map(Employee::getName)
			.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	
	private static List<Employee> getEmployee(){
		return List.of(
				new Employee(1, "James Bond", "Mumbai"),
				new Employee(2, "Alina Smith", "Pune"),
				new Employee(3, "Helen White", "Pune"),
				new Employee(4, "Alex Boz", "Pune"),
				new Employee(5, "Jaime Goa", "Mumbai"),
				new Employee(6, "Anna Cook", "Mumbai"),
				new Employee(7, "Zelda Brown", "Mumbai")
		);
	}
}
