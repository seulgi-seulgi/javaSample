package day5;

import java.util.Arrays;

public class Prob3 {

	public static void main(String[] args) {

		String msg1 = "Hello";

		/*
		 * ===== [*]������ �����ϼ��� =======
		 * 
		 * [*] ���� ��ȣ��(Classical Cryptography)���� ����ϴ� ��� �� ��Caesar Cipher�� �� ��ȣȭ��
		 * ����� �Ǵ� ������ ���ڵ��� ���ĺ� ���� ����° ������ ���ڷ� ġȯ�ϴ� ������ ġȯ ��ȣ��� (��, a�� d��, b�� e��,
		 * �� , x�� a��, y�� b��, z�� c��)�Դϴ�. ��everyday we have is one more than we
		 * deserve�� ��� ���ڿ��� ���� Caesar Cipher �� �����Ͽ� ��ȣȭ�� ���ڿ� ���� �Ʒ��� ���� ����ϵ���
		 * Prob1�� Ŭ������ main �Լ��� �ϼ��Ͻʽÿ�. (��, ���鿡 ���ؼ��� ġȯ�� �������� �ʽ��ϴ�.)
		 * 
		 * ��ȣȭ�� ���ڿ� : everyday we have is one more than we deserve ��ȣȭ�� ���ڿ� :
		 * hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		 * 
		 * package day5; public class Prob1 {
		 * 
		 * public static void main(String[] args) { String sourceString =
		 * "everyday we have is one more than we deserve"; String encodedString
		 * = "";
		 * 
		 * // ���α׷��� ������ ����. // ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�.
		 * 
		 * // ���α׷� ������ ��.
		 * 
		 * System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		 * System.out.println("��ȣȭ�� ���ڿ� : " + encodedString); } }
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
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);

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
		
		String name = new String("ȫ�浿");
		String msg2 = new String(t);
		
		System.out.println(msg);
		System.out.println(msg2);
		
		
		
		
	}

}
