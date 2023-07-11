package day04.misc.reptiles;

import day04.misc.mammals.Hare;

public class Tortoise extends Hare {

	protected void race(Hare hare) {

		hare.init(); // x1

		this.race(); // x2

		System.out.print("tortoise-");

	}

	public static void main(String[] args) {

		Tortoise tortoise = new Tortoise();

		Hare hare = new Hare();

		tortoise.race(hare);

	}

}
