package day04.practice;

public class PolygonTest {
	public static void main(String[] args) {
		try {
			Polygon rec = new Rectangle(10, 5);
			RightAngleTriangle ratt = new RightAngleTriangle(20.0, 10.0);
			System.out.println("Area of rectangle and right angle trianlge");
			System.out.println(rec.calculateArea());
			System.out.println(ratt.calculateArea());

			Polygon rec2 = new Rectangle(20, 5);
			RightAngleTriangle ratt2 = new RightAngleTriangle(20.0, 10.0, 30.0);
			System.out.println("Circumference of rectangle and right anlge trianlge");
			System.out.println(rec2.circumFerence());
			System.out.println(ratt2.circumFerence());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
