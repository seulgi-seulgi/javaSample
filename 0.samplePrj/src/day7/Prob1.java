// 풀이
package day7;

public class Prob1 {

	public String leftPad(String str, int size, char padChar) {

		String result = "";
				if (str.length() > size) {
			return str;
		}
		// int tmp = size - str.length()
		for (int i = 0; i < size - str.length(); i++) {
			result += padChar;
			// str = padChar+str;
		}
		return result + str;
		// return str;
	}

	public static void main(String[] args) {
		Prob1 p = new Prob1();
		System.out.println(p.leftPad("SDS", 9, '@'));	//@@@@@@SDS
		System.out.println(p.leftPad("SDS", 9, '@').equals("@@@@@@SDS")); //테스트 과정(예측, 검증)
		
		System.out.println(p.leftPad("sds", 2, '&'));	//sds
		System.out.println(p.leftPad("sds", 2, '&').equals("sds"));
		}
}
