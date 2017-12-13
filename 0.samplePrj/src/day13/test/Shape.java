package day13.test;

public abstract class Shape {	//Shape 클래스는 객체 생성 불가
	protected double area;
	protected String name;
	
	public abstract void calculationArea();
	
	@Override
	public String toString() {		
		return "["+name+", 면적 : "+area+"]";
	}
}
