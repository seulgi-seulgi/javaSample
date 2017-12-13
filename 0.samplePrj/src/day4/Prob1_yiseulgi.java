/* Prob1. 클래스의 main() 에서
 주어진 문자 내용을 역순으로 출력하할 수 있도록 
 main 메서드를 작성하세요. 
 
-	문자열 내용을 역순으로 출력
-	입력으로 주어진 문자열  :   "Java Programming" 

처리 결과의 예 : 
gnimmargorP avaJ

package day4;
public class Prob1 {
	public static void main(String[] args) {
		String strData  =  "Java Programming";
		// TODO
	}
}
*/

package day4;

public class Prob1_yiseulgi {

	public static void main(String[] args) {

		String strdata = "Java Programming";
		// System.out.println(strdata.length());
		// System.out.println(strdata.charAt(0));
		// System.out.println(strdata.charAt(15));

		for (int i = 0; i <= 15; i++) {
			System.out.print(strdata.charAt(15 - i));
		}
		System.out.println();
		// 풀이
		
		String name = "Java Programming"; 
		int index = name.length()-1;
		
		for(index=15; index>=0;index--){
			System.out.print(name.charAt(index));
			
		}
	}

}
