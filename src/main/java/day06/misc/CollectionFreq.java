package day06.misc;

import java.util.*;

public class CollectionFreq {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("cse");
		list.add("cse");
		list.add("eee");
		int cnt = Collections.frequency(list, "cse");
		System.out.println(cnt);
	}
}
