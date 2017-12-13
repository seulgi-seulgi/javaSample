package day5;

import java.util.Arrays;

public class Prob3 {

	public static void main(String[] args) {

		String msg1 = "Hello";

		/*
		 * ===== [*]문제를 제출하세요 =======
		 * 
		 * [*] 고전 암호학(Classical Cryptography)에서 사용하는 기법 중 “Caesar Cipher” 는 암호화의
		 * 대상이 되는 각각의 문자들을 알파벳 상의 세번째 오른쪽 문자로 치환하는 간단한 치환 암호기법 (즉, a는 d로, b는 e로,
		 * … , x는 a로, y는 b로, z는 c로)입니다. “everyday we have is one more than we
		 * deserve” 라는 문자열에 대해 Caesar Cipher 를 적용하여 암호화된 문자열 값을 아래와 같이 출력하도록
		 * Prob1의 클래스의 main 함수를 완성하십시오. (단, 공백에 대해서는 치환을 적용하지 않습니다.)
		 * 
		 * 암호화할 문자열 : everyday we have is one more than we deserve 암호화된 문자열 :
		 * hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		 * 
		 * package day5; public class Prob1 {
		 * 
		 * public static void main(String[] args) { String sourceString =
		 * "everyday we have is one more than we deserve"; String encodedString
		 * = "";
		 * 
		 * // 프로그램을 구현부 시작. // 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.
		 * 
		 * // 프로그램 구현부 끝.
		 * 
		 * System.out.println("암호화할 문자열 : " + sourceString);
		 * System.out.println("암호화된 문자열 : " + encodedString); } }
		 */

		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		for (int i = 0; i < sourceString.length() - 1; i++) {
			char c = sourceString.charAt(i);
			if (c == 'x' || c == 'y' || c == 'z') {

				encodedString += (char) (c - 23);
			} else if (c == ' ') {
				encodedString += c;
			} else {
				encodedString += (char) (c + 3);
			}

		}
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

		System.out.println("=====================================");

		String msg = "hello Java";
		char[] s = msg.toCharArray();
		char[] t = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			if ('A' <= s[i] && s[i] <= 'Z') {
				t[i] = (char) (s[i] + 32);
			} else if (s[i] == ' ') {
				t[i] = s[i];
			} else {
				t[i] = (char) (s[i] - 32);
			}
		}
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		String name = new String("홍길동");
		String msg2 = new String(t);
		
		System.out.println(msg);
		System.out.println(msg2);
		
		
		
		
	}

}
