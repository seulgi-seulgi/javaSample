package day3;

public class P120 {

	public static void main(String[] args) {
		
		char c = '!';
		
		boolean f1, f2;
		boolean result4 = (f1='0' <= c) && (f2=c <= '9');
		
		
		System.out.println(result4);

		boolean result = '0' <= c && c <= '9';
		boolean result1 = 48 <= c && c <= 57;
		
		System.out.println(c + " 숫자 ? " + result);
		System.out.println(c + " 숫자 ? " + result1);
					
		System.out.println('0'+ " => " +((int)'0'));
		System.out.println('9'+ " => " +((int)'9'));
		
		char b = 'b';
		System.out.println('a' + "=> " + ((int)'a'));
		System.out.println('z' + "=> " + ((int)'z'));
		
		// boolean result2 = 
		
				
		System.out.println(Integer.toBinaryString(11)); // P127
		System.out.println("  " + Integer.toBinaryString(3));
		System.out.println("   " + (11 & 3));	
		System.out.println("  " + Integer.toBinaryString(11 & 3));
		
		
		
		
		
	}

}
