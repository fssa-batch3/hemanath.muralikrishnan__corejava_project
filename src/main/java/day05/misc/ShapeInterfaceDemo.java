package day05.misc;

interface ShapeInf {
	public void draw();
}

interface Boundary {
	public void calculateBoundary();
}

class Rectangle3 implements ShapeInf, Boundary {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle by implementing inf");
	}

	@Override
	public void calculateBoundary() {
		System.out.println("Calculating Rectangle Boundary");

	}
}

class Square2 implements ShapeInf, Boundary {
	@Override
	public void draw() {
		System.out.println("Drawing a square by implementing inf");
	}

	@Override
	public void calculateBoundary() {

		System.out.println("calculating Sqaure Boundary");
	}
}

public class ShapeInterfaceDemo {
	public static void main(String[] args) {

//		creating instance of rectangle shape
		Rectangle3 rectangle = new Rectangle3();
//		referring the draw from the shape interface
		ShapeInf rectangleShape = rectangle;
		rectangleShape.draw();

//		referring the calc boundary from the boundary interface
		Boundary rectangleBoundary = rectangle;
		rectangleBoundary.calculateBoundary();

//		creating instance of square shape
		Square2 square = new Square2();
//		referring the draw from the shape interface
		ShapeInf squareShape = square;
		squareShape.draw();

//		referring the calc boundary from the boundary interface
		Boundary squareBoundary = square;
		squareBoundary.calculateBoundary();
	}
}
