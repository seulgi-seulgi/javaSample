package day7;

public class Prob1_yiseulgi {

	public static void main(String[] args) {

		Prob1_yiseulgi prob1 = new Prob1_yiseulgi();

		System.out.println(prob1.leftPad("SDS", 6, '#'));
		System.out.println(prob1.leftPad("SDS", 5, '$'));
		System.out.println(prob1.leftPad("SDS", 2, '&'));
	}

	public String leftPad(String str, int size, char padChar) {
		if (size > str.length()) {
			String temp = "";
			for (int i = 0; i < size - str.length(); i++) {
				temp = temp + padChar;
			}
			str = temp + str;
		}
		return str;

	}

}
