package day16.lang;

public class Test {

	public static void main(String[] args) {
		int x= 999;
		System.out.println(x);
		Data data = new Data();
		System.out.println(data.x);
		Test.change(data);
		System.out.println(data.x);
		
		
		
		System.arraycopy(null, srcPos, dest, destPos, length);

	}
	
	public static void change(Data d){
		d.x=99;
	}
}

class Data{
	int x;
	int y;
	
}

