package day13.prob1;

public class Rectangle extends Shape implements Resizable {

	double width;
	double height;
	
	/*
	public Rectangle() {
		super();
	}
	*/
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}
	
	/*
	public Rectangle(int numSides, double width, double height) {
		super(numSides);
		this.width = width;
		this.height = height;
	}
	*/
	
	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
		//System.out.println("new area : " + getArea());

	}

}
