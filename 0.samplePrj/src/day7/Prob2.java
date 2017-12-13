// Ç®ÀÌ
package day7;

public class Prob2 {

	
	public static String leftPad(String str, int size, char padChar) {

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

	public static void main(String[] args){
		String s = Prob2.leftPad("SDS", 7, '!');
		System.out.println(s.equals("!!!!SDS"));
		System.out.println(s);
				
	}
	
}
