package day5;

import java.util.Arrays;

public class Prob1_yiseulgi {

	public static void main(String[] args) {

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
		
		

		// ���α׷��� ������ ����.
		// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�.
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
		
		// ���α׷� ������ ��.

		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);

	}
}
