package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list =  new ArrayList<>();
		
		list.add("Rafael");
		list.add("Renato");
		list.add("Rodrigo");
		list.add("Lucca");
		list.add("Carla");
		list.add(5, "Osvaldo");
		list.add(0, "Ana");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		
		list.removeIf(x -> x.charAt(0) == 'O');
		for(String x : list) {
			System.out.println(x);
		
		}
		
		System.out.println("-----------------");
		System.out.println(list.indexOf("Rafael"));
		System.out.println(list.indexOf("Ana"));
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		
		}
		System.out.println("-----------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse("qualquerCoisa");
		System.out.println(name);
		
		
		sc.close();

	}

}
