package day15.inner02;

public class Test01 {

	public static void main(String[] args) {
		//B b;	���� �߻�
		// A.B b = new B();	���� �߻�
		A.B b= new A().new B();
		b.print();
		
		new A().PP();
		
		//A.S s = null;
		//s.print();
		A.S s = new A.S();
		s.print();		
	}
}

class A{
	String name = "A";
	
	void PP(){
		new B().print();
	}

	class B{
		void print(){
			System.out.println(name);		
		}
	}
	
	static class S{
		void print(){
			//System.out.println(name);	-> static Ŭ������ �ν��Ͻ� ���� ��� �Ұ�
			System.out.println("~~~~~~~~~~");
		}
	}
}

