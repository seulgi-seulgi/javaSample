package day13.prob1;

public class RectTriangle extends Shape {
	double width;
	double height;
	
	/*
	public RectTriangle() {
		super();
	}
	*/
	public RectTriangle(double width, double height) {
		//super();
		super(3);
		this.width = width;
		this.height = height;
	}
	
	/*
	public RectTriangle(int numSides, double width, double height) {
		super(numSides);
		super(3);
		this.width = width;
		this.height = height;
	}
	*/
	
	@Override
	public double getArea() {
		return width*height/2;
	}

}
