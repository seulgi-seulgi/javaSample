package day5;

import java.util.Arrays;

public class Prob1_yiseulgi {

	public static void main(String[] args) {

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
		
		

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.
		char[] str;
		str = new char[sourceString.length()];

		char[] tmp;
		tmp = new char[sourceString.length()];

		// System.out.println(sourceString.charAt(0)); //44

		int i = 0;
		for (i = 0; i < str.length; i++) {
			str[i] = sourceString.charAt(i);
		}

		System.out.println(Arrays.toString(str));

		for (i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && 'x' > str[i]) {
				tmp[i] = (char) (str[i] + 3);
			} else if (str[i] >= 'x' && str[i] <= 'z') {
				tmp[i] = (char) (str[i] - 23);

			}
		}
		
		System.out.println(Arrays.toString(tmp));
		String encodedString = new String(tmp);
		
		// 프로그램 구현부 끝.

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}
}
