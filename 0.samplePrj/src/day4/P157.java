package day4;

public class P157 {

	public static void main(String[] args) {

		/*
		int count = 0;
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);
		System.out.println("Hello java" + count++);	// 코드 중복 발생
		
		*/	
		
		for(int count=0; count<5; count++){
			
			System.out.println("Helo java  " + count);
		}

		System.out.println("영어 소문자 코드값 확인");
		for(char c='a'; c <= 'z' ; c++){
			System.out.println(c + " : " +(int)c);
			
		}
		
		//풀이
		System.out.println("영어 소문자 코드값 확인");
		char a = 'a', d = 'A';
		int count;
		for(count=0; count<26;count++){
			System.out.println(a+" "+ (int)a++ +", "+ d+" "+(int)d++);
		}
		System.out.println(count);
		System.out.println(a);
		
	}

}
