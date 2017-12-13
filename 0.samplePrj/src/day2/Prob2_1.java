package day2;

public class Prob2_1 {

	/*
	 1. Byte
	 2. System.out.println('1'+'2');
	 3.  f. new_ 
	 4. a. byte b = 256; 
	 	b. char c = ''; 
	 	c. char answer = 'no'; 
	 	e. double d = 1.4e3f;
	 5. true
	 	false
	 	2
	 	5
	 	68
	 	69
	 	69
	 	70
	 */
	public static void main(String[] args) {
		
		System.out.println(1+2);
		System.out.println('1'+'2'); //?? -> int로 promotion 발생
		System.out.println("1"+"2");
		System.out.println("~~ "+1+2);
		System.out.println(1+2+"~~");
		System.out.println("Hello"+"java"+'1');
		
		
		// 숫자외에는 변수의 첫글자로 사용 가능 (특수문자 $_)
		int $ystem = 0; //??
		// int num#5 = 0;
		// int 7num = 0;
		int 자바 = 0; //?
		// int new = 0;
		int new_ = 0;
		int $MAX_NUM = 0; //?
		// int hello@com = 0;
		
		// byte b = 256;
		// char c = '';
		// float f = 3.14;
		double d = 1.4e3f;
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
			
		
		
	}

}
