package day13.test;

public abstract class Shape {	//Shape Ŭ������ ��ü ���� �Ұ�
	protected double area;
	protected String name;
	
	public abstract void calculationArea();
	
	@Override
	public String toString() {		
		return "["+name+", ���� : "+area+"]";
	}
}
