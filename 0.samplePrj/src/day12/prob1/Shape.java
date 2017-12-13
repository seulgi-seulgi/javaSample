package day12.prob1;

public abstract class Shape {

	protected double area;
	private String name;

	public Shape() {
		super();
		
	}
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	
	/*
	public Shape(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}
	*/
		
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void calculationArea();

	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("의 면적은 ");
		sb.append(area);
		System.out.println(sb.toString());
	}
}
