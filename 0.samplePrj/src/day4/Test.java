package day4;

public class Test {

	public static void main(String[] args) {

		System.out.println(0.1 == 0.1);
		System.out.println(0.1d == 0.1d);
		System.out.println(0.1f == 0.1f);
		System.out.println(0.1d == 0.1f);	// false
		System.out.println(0.1d == (double)0.1f);	// false
		System.out.println((float)0.1d == 0.1f);	// true
		
		
	}

}
