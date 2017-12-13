package day16.lang;

import java.util.Arrays;

public class P469 {

	public static void main(String[] args) {
		String[] ss = { "x", "aa", "bb", "44" };
		System.out.println(Arrays.toString(ss));
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println();

		// compareTo �޼ҵ� (return type ����)
		System.out.println("x".compareTo("aa")); // 23 (���, x�� �� ũ��)
		System.out.println("aa".compareTo("bb")); // -1 (����, aa�� �� �۴�)
		System.out.println("aa".compareTo("aa")); // 0 (0, ���� ����)
		System.out.println();

		String msg = "Hello java test..";
		char[] ssss = msg.toCharArray();
		System.out.println(msg);
		System.out.println(Arrays.toString(ssss));
		System.out.println(ssss);
		System.out.println();
		
		// indexOf �޼ҵ�		
		int idx1 = msg.indexOf('j');
		int idx2 = msg.indexOf('k');
		System.out.println(idx1); // 6
		System.out.println(idx2); // -1 <- �� ã���� -1 ��ȯ

		int idx3 = msg.indexOf('H', 0);
		int idx4 = msg.indexOf('k');
		System.out.println(idx3);
		System.out.println(idx4); // -1 <- �� ã���� -1 ��ȯ

		int idx5 = msg.indexOf("Hello");
		int idx6 = msg.indexOf("java");
		int idx7 = msg.indexOf("hello");
		System.out.println(idx5);
		System.out.println(idx6);
		System.out.println(idx7);

		// substring �޼ҵ�
		System.out.println(msg.substring(3)); // lo java test..
		System.out.println(msg.substring(10)); // test..
		System.out.println(msg.substring(5, 9)); // jav
		System.out.println(msg.substring(0, 17)); // Hello java test..

		System.out.println(msg.substring(msg.indexOf('t'))); // test..
		System.out.println(msg.substring(msg.indexOf(' '))); // java test..
		System.out.println(msg.substring(msg.lastIndexOf(' '))); // test..
		System.out.println(msg.substring(msg.lastIndexOf(' ') + 1)); // test..

		// split �޼ҵ�
		String data = "ȫ�浿 / 90/70/77";
		String[] datas = data.split("/");

		// for(int i =0 ; i<datas.length ; i++){
		// System.out.println(datas[i].trim());
		// }
		int sum = 0;
		for (int i = 1; i < datas.length; i++) {
			sum += Integer.parseInt(datas[i].trim());
		}
		System.out.printf("�̸� : %s ���� : %d ��� : %f", datas[0], sum, sum / 3.0);
	}
}
