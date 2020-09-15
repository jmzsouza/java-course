package section10.lists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VL094Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// Add elements
		list.add("Paul");
		list.add("Jane");
		list.add("Sarah");
		list.add("Jennifer");
		list.add(2, "Peter");

		// Size of list
		System.out.println(list.size());

		// For each to display elements
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------");

		// Remove element with the initial 'P' character
		list.removeIf(x -> x.charAt(0) == 'P');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------");

		// Index
		System.out.println("Index of Jane " + list.indexOf("Sarah"));
		System.out.println("Index of Jane " + list.indexOf("Peter"));
		System.out.println("-----------");

		// New list with only initial character elements 'J'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------");

		// Find the first one in the list with the initial 'G' character
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
	}

}
