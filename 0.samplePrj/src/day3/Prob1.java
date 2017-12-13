	/*
	  ====  제출하세요 Prob1_이름.java======
	  
package day3;
public class Prob1 {
	public static void main(String[] args) {

        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.

	char ch = 'P';
	char lowerCase = ________삼항 연산 자로 처리________;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);


 아래는 변수 num의 값에따라  양수 음수 0을 출력하는 코드입니다.
삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 

	int num = -90;


	
	}
}          
	 */

package day3;

public class Prob1 {

	
	public static void main(String[] args) {
	
		/*
		char ch = 'P';
		int ch1 = ch;
		int result = ch1 + 32;
		char lowerCase = ('a' <= ch && ch <= 'z') ? ch : (('A'<= ch && ch <= 'Z') ? (char)result : ' ');
		
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase : " +lowerCase);
		
		
		int num = -90;
		String result1 = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		System.out.println(result1);		
		

		// 과제 풀이
		
		/*
		char c='a', d='A';
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// a 97 , A 65
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// b 98 , B 66
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// c 99 , C 67
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));
		System.out.println(c+" " + (int)(c++) + " , " + d + " " + (int)(d++));	// j 106 , J 74

		// 코드의 중복이 없도록 루프 사용 필요

		*/
		
		char ch = 'f';
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char) (ch + 32) : ch ;
		System.out.print("ch:" +ch);
		System.out.println(" to lowerCase : " +lowerCase);
		
		
		int num = -90;
		
		String result = (num > 0) ? "양수" : (num < 0 ? "음수" : "0") ;
		System.out.println(num + " : " + result);
		
		
	}

}










