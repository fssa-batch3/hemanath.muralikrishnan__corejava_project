package day08.misc;

import java.util.HashMap;
import java.util.TreeMap;

public class NameCount {

	public static void main(String[] args) {

		String[] arrNames = { "Prathiusha", "Naresh", "Prathiusha", "Vishali", "Naresh", "Prathiusha" };

		TreeMap<String, Integer> countMap = new TreeMap<String, Integer>();

		for (String name : arrNames) {

			int count = 1;
			boolean check = countMap.containsKey(name);

			if (check) {

				countMap.put(name, countMap.get(name) + 1);
			} else {

				countMap.put(name, count);
			}
		}

		System.out.println(countMap);
	}

}
