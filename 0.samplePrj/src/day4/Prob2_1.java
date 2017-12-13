package day4;

import java.util.Scanner;

public class Prob2_1 {

	public static void main(String[] args) {

		// 예제 )문자열 참조변수 msg 가 "yes" 일때 true 인 조건식
		Scanner scanner = new Scanner(System.in);

		System.out.println("'yes'를 입력하세요.");
		String msg = scanner.nextLine();

		if (msg.equals("yes")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
