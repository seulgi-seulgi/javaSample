package day4;

import java.util.Scanner;

public class Prob2_1 {

	public static void main(String[] args) {

		// ���� )���ڿ� �������� msg �� "yes" �϶� true �� ���ǽ�
		Scanner scanner = new Scanner(System.in);

		System.out.println("'yes'�� �Է��ϼ���.");
		String msg = scanner.nextLine();

		if (msg.equals("yes")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
