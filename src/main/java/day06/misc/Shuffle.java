package day06.misc;

import java.util.*;

public class Shuffle {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("cse");
		list.add("Mech");
		list.add("eee");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
