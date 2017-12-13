package day16.lang;

public class Test01 {

	public static void main(String[] args) {
		Point p = new Point(1,1);	//생성자 메소드
		System.out.println(p);
		p.close();	// 자원반납 먼저
		p=null;
		
		// System.gc(); <- 메모리 정리에 들어가면 모든 서비스 중지
		
		
		System.out.println("main end");
					
	}

}

class Point implements Cloneable {
	private int x;
	private int y;
	
	public Point() {} //super(); 생략가능
		
	public Point(int x, int y) {
		//super(); 생략가능
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {	//소멸자 메소드 (자바에서는 거의 사용하지 않는다)
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() 수행");
		System.out.println("자원반납코드");
	}
	
	//finalize를 대신할 메소드를 정의한다.
	void close(){
		System.out.println(getClass().getSimpleName()+"finalize() 수행");
		System.out.println("자원반납코드");
	}
	
	@Override
	protected Point clone() {
		//Object obj = null;
		Point obj = null;
		try {
			//obj = super.clone();
			obj = (Point)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}