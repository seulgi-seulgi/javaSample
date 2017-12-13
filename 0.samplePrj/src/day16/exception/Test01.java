package day16.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main start");
		String name = null;
		if (name != null && name.length() > 0) // Unchecked Exception. try, catch보다 if문으로 잡는 것이 적절
			System.out.println(name.charAt(0));

		try {
			// Class.forName("Sample");	//Checked Exception. try, catch 필요
			Class.forName("day16.exception.Sample");	// full path 필요
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("클래스 이름 확인 필요");
		}

		// finally System.out.println(""); //try, catch 없이 사용 불가
		System.out.println("main end");
	}

}

class Sample {

}