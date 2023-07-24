package day06.misc;

import java.util.ArrayList;

import java.util.List;

public class ArrayListQ2 {

	public static void main(String[] args) {

		List<Character> chars = new ArrayList<>();

		chars.add('a');

		chars.add('b');

		chars.clear();

		chars.remove(0);

		System.out.println(chars.isEmpty() + " " + chars.size());

	}

}
