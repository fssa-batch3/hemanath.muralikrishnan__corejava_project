package day04.practice;

public class RightAngleTriangle extends Polygon {

	protected double height;
	protected double base;
	protected double hypo;

	public RightAngleTriangle(double height, double base) throws Exception {
		super(3);
		if (height <= 0 || base <= 0) {
			throw new Exception("Invalid dimensions for a right angle triangle");
		}
		this.height = height;
		this.base = base;
	}

	public RightAngleTriangle(double height, double base, double hypo) throws Exception {
		super(3);
		if (height <= 0 || base <= 0 || hypo <= 0) {
			throw new Exception("Invalid dimensions for a right angle triangle");
		}
		this.height = height;
		this.base = base;
		this.hypo = hypo;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (1 / 2) * this.height * this.base;
	}

	@Override
	public double circumFerence() {

		return height + base + hypo;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}
