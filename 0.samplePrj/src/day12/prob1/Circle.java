package day12.prob1;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String name, double radius) {
		//super();
		//super.setName(name);
		super(name);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		//super.area = Math.PI*getRadius()*getRadius();
		area = Math.PI*radius*radius;	//protected area
	}
	
	
}
